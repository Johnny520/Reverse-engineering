.class public final Lq60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lvh;


# instance fields
.field public final d:Lb60;

.field public e:Lsi;

.field public f:La51;

.field public g:I

.field public h:I

.field public final i:Ljh0;

.field public final j:Ljh0;

.field public final k:Lk60;

.field public final l:Lh60;

.field public final m:Ljh0;

.field public final n:Lz41;

.field public final o:Ljh0;

.field public final p:Lsh0;

.field public q:I

.field public r:I

.field public final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb60;La51;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq60;->d:Lb60;

    .line 5
    .line 6
    iput-object p2, p0, Lq60;->f:La51;

    .line 7
    .line 8
    sget-object p1, Ldy0;->a:[J

    .line 9
    .line 10
    new-instance p1, Ljh0;

    .line 11
    .line 12
    invoke-direct {p1}, Ljh0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lq60;->i:Ljh0;

    .line 16
    .line 17
    new-instance p1, Ljh0;

    .line 18
    .line 19
    invoke-direct {p1}, Ljh0;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lq60;->j:Ljh0;

    .line 23
    .line 24
    new-instance p1, Lk60;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lk60;-><init>(Lq60;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lq60;->k:Lk60;

    .line 30
    .line 31
    new-instance p1, Lh60;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lh60;-><init>(Lq60;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lq60;->l:Lh60;

    .line 37
    .line 38
    new-instance p1, Ljh0;

    .line 39
    .line 40
    invoke-direct {p1}, Ljh0;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lq60;->m:Ljh0;

    .line 44
    .line 45
    new-instance p1, Lz41;

    .line 46
    .line 47
    invoke-direct {p1}, Lz41;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lq60;->n:Lz41;

    .line 51
    .line 52
    new-instance p1, Ljh0;

    .line 53
    .line 54
    invoke-direct {p1}, Ljh0;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lq60;->o:Ljh0;

    .line 58
    .line 59
    new-instance p1, Lsh0;

    .line 60
    .line 61
    const/16 p2, 0x10

    .line 62
    .line 63
    new-array p2, p2, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-direct {p1, p2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lq60;->p:Lsh0;

    .line 69
    .line 70
    const-string p1, "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."

    .line 71
    .line 72
    iput-object p1, p0, Lq60;->s:Ljava/lang/String;

    .line 73
    .line 74
    return-void
.end method

.method public static final c(Lq60;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq60;->d:Lb60;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq60;->h()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lq60;->m:Ljh0;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljh0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lb60;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget v3, p0, Lq60;->r:I

    .line 18
    .line 19
    if-lez v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v3, "No pre-composed items to dispose"

    .line 23
    .line 24
    invoke-static {v3}, Lw10;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lph0;

    .line 32
    .line 33
    iget-object v3, v3, Lph0;->d:Lsh0;

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Lsh0;->i(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lph0;

    .line 44
    .line 45
    iget-object v4, v4, Lph0;->d:Lsh0;

    .line 46
    .line 47
    iget v4, v4, Lsh0;->f:I

    .line 48
    .line 49
    iget v5, p0, Lq60;->r:I

    .line 50
    .line 51
    sub-int/2addr v4, v5

    .line 52
    if-lt v3, v4, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string v4, "Item is not in pre-composed item range"

    .line 56
    .line 57
    invoke-static {v4}, Lw10;->b(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    iget v4, p0, Lq60;->q:I

    .line 61
    .line 62
    add-int/2addr v4, v2

    .line 63
    iput v4, p0, Lq60;->q:I

    .line 64
    .line 65
    iget v4, p0, Lq60;->r:I

    .line 66
    .line 67
    add-int/lit8 v4, v4, -0x1

    .line 68
    .line 69
    iput v4, p0, Lq60;->r:I

    .line 70
    .line 71
    iget-object v4, p0, Lq60;->i:Ljh0;

    .line 72
    .line 73
    invoke-virtual {v4, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Li60;

    .line 78
    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    invoke-static {v1}, Lq60;->e(Li60;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lph0;

    .line 89
    .line 90
    iget-object v1, v1, Lph0;->d:Lsh0;

    .line 91
    .line 92
    iget v1, v1, Lsh0;->f:I

    .line 93
    .line 94
    iget v4, p0, Lq60;->r:I

    .line 95
    .line 96
    sub-int/2addr v1, v4

    .line 97
    iget v4, p0, Lq60;->q:I

    .line 98
    .line 99
    sub-int/2addr v1, v4

    .line 100
    invoke-virtual {p0, v3, v1}, Lq60;->j(II)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v1}, Lq60;->g(I)V

    .line 104
    .line 105
    .line 106
    :cond_3
    iget-object p0, p0, Lq60;->p:Lsh0;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lsh0;->h(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_4

    .line 113
    .line 114
    const/4 p0, 0x6

    .line 115
    invoke-static {v0, v2, p0}, Lb60;->X(Lb60;ZI)V

    .line 116
    .line 117
    .line 118
    :cond_4
    return-void
.end method

.method public static e(Li60;)V
    .locals 5

    .line 1
    iget-object v0, p0, Li60;->f:Lyp0;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, Lyp0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    sget-object v2, Laq0;->e:Laq0;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lyp0;->k:Liu0;

    .line 13
    .line 14
    iget-object v2, v1, Liu0;->d:Lkh0;

    .line 15
    .line 16
    invoke-virtual {v2}, Lkh0;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v1, Liu0;->d:Lkh0;

    .line 24
    .line 25
    sget-object v4, Ley0;->a:Lkh0;

    .line 26
    .line 27
    new-instance v4, Lkh0;

    .line 28
    .line 29
    invoke-direct {v4}, Lkh0;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v4, v1, Liu0;->d:Lkh0;

    .line 33
    .line 34
    iget-object v4, v1, Liu0;->c:Lsh0;

    .line 35
    .line 36
    invoke-virtual {v4}, Lsh0;->g()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v2, v3

    .line 41
    :goto_0
    invoke-virtual {v1}, Liu0;->b()V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, Lyp0;->a:Lyi;

    .line 45
    .line 46
    iput-object v3, v0, Lyi;->t:Lyp0;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    iget-object v1, v0, Lyi;->x:Liu0;

    .line 51
    .line 52
    iput-object v2, v1, Liu0;->k:Lkh0;

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    iput v1, v0, Lyi;->z:I

    .line 56
    .line 57
    :cond_1
    iput-object v3, p0, Li60;->f:Lyp0;

    .line 58
    .line 59
    iget-object v0, p0, Li60;->c:Lyi;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Lyi;->m()V

    .line 64
    .line 65
    .line 66
    :cond_2
    iput-object v3, p0, Li60;->c:Lyi;

    .line 67
    .line 68
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, v0, Lq60;->d:Lb60;

    .line 5
    .line 6
    iput-boolean v1, v2, Lb60;->t:Z

    .line 7
    .line 8
    iget-object v1, v0, Lq60;->i:Ljh0;

    .line 9
    .line 10
    iget-object v3, v1, Ljh0;->c:[Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v4, v1, Ljh0;->a:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-ltz v5, :cond_3

    .line 19
    .line 20
    move v7, v6

    .line 21
    :goto_0
    aget-wide v8, v4, v7

    .line 22
    .line 23
    not-long v10, v8

    .line 24
    const/4 v12, 0x7

    .line 25
    shl-long/2addr v10, v12

    .line 26
    and-long/2addr v10, v8

    .line 27
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v10, v12

    .line 33
    cmp-long v10, v10, v12

    .line 34
    .line 35
    if-eqz v10, :cond_2

    .line 36
    .line 37
    sub-int v10, v7, v5

    .line 38
    .line 39
    not-int v10, v10

    .line 40
    ushr-int/lit8 v10, v10, 0x1f

    .line 41
    .line 42
    const/16 v11, 0x8

    .line 43
    .line 44
    rsub-int/lit8 v10, v10, 0x8

    .line 45
    .line 46
    move v12, v6

    .line 47
    :goto_1
    if-ge v12, v10, :cond_1

    .line 48
    .line 49
    const-wide/16 v13, 0xff

    .line 50
    .line 51
    and-long/2addr v13, v8

    .line 52
    const-wide/16 v15, 0x80

    .line 53
    .line 54
    cmp-long v13, v13, v15

    .line 55
    .line 56
    if-gez v13, :cond_0

    .line 57
    .line 58
    shl-int/lit8 v13, v7, 0x3

    .line 59
    .line 60
    add-int/2addr v13, v12

    .line 61
    aget-object v13, v3, v13

    .line 62
    .line 63
    check-cast v13, Li60;

    .line 64
    .line 65
    iget-object v13, v13, Li60;->c:Lyi;

    .line 66
    .line 67
    if-eqz v13, :cond_0

    .line 68
    .line 69
    invoke-virtual {v13}, Lyi;->m()V

    .line 70
    .line 71
    .line 72
    :cond_0
    shr-long/2addr v8, v11

    .line 73
    add-int/lit8 v12, v12, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    if-ne v10, v11, :cond_3

    .line 77
    .line 78
    :cond_2
    if-eq v7, v5, :cond_3

    .line 79
    .line 80
    add-int/lit8 v7, v7, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v2}, Lb60;->R()V

    .line 84
    .line 85
    .line 86
    iput-boolean v6, v2, Lb60;->t:Z

    .line 87
    .line 88
    invoke-virtual {v1}, Ljh0;->a()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v0, Lq60;->j:Ljh0;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljh0;->a()V

    .line 94
    .line 95
    .line 96
    iput v6, v0, Lq60;->r:I

    .line 97
    .line 98
    iput v6, v0, Lq60;->q:I

    .line 99
    .line 100
    iget-object v1, v0, Lq60;->m:Ljh0;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljh0;->a()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lq60;->h()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lq60;->i(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final d(Li60;Z)V
    .locals 6

    .line 1
    iget-object v0, p1, Li60;->f:Lyp0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-static {}, Lu50;->k()Ll21;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ll21;->e()Lsw;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v3, v2

    .line 18
    :goto_0
    invoke-static {v1}, Lu50;->s(Ll21;)Ll21;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :try_start_0
    iget-object p0, p0, Lq60;->d:Lb60;

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    iput-boolean v5, p0, Lb60;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lyp0;->c()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    new-instance p2, Lxc;

    .line 36
    .line 37
    const/16 v5, 0xe

    .line 38
    .line 39
    invoke-direct {p2, v5}, Lxc;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Lyp0;->e(Lj11;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    invoke-virtual {v0}, Lyp0;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    :try_start_2
    iput-object v2, p1, Li60;->f:Lyp0;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-boolean p1, p0, Lb60;->t:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    .line 56
    invoke-static {v1, v4, v3}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    goto :goto_3

    .line 62
    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :goto_3
    invoke-static {v1, v4, v3}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_2
    return-void
.end method

.method public final f(Ljava/lang/Object;)Lv41;
    .locals 1

    .line 1
    iget-object v0, p0, Lq60;->d:Lb60;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb60;->H()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Ln60;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Lo60;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lo60;-><init>(Lq60;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final g(I)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lq60;->q:I

    .line 3
    .line 4
    iget-object v1, p0, Lq60;->d:Lb60;

    .line 5
    .line 6
    invoke-virtual {v1}, Lb60;->o()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lph0;

    .line 12
    .line 13
    iget-object v3, v2, Lph0;->d:Lsh0;

    .line 14
    .line 15
    iget v3, v3, Lsh0;->f:I

    .line 16
    .line 17
    iget v4, p0, Lq60;->r:I

    .line 18
    .line 19
    sub-int/2addr v3, v4

    .line 20
    const/4 v4, 0x1

    .line 21
    sub-int/2addr v3, v4

    .line 22
    if-gt p1, v3, :cond_7

    .line 23
    .line 24
    iget-object v5, p0, Lq60;->n:Lz41;

    .line 25
    .line 26
    invoke-virtual {v5}, Lz41;->clear()V

    .line 27
    .line 28
    .line 29
    if-gt p1, v3, :cond_0

    .line 30
    .line 31
    move v5, p1

    .line 32
    :goto_0
    invoke-virtual {v2, v5}, Lph0;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Lb60;

    .line 37
    .line 38
    iget-object v7, p0, Lq60;->i:Ljh0;

    .line 39
    .line 40
    invoke-virtual {v7, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast v6, Li60;

    .line 48
    .line 49
    iget-object v6, v6, Li60;->a:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v7, p0, Lq60;->n:Lz41;

    .line 52
    .line 53
    iget-object v7, v7, Lz41;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, Leh0;

    .line 56
    .line 57
    invoke-virtual {v7, v6}, Leh0;->a(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    if-eq v5, v3, :cond_0

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget-object v2, p0, Lq60;->f:La51;

    .line 66
    .line 67
    iget-object v5, p0, Lq60;->n:Lz41;

    .line 68
    .line 69
    invoke-interface {v2, v5}, La51;->d(Lz41;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lu50;->k()Ll21;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {v2}, Ll21;->e()Lsw;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v5, 0x0

    .line 84
    :goto_1
    invoke-static {v2}, Lu50;->s(Ll21;)Ll21;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    move v7, v0

    .line 89
    :goto_2
    if-lt v3, p1, :cond_6

    .line 90
    .line 91
    :try_start_0
    move-object v8, v1

    .line 92
    check-cast v8, Lph0;

    .line 93
    .line 94
    invoke-virtual {v8, v3}, Lph0;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Lb60;

    .line 99
    .line 100
    iget-object v9, p0, Lq60;->i:Ljh0;

    .line 101
    .line 102
    invoke-virtual {v9, v8}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    check-cast v9, Li60;

    .line 110
    .line 111
    iget-object v10, v9, Li60;->a:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v11, p0, Lq60;->n:Lz41;

    .line 114
    .line 115
    iget-object v11, v11, Lz41;->e:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v11, Leh0;

    .line 118
    .line 119
    invoke-virtual {v11, v10}, Leh0;->c(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_3

    .line 124
    .line 125
    iget v11, p0, Lq60;->q:I

    .line 126
    .line 127
    add-int/2addr v11, v4

    .line 128
    iput v11, p0, Lq60;->q:I

    .line 129
    .line 130
    iget-object v11, v9, Li60;->g:Lgp0;

    .line 131
    .line 132
    invoke-virtual {v11}, Lgp0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    check-cast v11, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-eqz v11, :cond_5

    .line 143
    .line 144
    iget-object v8, v8, Lb60;->J:Lf60;

    .line 145
    .line 146
    iget-object v11, v8, Lf60;->p:Lwd0;

    .line 147
    .line 148
    sget-object v12, Lz50;->f:Lz50;

    .line 149
    .line 150
    iput-object v12, v11, Lwd0;->o:Lz50;

    .line 151
    .line 152
    iget-object v8, v8, Lf60;->q:Lec0;

    .line 153
    .line 154
    if-eqz v8, :cond_2

    .line 155
    .line 156
    iput-object v12, v8, Lec0;->m:Lz50;

    .line 157
    .line 158
    :cond_2
    invoke-virtual {p0, v9, v0}, Lq60;->l(Li60;Z)V

    .line 159
    .line 160
    .line 161
    iget-boolean v8, v9, Li60;->h:Z

    .line 162
    .line 163
    if-eqz v8, :cond_5

    .line 164
    .line 165
    move v7, v4

    .line 166
    goto :goto_3

    .line 167
    :catchall_0
    move-exception p0

    .line 168
    goto :goto_4

    .line 169
    :cond_3
    iget-object v11, p0, Lq60;->d:Lb60;

    .line 170
    .line 171
    iput-boolean v4, v11, Lb60;->t:Z

    .line 172
    .line 173
    iget-object v12, p0, Lq60;->i:Ljh0;

    .line 174
    .line 175
    invoke-virtual {v12, v8}, Ljh0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    iget-object v8, v9, Li60;->c:Lyi;

    .line 179
    .line 180
    if-eqz v8, :cond_4

    .line 181
    .line 182
    invoke-virtual {v8}, Lyi;->m()V

    .line 183
    .line 184
    .line 185
    :cond_4
    iget-object v8, p0, Lq60;->d:Lb60;

    .line 186
    .line 187
    invoke-virtual {v8, v3, v4}, Lb60;->S(II)V

    .line 188
    .line 189
    .line 190
    iput-boolean v0, v11, Lb60;->t:Z

    .line 191
    .line 192
    :cond_5
    :goto_3
    iget-object v8, p0, Lq60;->j:Ljh0;

    .line 193
    .line 194
    invoke-virtual {v8, v10}, Ljh0;->k(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    .line 197
    add-int/lit8 v3, v3, -0x1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :goto_4
    invoke-static {v2, v6, v5}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 201
    .line 202
    .line 203
    throw p0

    .line 204
    :cond_6
    invoke-static {v2, v6, v5}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_7
    move v7, v0

    .line 209
    :goto_5
    if-eqz v7, :cond_9

    .line 210
    .line 211
    sget-object p1, Lt21;->c:Ljava/lang/Object;

    .line 212
    .line 213
    monitor-enter p1

    .line 214
    :try_start_1
    sget-object v1, Lt21;->j:Lqx;

    .line 215
    .line 216
    iget-object v1, v1, Lnh0;->h:Lkh0;

    .line 217
    .line 218
    if-eqz v1, :cond_8

    .line 219
    .line 220
    invoke-virtual {v1}, Lkh0;->h()Z

    .line 221
    .line 222
    .line 223
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 224
    if-ne v1, v4, :cond_8

    .line 225
    .line 226
    move v0, v4

    .line 227
    :cond_8
    monitor-exit p1

    .line 228
    if-eqz v0, :cond_9

    .line 229
    .line 230
    invoke-static {}, Lt21;->a()V

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :catchall_1
    move-exception p0

    .line 235
    monitor-exit p1

    .line 236
    throw p0

    .line 237
    :cond_9
    :goto_6
    invoke-virtual {p0}, Lq60;->h()V

    .line 238
    .line 239
    .line 240
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq60;->d:Lb60;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lph0;

    .line 8
    .line 9
    iget-object v0, v0, Lph0;->d:Lsh0;

    .line 10
    .line 11
    iget v0, v0, Lsh0;->f:I

    .line 12
    .line 13
    iget-object v1, p0, Lq60;->i:Ljh0;

    .line 14
    .line 15
    iget v2, v1, Ljh0;->e:I

    .line 16
    .line 17
    if-ne v2, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "Inconsistency between the count of nodes tracked by the state ("

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget v1, v1, Ljh0;->e:I

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ") and the children count on the SubcomposeLayout ("

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "). Are you trying to use the state of the disposed SubcomposeLayout?"

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Lw10;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget v1, p0, Lq60;->q:I

    .line 53
    .line 54
    sub-int v1, v0, v1

    .line 55
    .line 56
    iget v2, p0, Lq60;->r:I

    .line 57
    .line 58
    sub-int/2addr v1, v2

    .line 59
    if-ltz v1, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "Incorrect state. Total children "

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ". Reusable children "

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget v0, p0, Lq60;->q:I

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ". Precomposed children "

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget v0, p0, Lq60;->r:I

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lw10;->a(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    iget-object v0, p0, Lq60;->m:Ljh0;

    .line 100
    .line 101
    iget v1, v0, Ljh0;->e:I

    .line 102
    .line 103
    iget v2, p0, Lq60;->r:I

    .line 104
    .line 105
    if-ne v1, v2, :cond_2

    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v2, "Incorrect state. Precomposed children "

    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget p0, p0, Lq60;->r:I

    .line 116
    .line 117
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p0, ". Map size "

    .line 121
    .line 122
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget p0, v0, Ljh0;->e:I

    .line 126
    .line 127
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lw10;->a(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final i(Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lq60;->r:I

    .line 3
    .line 4
    iget-object v1, p0, Lq60;->m:Ljh0;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljh0;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lq60;->d:Lb60;

    .line 10
    .line 11
    invoke-virtual {v1}, Lb60;->o()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Lph0;

    .line 17
    .line 18
    iget-object v2, v2, Lph0;->d:Lsh0;

    .line 19
    .line 20
    iget v2, v2, Lsh0;->f:I

    .line 21
    .line 22
    iget v3, p0, Lq60;->q:I

    .line 23
    .line 24
    if-eq v3, v2, :cond_4

    .line 25
    .line 26
    iput v2, p0, Lq60;->q:I

    .line 27
    .line 28
    invoke-static {}, Lu50;->k()Ll21;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ll21;->e()Lsw;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v4, 0x0

    .line 40
    :goto_0
    invoke-static {v3}, Lu50;->s(Ll21;)Ll21;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :goto_1
    if-ge v0, v2, :cond_3

    .line 45
    .line 46
    :try_start_0
    move-object v6, v1

    .line 47
    check-cast v6, Lph0;

    .line 48
    .line 49
    invoke-virtual {v6, v0}, Lph0;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, Lb60;

    .line 54
    .line 55
    iget-object v7, p0, Lq60;->i:Ljh0;

    .line 56
    .line 57
    invoke-virtual {v7, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Li60;

    .line 62
    .line 63
    if-eqz v7, :cond_2

    .line 64
    .line 65
    iget-object v8, v7, Li60;->g:Lgp0;

    .line 66
    .line 67
    invoke-virtual {v8}, Lgp0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    check-cast v8, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    iget-object v6, v6, Lb60;->J:Lf60;

    .line 80
    .line 81
    iget-object v8, v6, Lf60;->p:Lwd0;

    .line 82
    .line 83
    sget-object v9, Lz50;->f:Lz50;

    .line 84
    .line 85
    iput-object v9, v8, Lwd0;->o:Lz50;

    .line 86
    .line 87
    iget-object v6, v6, Lf60;->q:Lec0;

    .line 88
    .line 89
    if-eqz v6, :cond_1

    .line 90
    .line 91
    iput-object v9, v6, Lec0;->m:Lz50;

    .line 92
    .line 93
    :cond_1
    invoke-virtual {p0, v7, p1}, Lq60;->l(Li60;Z)V

    .line 94
    .line 95
    .line 96
    sget-object v6, Li4;->q:Ljo0;

    .line 97
    .line 98
    iput-object v6, v7, Li60;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catchall_0
    move-exception p0

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :goto_3
    invoke-static {v3, v5, v4}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_3
    invoke-static {v3, v5, v4}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lq60;->j:Ljh0;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljh0;->a()V

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {p0}, Lq60;->h()V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final j(II)V
    .locals 1

    .line 1
    iget-object p0, p0, Lq60;->d:Lb60;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lb60;->t:Z

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lb60;->L(III)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lb60;->t:Z

    .line 11
    .line 12
    return-void
.end method

.method public final k(Ljava/lang/Object;Lww;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq60;->d:Lb60;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb60;->H()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lq60;->h()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lq60;->j:Ljh0;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, Lq60;->o:Ljh0;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljh0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lq60;->m:Ljh0;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lq60;->n(Ljava/lang/Object;)Lb60;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lph0;

    .line 46
    .line 47
    iget-object v4, v4, Lph0;->d:Lsh0;

    .line 48
    .line 49
    invoke-virtual {v4, v2}, Lsh0;->i(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lph0;

    .line 58
    .line 59
    iget-object v0, v0, Lph0;->d:Lsh0;

    .line 60
    .line 61
    iget v0, v0, Lsh0;->f:I

    .line 62
    .line 63
    invoke-virtual {p0, v4, v0}, Lq60;->j(II)V

    .line 64
    .line 65
    .line 66
    iget v0, p0, Lq60;->r:I

    .line 67
    .line 68
    add-int/2addr v0, v3

    .line 69
    iput v0, p0, Lq60;->r:I

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lph0;

    .line 77
    .line 78
    iget-object v2, v2, Lph0;->d:Lsh0;

    .line 79
    .line 80
    iget v2, v2, Lsh0;->f:I

    .line 81
    .line 82
    new-instance v4, Lb60;

    .line 83
    .line 84
    const/4 v5, 0x2

    .line 85
    invoke-direct {v4, v5}, Lb60;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iput-boolean v3, v0, Lb60;->t:Z

    .line 89
    .line 90
    invoke-virtual {v0, v2, v4}, Lb60;->B(ILb60;)V

    .line 91
    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    iput-boolean v2, v0, Lb60;->t:Z

    .line 95
    .line 96
    iget v0, p0, Lq60;->r:I

    .line 97
    .line 98
    add-int/2addr v0, v3

    .line 99
    iput v0, p0, Lq60;->r:I

    .line 100
    .line 101
    move-object v2, v4

    .line 102
    :goto_0
    invoke-virtual {v1, p1, v2}, Ljh0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    check-cast v2, Lb60;

    .line 106
    .line 107
    invoke-virtual {p0, v2, p1, p3, p2}, Lq60;->m(Lb60;Ljava/lang/Object;ZLww;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_1
    return-void
.end method

.method public final l(Li60;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p1, Li60;->h:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Li60;->g:Lgp0;

    .line 8
    .line 9
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p1, Li60;->g:Lgp0;

    .line 22
    .line 23
    :goto_0
    iget-object v0, p1, Li60;->f:Lyp0;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Lq60;->e(Li60;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget-object p0, p1, Li60;->c:Lyi;

    .line 34
    .line 35
    if-eqz p0, :cond_5

    .line 36
    .line 37
    invoke-virtual {p0}, Lyi;->l()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object p0, p0, Lq60;->d:Lb60;

    .line 42
    .line 43
    invoke-static {p0}, Le60;->a(Lb60;)Ldn0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lw3;

    .line 48
    .line 49
    invoke-virtual {p0}, Lw3;->getOutOfFrameExecutor()Lvm0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    new-instance p2, Li7;

    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    invoke-direct {p2, v0, p1}, Li7;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast p0, Lw3;

    .line 62
    .line 63
    iget-object p1, p0, Lw3;->k:Lx8;

    .line 64
    .line 65
    invoke-virtual {p1}, Lx8;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p1, p2}, Lx8;->addLast(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iget-object p0, p0, Lw3;->l:Lg3;

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    const-string p0, "schedule is called when outOfFrameExecutor is not available (view is detached)"

    .line 87
    .line 88
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    iget-boolean p0, p1, Li60;->h:Z

    .line 93
    .line 94
    if-nez p0, :cond_5

    .line 95
    .line 96
    iget-object p0, p1, Li60;->c:Lyi;

    .line 97
    .line 98
    if-eqz p0, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Lyi;->l()V

    .line 101
    .line 102
    .line 103
    :cond_5
    return-void
.end method

.method public final m(Lb60;Ljava/lang/Object;ZLww;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lq60;->i:Ljh0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Li60;

    .line 11
    .line 12
    sget-object v3, Lrh;->a:Lmh;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, v1, Li60;->a:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v3, v1, Li60;->b:Lww;

    .line 20
    .line 21
    iput-object v2, v1, Li60;->c:Lyi;

    .line 22
    .line 23
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {p2}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, v1, Li60;->g:Lgp0;

    .line 30
    .line 31
    invoke-virtual {v0, p1, v1}, Ljh0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast v1, Li60;

    .line 35
    .line 36
    iget-object p2, v1, Li60;->b:Lww;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eq p2, p4, :cond_1

    .line 41
    .line 42
    move p2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move p2, v0

    .line 45
    :goto_0
    iget-object v4, v1, Li60;->f:Lyp0;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-static {v1}, Lq60;->e(Li60;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    if-eqz p3, :cond_3

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_3
    invoke-virtual {p0, v1, v3}, Lq60;->d(Li60;Z)V

    .line 59
    .line 60
    .line 61
    :cond_4
    :goto_1
    iget-object v4, v1, Li60;->c:Lyi;

    .line 62
    .line 63
    if-eqz v4, :cond_6

    .line 64
    .line 65
    iget-object v5, v4, Lyi;->g:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v5

    .line 68
    :try_start_0
    iget-object v4, v4, Lyi;->q:Ljh0;

    .line 69
    .line 70
    iget v4, v4, Ljh0;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    if-lez v4, :cond_5

    .line 73
    .line 74
    move v4, v3

    .line 75
    goto :goto_2

    .line 76
    :cond_5
    move v4, v0

    .line 77
    :goto_2
    monitor-exit v5

    .line 78
    goto :goto_3

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    monitor-exit v5

    .line 81
    throw p0

    .line 82
    :cond_6
    move v4, v3

    .line 83
    :goto_3
    if-nez p2, :cond_8

    .line 84
    .line 85
    if-nez v4, :cond_8

    .line 86
    .line 87
    iget-boolean p2, v1, Li60;->d:Z

    .line 88
    .line 89
    if-eqz p2, :cond_7

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_7
    :goto_4
    return-void

    .line 93
    :cond_8
    :goto_5
    iput-object p4, v1, Li60;->b:Lww;

    .line 94
    .line 95
    iget-object p2, v1, Li60;->f:Lyp0;

    .line 96
    .line 97
    if-nez p2, :cond_9

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_9
    const-string p2, "new subcompose call while paused composition is still active"

    .line 101
    .line 102
    invoke-static {p2}, Lw10;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :goto_6
    invoke-static {}, Lu50;->k()Ll21;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-eqz p2, :cond_a

    .line 110
    .line 111
    invoke-virtual {p2}, Ll21;->e()Lsw;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :cond_a
    invoke-static {p2}, Lu50;->s(Ll21;)Ll21;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    :try_start_1
    iget-object v4, p0, Lq60;->d:Lb60;

    .line 120
    .line 121
    iput-boolean v3, v4, Lb60;->t:Z

    .line 122
    .line 123
    iget-object v5, v1, Li60;->c:Lyi;

    .line 124
    .line 125
    iget-object v6, p0, Lq60;->e:Lsi;

    .line 126
    .line 127
    if-eqz v6, :cond_13

    .line 128
    .line 129
    if-eqz v5, :cond_c

    .line 130
    .line 131
    iget v7, v5, Lyi;->z:I

    .line 132
    .line 133
    const/4 v8, 0x3

    .line 134
    if-ne v7, v8, :cond_b

    .line 135
    .line 136
    move v7, v3

    .line 137
    goto :goto_7

    .line 138
    :cond_b
    move v7, v0

    .line 139
    :goto_7
    if-eqz v7, :cond_e

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :catchall_1
    move-exception p0

    .line 143
    goto/16 :goto_d

    .line 144
    .line 145
    :cond_c
    :goto_8
    if-eqz p3, :cond_d

    .line 146
    .line 147
    sget-object v5, Lye1;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 148
    .line 149
    new-instance v5, Lja1;

    .line 150
    .line 151
    invoke-direct {v5, p1}, Lja1;-><init>(Lb60;)V

    .line 152
    .line 153
    .line 154
    new-instance p1, Lyi;

    .line 155
    .line 156
    invoke-direct {p1, v6, v5}, Lyi;-><init>(Lsi;Lja1;)V

    .line 157
    .line 158
    .line 159
    :goto_9
    move-object v5, p1

    .line 160
    goto :goto_a

    .line 161
    :cond_d
    sget-object v5, Lye1;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 162
    .line 163
    new-instance v5, Lja1;

    .line 164
    .line 165
    invoke-direct {v5, p1}, Lja1;-><init>(Lb60;)V

    .line 166
    .line 167
    .line 168
    new-instance p1, Lyi;

    .line 169
    .line 170
    invoke-direct {p1, v6, v5}, Lyi;-><init>(Lsi;Lja1;)V

    .line 171
    .line 172
    .line 173
    goto :goto_9

    .line 174
    :cond_e
    :goto_a
    iput-object v5, v1, Li60;->c:Lyi;

    .line 175
    .line 176
    iget-object p1, v1, Li60;->b:Lww;

    .line 177
    .line 178
    iget-object p0, p0, Lq60;->d:Lb60;

    .line 179
    .line 180
    invoke-static {p0}, Le60;->a(Lb60;)Ldn0;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Lw3;

    .line 185
    .line 186
    invoke-virtual {p0}, Lw3;->getOutOfFrameExecutor()Lvm0;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-eqz p0, :cond_f

    .line 191
    .line 192
    iput-boolean v0, v1, Li60;->h:Z

    .line 193
    .line 194
    goto :goto_b

    .line 195
    :cond_f
    iput-boolean v3, v1, Li60;->h:Z

    .line 196
    .line 197
    new-instance p0, Lm4;

    .line 198
    .line 199
    const/4 v6, 0x2

    .line 200
    invoke-direct {p0, v6, v1, p1}, Lm4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    new-instance p1, Lmh;

    .line 204
    .line 205
    const v6, 0x5ad8c84e

    .line 206
    .line 207
    .line 208
    invoke-direct {p1, v6, v3, p0}, Lmh;-><init>(IZLex;)V

    .line 209
    .line 210
    .line 211
    :goto_b
    if-eqz p3, :cond_11

    .line 212
    .line 213
    iget-boolean p0, v1, Li60;->e:Z

    .line 214
    .line 215
    if-eqz p0, :cond_10

    .line 216
    .line 217
    invoke-virtual {v5}, Lyi;->i()Z

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Lyi;->q()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v3, p1}, Lyi;->k(ZLww;)Lyp0;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    iput-object p0, v1, Li60;->f:Lyp0;

    .line 228
    .line 229
    goto :goto_c

    .line 230
    :cond_10
    invoke-virtual {v5}, Lyi;->i()Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    invoke-virtual {v5, p0, p1}, Lyi;->k(ZLww;)Lyp0;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    iput-object p0, v1, Li60;->f:Lyp0;

    .line 239
    .line 240
    goto :goto_c

    .line 241
    :cond_11
    iget-boolean p0, v1, Li60;->e:Z

    .line 242
    .line 243
    if-eqz p0, :cond_12

    .line 244
    .line 245
    invoke-virtual {v5}, Lyi;->i()Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Lyi;->q()V

    .line 249
    .line 250
    .line 251
    iget-object p0, v5, Lyi;->y:Lpi;

    .line 252
    .line 253
    const/16 p3, 0x64

    .line 254
    .line 255
    iput p3, p0, Lpi;->z:I

    .line 256
    .line 257
    iput-boolean v3, p0, Lpi;->y:Z

    .line 258
    .line 259
    iget-object p3, v5, Lyi;->d:Lsi;

    .line 260
    .line 261
    invoke-virtual {p3, v5, p1}, Lsi;->a(Lyi;Lww;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lpi;->s()V

    .line 265
    .line 266
    .line 267
    goto :goto_c

    .line 268
    :cond_12
    invoke-virtual {v5, p1}, Lyi;->B(Lww;)V

    .line 269
    .line 270
    .line 271
    :goto_c
    iput-boolean v0, v1, Li60;->e:Z

    .line 272
    .line 273
    iput-boolean v0, v4, Lb60;->t:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 274
    .line 275
    invoke-static {p2, p4, v2}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 276
    .line 277
    .line 278
    iput-boolean v0, v1, Li60;->d:Z

    .line 279
    .line 280
    return-void

    .line 281
    :cond_13
    :try_start_2
    const-string p0, "parent composition reference not set"

    .line 282
    .line 283
    invoke-static {p0}, Lw10;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 284
    .line 285
    .line 286
    new-instance p0, Lsg;

    .line 287
    .line 288
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 289
    .line 290
    .line 291
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 292
    :goto_d
    invoke-static {p2, p4, v2}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 293
    .line 294
    .line 295
    throw p0
.end method

.method public final n(Ljava/lang/Object;)Lb60;
    .locals 10

    .line 1
    iget v0, p0, Lq60;->q:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lq60;->d:Lb60;

    .line 8
    .line 9
    invoke-virtual {v0}, Lb60;->o()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lph0;

    .line 14
    .line 15
    iget-object v1, v0, Lph0;->d:Lsh0;

    .line 16
    .line 17
    iget v1, v1, Lsh0;->f:I

    .line 18
    .line 19
    iget v2, p0, Lq60;->r:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iget v2, p0, Lq60;->q:I

    .line 23
    .line 24
    sub-int v2, v1, v2

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    sub-int/2addr v1, v3

    .line 28
    move v4, v1

    .line 29
    :goto_0
    iget-object v5, p0, Lq60;->i:Ljh0;

    .line 30
    .line 31
    const/4 v6, -0x1

    .line 32
    if-lt v4, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Lph0;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Lb60;

    .line 39
    .line 40
    invoke-virtual {v5, v7}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast v7, Li60;

    .line 48
    .line 49
    iget-object v7, v7, Li60;->a:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v7, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    move v7, v4

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    add-int/lit8 v4, v4, -0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move v7, v6

    .line 63
    :goto_1
    if-ne v7, v6, :cond_6

    .line 64
    .line 65
    :goto_2
    if-lt v1, v2, :cond_5

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lph0;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Lb60;

    .line 72
    .line 73
    invoke-virtual {v5, v4}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    check-cast v4, Li60;

    .line 81
    .line 82
    iget-object v8, v4, Li60;->a:Ljava/lang/Object;

    .line 83
    .line 84
    sget-object v9, Li4;->q:Ljo0;

    .line 85
    .line 86
    if-eq v8, v9, :cond_4

    .line 87
    .line 88
    iget-object v9, p0, Lq60;->f:La51;

    .line 89
    .line 90
    invoke-interface {v9, p1, v8}, La51;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_3

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    :goto_3
    iput-object p1, v4, Li60;->a:Ljava/lang/Object;

    .line 101
    .line 102
    move v4, v1

    .line 103
    move v7, v4

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    move v4, v1

    .line 106
    :cond_6
    :goto_4
    if-ne v7, v6, :cond_7

    .line 107
    .line 108
    :goto_5
    const/4 p0, 0x0

    .line 109
    return-object p0

    .line 110
    :cond_7
    if-eq v4, v2, :cond_8

    .line 111
    .line 112
    invoke-virtual {p0, v4, v2}, Lq60;->j(II)V

    .line 113
    .line 114
    .line 115
    :cond_8
    iget p1, p0, Lq60;->q:I

    .line 116
    .line 117
    add-int/2addr p1, v6

    .line 118
    iput p1, p0, Lq60;->q:I

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Lph0;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, Lb60;

    .line 125
    .line 126
    invoke-virtual {v5, p0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast p1, Li60;

    .line 134
    .line 135
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iput-object v0, p1, Li60;->g:Lgp0;

    .line 142
    .line 143
    iput-boolean v3, p1, Li60;->e:Z

    .line 144
    .line 145
    iput-boolean v3, p1, Li60;->d:Z

    .line 146
    .line 147
    return-object p0
.end method
