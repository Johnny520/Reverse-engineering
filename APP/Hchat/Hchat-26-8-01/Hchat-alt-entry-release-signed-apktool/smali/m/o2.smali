.class public final Lm/o2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lm/i2;

.field public b:Lk/k1;

.field public c:Lm/p;

.field public d:Lm/p1;

.field public e:Z

.field public f:Lr1/d;

.field public final g:Lm/h2;

.field public final h:Lm/c2;

.field public i:Z

.field public j:I

.field public k:Lm/u1;

.field public final l:Lm/m2;

.field public final m:Lb0/d0;


# direct methods
.method public constructor <init>(Lm/i2;Lk/k1;Lm/p;Lm/p1;ZLr1/d;Lm/h2;Lm/c2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/o2;->a:Lm/i2;

    .line 5
    .line 6
    iput-object p2, p0, Lm/o2;->b:Lk/k1;

    .line 7
    .line 8
    iput-object p3, p0, Lm/o2;->c:Lm/p;

    .line 9
    .line 10
    iput-object p4, p0, Lm/o2;->d:Lm/p1;

    .line 11
    .line 12
    iput-boolean p5, p0, Lm/o2;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, Lm/o2;->f:Lr1/d;

    .line 15
    .line 16
    iput-object p7, p0, Lm/o2;->g:Lm/h2;

    .line 17
    .line 18
    iput-object p8, p0, Lm/o2;->h:Lm/c2;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput p1, p0, Lm/o2;->j:I

    .line 22
    .line 23
    sget-object p1, Lm/a2;->b:Lm/x1;

    .line 24
    .line 25
    iput-object p1, p0, Lm/o2;->k:Lm/u1;

    .line 26
    .line 27
    new-instance p1, Lm/m2;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lm/m2;-><init>(Lm/o2;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lm/o2;->l:Lm/m2;

    .line 33
    .line 34
    new-instance p1, Lb0/d0;

    .line 35
    .line 36
    const/16 p2, 0x1b

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lm/o2;->m:Lb0/d0;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(JLyf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lm/j2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lm/j2;

    .line 7
    .line 8
    iget v1, v0, Lm/j2;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm/j2;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/j2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lm/j2;-><init>(Lm/o2;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lm/j2;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/j2;->j:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lm/j2;->g:Lgg/t;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    move-object v5, p0

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v5, p0

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    return-object p1

    .line 53
    :cond_2
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Lgg/t;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-wide p1, v6, Lgg/t;->g:J

    .line 62
    .line 63
    iput-boolean v3, p0, Lm/o2;->i:Z

    .line 64
    .line 65
    :try_start_1
    sget-object p3, Lk/d1;->g:Lk/d1;

    .line 66
    .line 67
    new-instance v4, Lm/l2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    move-object v5, p0

    .line 71
    move-wide v7, p1

    .line 72
    :try_start_2
    invoke-direct/range {v4 .. v9}, Lm/l2;-><init>(Lm/o2;Lgg/t;JLwf/c;)V

    .line 73
    .line 74
    .line 75
    iput-object v6, v0, Lm/j2;->g:Lgg/t;

    .line 76
    .line 77
    iput v3, v0, Lm/j2;->j:I

    .line 78
    .line 79
    invoke-virtual {p0, p3, v4, v0}, Lm/o2;->f(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 84
    .line 85
    if-ne p1, p2, :cond_3

    .line 86
    .line 87
    return-object p2

    .line 88
    :cond_3
    move-object p1, v6

    .line 89
    :goto_1
    iput-boolean v2, v5, Lm/o2;->i:Z

    .line 90
    .line 91
    iget-wide p1, p1, Lgg/t;->g:J

    .line 92
    .line 93
    new-instance p3, Lu2/q;

    .line 94
    .line 95
    invoke-direct {p3, p1, p2}, Lu2/q;-><init>(J)V

    .line 96
    .line 97
    .line 98
    return-object p3

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    :goto_2
    move-object p1, v0

    .line 101
    goto :goto_3

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    move-object v5, p0

    .line 104
    goto :goto_2

    .line 105
    :goto_3
    iput-boolean v2, v5, Lm/o2;->i:Z

    .line 106
    .line 107
    throw p1
.end method

.method public final b(JZLyf/i;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lm/o2;->c:Lm/p;

    .line 6
    .line 7
    sget-object v1, Lm/a2;->a:Li2/z;

    .line 8
    .line 9
    instance-of p3, p3, Lm/p;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object p3, p0, Lm/o2;->d:Lm/p1;

    .line 15
    .line 16
    sget-object v1, Lm/p1;->h:Lm/p1;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-ne p3, v1, :cond_1

    .line 20
    .line 21
    const/4 p3, 0x1

    .line 22
    :goto_0
    invoke-static {v2, v2, p3, p1, p2}, Lu2/q;->a(FFIJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 p3, 0x2

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    new-instance p3, Lm/n2;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {p3, p0, v1}, Lm/n2;-><init>(Lm/o2;Lwf/c;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lm/o2;->b:Lk/k1;

    .line 36
    .line 37
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object v3, p0, Lm/o2;->a:Lm/i2;

    .line 42
    .line 43
    invoke-interface {v3}, Lm/i2;->d()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    iget-object v3, p0, Lm/o2;->a:Lm/i2;

    .line 50
    .line 51
    invoke-interface {v3}, Lm/i2;->c()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    :cond_2
    invoke-interface {v1, p1, p2, p3, p4}, Lk/k1;->a(JLm/n2;Lyf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v2, :cond_4

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_3
    new-instance p3, Lm/n2;

    .line 65
    .line 66
    invoke-direct {p3, p0, p4}, Lm/n2;-><init>(Lm/o2;Lwf/c;)V

    .line 67
    .line 68
    .line 69
    iput-wide p1, p3, Lm/n2;->j:J

    .line 70
    .line 71
    invoke-virtual {p3, v0}, Lm/n2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v2, :cond_4

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4
    :goto_2
    return-object v0
.end method

.method public final c(Lm/u1;JI)J
    .locals 11

    .line 1
    iget-object v0, p0, Lm/o2;->f:Lr1/d;

    .line 2
    .line 3
    invoke-virtual {v0, p4, p2, p3}, Lr1/d;->d(IJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {p2, p3, v0, v1}, Le1/b;->d(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p2

    .line 11
    iget-object v2, p0, Lm/o2;->d:Lm/p1;

    .line 12
    .line 13
    sget-object v3, Lm/p1;->h:Lm/p1;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, 0x0

    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p2, p3, v5, v4}, Le1/b;->a(JFI)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    invoke-static {p2, p3, v5, v2}, Le1/b;->a(JFI)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    :goto_0
    invoke-virtual {p0, v2, v3}, Lm/o2;->e(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-virtual {p0, v2, v3}, Lm/o2;->g(J)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-interface {p1, v2}, Lm/u1;->a(F)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0, p1}, Lm/o2;->h(F)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-virtual {p0, v2, v3}, Lm/o2;->e(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    iget-object p1, p0, Lm/o2;->g:Lm/h2;

    .line 50
    .line 51
    iget-boolean v2, p1, Ly0/n;->t:Z

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {p1}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ly1/t;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :try_start_0
    sget-object v2, Ly1/t;->Y0:Ljava/lang/reflect/Method;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    if-nez v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v5, "dispatchOnScrollChanged"

    .line 76
    .line 77
    invoke-virtual {v2, v5, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 82
    .line 83
    .line 84
    sput-object v2, Ly1/t;->Y0:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    :cond_2
    sget-object v2, Ly1/t;->Y0:Ljava/lang/reflect/Method;

    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    :catch_0
    :cond_3
    :goto_1
    invoke-static {p2, p3, v6, v7}, Le1/b;->d(JJ)J

    .line 94
    .line 95
    .line 96
    move-result-wide v8

    .line 97
    iget-object v5, p0, Lm/o2;->f:Lr1/d;

    .line 98
    .line 99
    move v10, p4

    .line 100
    invoke-virtual/range {v5 .. v10}, Lr1/d;->b(JJI)J

    .line 101
    .line 102
    .line 103
    move-result-wide p1

    .line 104
    invoke-static {v0, v1, v6, v7}, Le1/b;->e(JJ)J

    .line 105
    .line 106
    .line 107
    move-result-wide p3

    .line 108
    invoke-static {p3, p4, p1, p2}, Le1/b;->e(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide p1

    .line 112
    return-wide p1
.end method

.method public final d(F)F
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/o2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    int-to-float v0, v0

    .line 7
    mul-float/2addr p1, v0

    .line 8
    :cond_0
    return p1
.end method

.method public final e(J)J
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/o2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 v0, -0x40800000    # -1.0f

    .line 6
    .line 7
    invoke-static {p1, p2, v0}, Le1/b;->f(JF)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    :cond_0
    return-wide p1
.end method

.method public final f(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lm/o2;->a:Lm/i2;

    .line 2
    .line 3
    new-instance v1, Lc0/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xe

    .line 7
    .line 8
    invoke-direct {v1, p0, p2, v2, v3}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, v1, p3}, Lm/i2;->b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    return-object p1
.end method

.method public final g(J)F
    .locals 2

    .line 1
    iget-object v0, p0, Lm/o2;->d:Lm/p1;

    .line 2
    .line 3
    sget-object v1, Lm/p1;->h:Lm/p1;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x20

    .line 8
    .line 9
    shr-long/2addr p1, v0

    .line 10
    :goto_0
    long-to-int p1, p1

    .line 11
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const-wide v0, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v0

    .line 22
    goto :goto_0
.end method

.method public final h(F)J
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    return-wide v0

    .line 9
    :cond_0
    iget-object v1, p0, Lm/o2;->d:Lm/p1;

    .line 10
    .line 11
    sget-object v2, Lm/p1;->h:Lm/p1;

    .line 12
    .line 13
    const-wide v3, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/16 v5, 0x20

    .line 19
    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    int-to-long v1, p1

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-long v6, p1

    .line 32
    shl-long v0, v1, v5

    .line 33
    .line 34
    :goto_0
    and-long v2, v6, v3

    .line 35
    .line 36
    or-long/2addr v0, v2

    .line 37
    return-wide v0

    .line 38
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v0, v0

    .line 43
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    int-to-long v6, p1

    .line 48
    shl-long/2addr v0, v5

    .line 49
    goto :goto_0
.end method

.method public final i(J)F
    .locals 5

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr v0, p1

    .line 7
    long-to-int v0, v0

    .line 8
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v2

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    float-to-double v1, v1

    .line 29
    float-to-double v3, p2

    .line 30
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    double-to-float p2, v1

    .line 35
    float-to-double v1, p2

    .line 36
    const-wide v3, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmpl-double p2, v1, v3

    .line 42
    .line 43
    iget-object v1, p0, Lm/o2;->d:Lm/p1;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    if-ltz p2, :cond_1

    .line 47
    .line 48
    sget-object p1, Lm/p1;->g:Lm/p1;

    .line 49
    .line 50
    if-ne v1, p1, :cond_0

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    return p1

    .line 57
    :cond_0
    return v2

    .line 58
    :cond_1
    sget-object p2, Lm/p1;->h:Lm/p1;

    .line 59
    .line 60
    if-ne v1, p2, :cond_2

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_2
    return v2
.end method
