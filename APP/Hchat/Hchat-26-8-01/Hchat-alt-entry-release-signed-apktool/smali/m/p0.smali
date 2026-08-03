.class public abstract Lm/p0;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/w1;
.implements Lp1/c;
.implements Lx1/h;
.implements Lk/k0;


# instance fields
.field public A:Lk/l0;

.field public B:Lsg/c;

.field public C:Ln/b;

.field public D:Z

.field public E:Z

.field public F:Lm/t;

.field public G:Lm/w;

.field public H:Lm/v;

.field public I:Lm/u;

.field public J:Lx6/d;

.field public K:Lm/a;

.field public L:J

.field public M:Lm/a3;

.field public N:Lm/b1;

.field public O:J

.field public w:Lm/p1;

.field public x:Lfg/l;

.field public y:Z

.field public z:Ln/k;


# direct methods
.method public constructor <init>(Lfg/l;ZLn/k;Lm/p1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lm/p0;->w:Lm/p1;

    .line 5
    .line 6
    iput-object p1, p0, Lm/p0;->x:Lfg/l;

    .line 7
    .line 8
    iput-boolean p2, p0, Lm/p0;->y:Z

    .line 9
    .line 10
    iput-object p3, p0, Lm/p0;->z:Ln/k;

    .line 11
    .line 12
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide p1, p0, Lm/p0;->L:J

    .line 18
    .line 19
    const-wide/16 p1, 0x0

    .line 20
    .line 21
    iput-wide p1, p0, Lm/p0;->O:J

    .line 22
    .line 23
    return-void
.end method

.method public static final n1(Lm/p0;Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lm/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lm/l0;

    .line 7
    .line 8
    iget v1, v0, Lm/l0;->i:I

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
    iput v1, v0, Lm/l0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/l0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lm/l0;-><init>(Lm/p0;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lm/l0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/l0;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lm/p0;->C:Ln/b;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Lm/p0;->z:Ln/k;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    new-instance v3, Ln/a;

    .line 57
    .line 58
    invoke-direct {v3, p1}, Ln/a;-><init>(Ln/b;)V

    .line 59
    .line 60
    .line 61
    iput v2, v0, Lm/l0;->i:I

    .line 62
    .line 63
    invoke-virtual {v1, v3, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 68
    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Lm/p0;->C:Ln/b;

    .line 74
    .line 75
    :cond_4
    new-instance p1, Lm/a0;

    .line 76
    .line 77
    const-wide/16 v0, 0x0

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-direct {p1, v0, v1, v2}, Lm/a0;-><init>(JZ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lm/p0;->x1(Lm/a0;)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    return-object p0
.end method

.method public static final o1(Lm/p0;Lm/z;Lyf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lm/m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lm/m0;

    .line 7
    .line 8
    iget v1, v0, Lm/m0;->k:I

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
    iput v1, v0, Lm/m0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/m0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lm/m0;-><init>(Lm/p0;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lm/m0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/m0;->k:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lm/m0;->h:Ln/b;

    .line 40
    .line 41
    iget-object v0, v0, Lm/m0;->g:Lm/z;

    .line 42
    .line 43
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Lm/m0;->g:Lm/z;

    .line 55
    .line 56
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lm/p0;->C:Ln/b;

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lm/p0;->z:Ln/k;

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    new-instance v5, Ln/a;

    .line 72
    .line 73
    invoke-direct {v5, p2}, Ln/a;-><init>(Ln/b;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Lm/m0;->g:Lm/z;

    .line 77
    .line 78
    iput v3, v0, Lm/m0;->k:I

    .line 79
    .line 80
    invoke-virtual {v1, v5, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_1
    new-instance p2, Ln/b;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lm/p0;->z:Ln/k;

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    iput-object p1, v0, Lm/m0;->g:Lm/z;

    .line 97
    .line 98
    iput-object p2, v0, Lm/m0;->h:Ln/b;

    .line 99
    .line 100
    iput v2, v0, Lm/m0;->k:I

    .line 101
    .line 102
    invoke-virtual {v1, p2, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v4, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v4

    .line 109
    :cond_5
    move-object v0, p1

    .line 110
    move-object p1, p2

    .line 111
    :goto_3
    move-object p2, p1

    .line 112
    move-object p1, v0

    .line 113
    :cond_6
    iput-object p2, p0, Lm/p0;->C:Ln/b;

    .line 114
    .line 115
    iget-wide p1, p1, Lm/z;->a:J

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, Lm/p0;->w1(J)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    return-object p0
.end method

.method public static final p1(Lm/p0;Lm/a0;Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lm/n0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lm/n0;

    .line 7
    .line 8
    iget v1, v0, Lm/n0;->j:I

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
    iput v1, v0, Lm/n0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/n0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lm/n0;-><init>(Lm/p0;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lm/n0;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/n0;->j:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lm/n0;->g:Lm/a0;

    .line 35
    .line 36
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lm/p0;->C:Ln/b;

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    iget-object v1, p0, Lm/p0;->z:Ln/k;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v3, Ln/c;

    .line 59
    .line 60
    invoke-direct {v3, p2}, Ln/c;-><init>(Ln/b;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v0, Lm/n0;->g:Lm/a0;

    .line 64
    .line 65
    iput v2, v0, Lm/n0;->j:I

    .line 66
    .line 67
    invoke-virtual {v1, v3, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 72
    .line 73
    if-ne p2, v0, :cond_3

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_1
    const/4 p2, 0x0

    .line 77
    iput-object p2, p0, Lm/p0;->C:Ln/b;

    .line 78
    .line 79
    :cond_4
    invoke-virtual {p0, p1}, Lm/p0;->x1(Lm/a0;)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 83
    .line 84
    return-object p0
.end method

.method public static u1(Lm/p0;Ls1/t;JJI)V
    .locals 3

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    :cond_0
    iget-object p6, p0, Lm/p0;->H:Lm/v;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p6, :cond_1

    .line 11
    .line 12
    new-instance p6, Lm/v;

    .line 13
    .line 14
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p6, Lm/v;->g:Ls1/t;

    .line 19
    .line 20
    const-wide v1, 0x7fffffffffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v1, p6, Lm/v;->h:J

    .line 26
    .line 27
    iput-boolean v0, p6, Lm/v;->i:Z

    .line 28
    .line 29
    iput-object p6, p0, Lm/p0;->H:Lm/v;

    .line 30
    .line 31
    :cond_1
    iput-object p1, p6, Lm/v;->g:Ls1/t;

    .line 32
    .line 33
    iput-wide p2, p6, Lm/v;->h:J

    .line 34
    .line 35
    iget-object p1, p0, Lm/p0;->M:Lm/a3;

    .line 36
    .line 37
    iget-object p2, p0, Lm/p0;->w:Lm/p1;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Lm/a3;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Lm/a3;-><init>(Lm/p1;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lm/p0;->M:Lm/a3;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-object p2, p1, Lm/a3;->a:Lm/p1;

    .line 50
    .line 51
    iput-wide p4, p1, Lm/a3;->b:J

    .line 52
    .line 53
    :goto_0
    iput-boolean v0, p6, Lm/v;->i:Z

    .line 54
    .line 55
    iput-object p6, p0, Lm/p0;->J:Lx6/d;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final A1(JLs1/t;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    invoke-static {v0}, Lx1/k;->v(Lx1/i;)Lx1/i1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lx1/i1;->P(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p0, Lm/p0;->L:J

    .line 14
    .line 15
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3, v4, v5}, Le1/b;->b(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-wide v2, p0, Lm/p0;->L:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Le1/b;->b(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-wide v2, p0, Lm/p0;->L:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Le1/b;->d(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    iget-wide v4, p0, Lm/p0;->O:J

    .line 41
    .line 42
    invoke-static {v4, v5, v2, v3}, Le1/b;->e(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    iput-wide v2, p0, Lm/p0;->O:J

    .line 47
    .line 48
    :cond_0
    iput-wide v0, p0, Lm/p0;->L:J

    .line 49
    .line 50
    invoke-virtual {p0}, Lm/p0;->z1()Lm/a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-wide v1, p0, Lm/p0;->O:J

    .line 55
    .line 56
    invoke-static {v0, p3, v1, v2}, Lg4/a;->f(Lm/a;Ls1/t;J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lm/p0;->y1()Lsg/g;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    new-instance v0, Lm/y;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-direct {v0, p1, p2, v1}, Lm/y;-><init>(JZ)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p3, v0}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final B0(Lp1/b;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lac/p;->j(Lp1/b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, Lm/p0;->y:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final B1(Ls1/t;Ls1/t;J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lm/p0;->K:Lm/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm/a;

    .line 6
    .line 7
    const/16 v1, 0x11

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lm/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lm/p0;->K:Lm/a;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lm/p0;->z1()Lm/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    invoke-static {v0, p1, v1, v2}, Lg4/a;->f(Lm/a;Ls1/t;J)V

    .line 21
    .line 22
    .line 23
    iget-wide v3, p2, Ls1/t;->c:J

    .line 24
    .line 25
    invoke-static {v3, v4, p3, p4}, Le1/b;->d(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p2

    .line 29
    iput-wide v1, p0, Lm/p0;->O:J

    .line 30
    .line 31
    iget-object p4, p0, Lm/p0;->x:Lfg/l;

    .line 32
    .line 33
    iget p1, p1, Ls1/t;->i:I

    .line 34
    .line 35
    new-instance v0, Ls1/d0;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Ls1/d0;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p4, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-boolean p1, p0, Lm/p0;->D:Z

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p0, Lm/p0;->B:Lsg/c;

    .line 57
    .line 58
    if-nez p1, :cond_1

    .line 59
    .line 60
    const p1, 0x7fffffff

    .line 61
    .line 62
    .line 63
    const/4 p4, 0x6

    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-static {p1, p4, v0}, Lsg/j;->a(IILsg/a;)Lsg/c;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lm/p0;->B:Lsg/c;

    .line 70
    .line 71
    :cond_1
    invoke-virtual {p0}, Lm/p0;->D1()V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-static {p0}, Lx1/k;->v(Lx1/i;)Lx1/i1;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1, v1, v2}, Lx1/i1;->P(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    iput-wide v0, p0, Lm/p0;->L:J

    .line 83
    .line 84
    invoke-virtual {p0}, Lm/p0;->y1()Lsg/g;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance p4, Lm/z;

    .line 89
    .line 90
    invoke-direct {p4, p2, p3}, Lm/z;-><init>(J)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1, p4}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_3
    return-void
.end method

.method public abstract C1()Z
.end method

.method public final D1()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm/p0;->D:Z

    .line 3
    .line 4
    iget-object v0, p0, Lm/p0;->B:Lsg/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-static {v0, v2, v1}, Lsg/j;->a(IILsg/a;)Lsg/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lm/p0;->B:Lsg/c;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Lm/o0;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Lm/o0;-><init>(Lm/p0;Lwf/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    invoke-static {v0, v1, v2, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final E1(Lfg/l;ZLn/k;Lm/p1;Z)V
    .locals 2

    .line 1
    iput-object p1, p0, Lm/p0;->x:Lfg/l;

    .line 2
    .line 3
    iget-boolean p1, p0, Lm/p0;->y:Z

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq p1, p2, :cond_1

    .line 8
    .line 9
    iput-boolean p2, p0, Lm/p0;->y:Z

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lm/p0;->q1()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm/p0;->N:Lm/b1;

    .line 17
    .line 18
    :cond_0
    move p5, v1

    .line 19
    :cond_1
    iget-object p1, p0, Lm/p0;->z:Ln/k;

    .line 20
    .line 21
    invoke-static {p1, p3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lm/p0;->q1()V

    .line 28
    .line 29
    .line 30
    iput-object p3, p0, Lm/p0;->z:Ln/k;

    .line 31
    .line 32
    :cond_2
    iget-object p1, p0, Lm/p0;->w:Lm/p1;

    .line 33
    .line 34
    if-eq p1, p4, :cond_3

    .line 35
    .line 36
    iput-object p4, p0, Lm/p0;->w:Lm/p1;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    move v1, p5

    .line 40
    :goto_0
    if-eqz v1, :cond_7

    .line 41
    .line 42
    iget-boolean p1, p0, Lm/p0;->E:Z

    .line 43
    .line 44
    sget-object p2, Lm/x;->a:Lm/x;

    .line 45
    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0}, Lm/p0;->s1()V

    .line 49
    .line 50
    .line 51
    iget-boolean p1, p0, Lm/p0;->D:Z

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0}, Lm/p0;->y1()Lsg/g;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1, p2}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_4
    iput-object v0, p0, Lm/p0;->K:Lm/a;

    .line 63
    .line 64
    :cond_5
    iget-object p1, p0, Lm/p0;->N:Lm/b1;

    .line 65
    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    invoke-virtual {p1}, Lm/b1;->a()V

    .line 69
    .line 70
    .line 71
    iget-object p3, p1, Lm/b1;->a:Lm/p0;

    .line 72
    .line 73
    iget-boolean p4, p3, Lm/p0;->D:Z

    .line 74
    .line 75
    if-eqz p4, :cond_6

    .line 76
    .line 77
    invoke-virtual {p3, p2}, Lm/p0;->v1(Lm/b0;)V

    .line 78
    .line 79
    .line 80
    :cond_6
    iput-object v0, p1, Lm/b1;->g:Lm/a;

    .line 81
    .line 82
    iget-object p1, p1, Lm/b1;->k:La5/a;

    .line 83
    .line 84
    const/4 p2, 0x0

    .line 85
    iput p2, p1, La5/a;->h:I

    .line 86
    .line 87
    iget-object p1, p1, La5/a;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lf/y;

    .line 90
    .line 91
    iput p2, p1, Lf/y;->b:I

    .line 92
    .line 93
    :cond_7
    return-void
.end method

.method public P(Ls1/k;Ls1/l;J)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iput-boolean v3, v0, Lm/p0;->E:Z

    .line 9
    .line 10
    iget-object v4, v0, Lm/p0;->A:Lk/l0;

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    new-instance v4, Lk/l0;

    .line 15
    .line 16
    invoke-direct {v4, v0}, Lk/l0;-><init>(Lk/k0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 20
    .line 21
    .line 22
    iput-object v4, v0, Lm/p0;->A:Lk/l0;

    .line 23
    .line 24
    :cond_0
    iget-boolean v4, v0, Lm/p0;->y:Z

    .line 25
    .line 26
    if-eqz v4, :cond_38

    .line 27
    .line 28
    iget-object v4, v0, Lm/p0;->J:Lx6/d;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    iget-object v4, v0, Lm/p0;->F:Lm/t;

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    new-instance v4, Lm/t;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v6, Lm/s;->i:Lm/s;

    .line 43
    .line 44
    iput-object v6, v4, Lm/t;->g:Lm/s;

    .line 45
    .line 46
    iput-boolean v5, v4, Lm/t;->h:Z

    .line 47
    .line 48
    iput-object v4, v0, Lm/p0;->F:Lm/t;

    .line 49
    .line 50
    :cond_1
    iput-object v4, v0, Lm/p0;->J:Lx6/d;

    .line 51
    .line 52
    :cond_2
    iget-object v4, v0, Lm/p0;->J:Lx6/d;

    .line 53
    .line 54
    if-eqz v4, :cond_37

    .line 55
    .line 56
    instance-of v6, v4, Lm/t;

    .line 57
    .line 58
    const-wide v7, 0x7fffffffffffffffL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    sget-object v9, Ls1/l;->g:Ls1/l;

    .line 64
    .line 65
    const-wide/16 v10, 0x0

    .line 66
    .line 67
    sget-object v12, Ls1/l;->h:Ls1/l;

    .line 68
    .line 69
    if-eqz v6, :cond_a

    .line 70
    .line 71
    check-cast v4, Lm/t;

    .line 72
    .line 73
    iget-object v6, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    goto/16 :goto_12

    .line 82
    .line 83
    :cond_3
    invoke-static {v1, v5}, Lm/y2;->e(Ls1/k;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_4

    .line 88
    .line 89
    goto/16 :goto_12

    .line 90
    .line 91
    :cond_4
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ls1/t;

    .line 98
    .line 99
    iget-object v5, v4, Lm/t;->g:Lm/s;

    .line 100
    .line 101
    sget-object v6, Lm/k0;->a:[I

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    aget v5, v6, v5

    .line 108
    .line 109
    sget-object v6, Lm/s;->h:Lm/s;

    .line 110
    .line 111
    sget-object v13, Lm/s;->g:Lm/s;

    .line 112
    .line 113
    if-ne v5, v3, :cond_6

    .line 114
    .line 115
    invoke-virtual {v0}, Lm/p0;->C1()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-nez v5, :cond_5

    .line 120
    .line 121
    move-object v5, v13

    .line 122
    goto :goto_0

    .line 123
    :cond_5
    move-object v5, v6

    .line 124
    goto :goto_0

    .line 125
    :cond_6
    iget-object v5, v4, Lm/t;->g:Lm/s;

    .line 126
    .line 127
    :goto_0
    iput-object v5, v4, Lm/t;->g:Lm/s;

    .line 128
    .line 129
    if-ne v2, v9, :cond_7

    .line 130
    .line 131
    if-ne v5, v6, :cond_7

    .line 132
    .line 133
    invoke-virtual {v1}, Ls1/t;->a()V

    .line 134
    .line 135
    .line 136
    iput-boolean v3, v4, Lm/t;->h:Z

    .line 137
    .line 138
    :cond_7
    if-ne v2, v12, :cond_38

    .line 139
    .line 140
    if-ne v5, v13, :cond_8

    .line 141
    .line 142
    iget-wide v2, v1, Ls1/t;->a:J

    .line 143
    .line 144
    const-wide/16 v4, 0x0

    .line 145
    .line 146
    const/16 v6, 0xc

    .line 147
    .line 148
    invoke-static/range {v0 .. v6}, Lm/p0;->u1(Lm/p0;Ls1/t;JJI)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_8
    iget-boolean v2, v4, Lm/t;->h:Z

    .line 153
    .line 154
    if-eqz v2, :cond_38

    .line 155
    .line 156
    invoke-virtual {v0, v1, v1, v10, v11}, Lm/p0;->B1(Ls1/t;Ls1/t;J)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v10, v11, v1}, Lm/p0;->A1(JLs1/t;)V

    .line 160
    .line 161
    .line 162
    iget-wide v1, v1, Ls1/t;->a:J

    .line 163
    .line 164
    iget-object v3, v0, Lm/p0;->G:Lm/w;

    .line 165
    .line 166
    if-nez v3, :cond_9

    .line 167
    .line 168
    new-instance v3, Lm/w;

    .line 169
    .line 170
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-wide v7, v3, Lm/w;->g:J

    .line 174
    .line 175
    iput-object v3, v0, Lm/p0;->G:Lm/w;

    .line 176
    .line 177
    :cond_9
    iput-wide v1, v3, Lm/w;->g:J

    .line 178
    .line 179
    iput-object v3, v0, Lm/p0;->J:Lx6/d;

    .line 180
    .line 181
    return-void

    .line 182
    :cond_a
    instance-of v6, v4, Lm/v;

    .line 183
    .line 184
    sget-object v13, Ls1/l;->i:Ls1/l;

    .line 185
    .line 186
    if-eqz v6, :cond_22

    .line 187
    .line 188
    check-cast v4, Lm/v;

    .line 189
    .line 190
    if-ne v2, v9, :cond_b

    .line 191
    .line 192
    goto/16 :goto_12

    .line 193
    .line 194
    :cond_b
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    move v9, v5

    .line 201
    :goto_1
    if-ge v9, v6, :cond_d

    .line 202
    .line 203
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    move-object v11, v10

    .line 208
    check-cast v11, Ls1/t;

    .line 209
    .line 210
    iget-wide v14, v11, Ls1/t;->a:J

    .line 211
    .line 212
    move/from16 p1, v6

    .line 213
    .line 214
    iget-wide v5, v4, Lm/v;->h:J

    .line 215
    .line 216
    invoke-static {v14, v15, v5, v6}, Ls1/s;->e(JJ)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-eqz v5, :cond_c

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_c
    add-int/lit8 v9, v9, 0x1

    .line 224
    .line 225
    move/from16 v6, p1

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    goto :goto_1

    .line 229
    :cond_d
    const/4 v10, 0x0

    .line 230
    :goto_2
    check-cast v10, Ls1/t;

    .line 231
    .line 232
    if-nez v10, :cond_11

    .line 233
    .line 234
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    const/4 v6, 0x0

    .line 239
    :goto_3
    if-ge v6, v5, :cond_f

    .line 240
    .line 241
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    move-object v10, v9

    .line 246
    check-cast v10, Ls1/t;

    .line 247
    .line 248
    iget-boolean v10, v10, Ls1/t;->d:Z

    .line 249
    .line 250
    if-eqz v10, :cond_e

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_f
    const/4 v9, 0x0

    .line 257
    :goto_4
    move-object v10, v9

    .line 258
    check-cast v10, Ls1/t;

    .line 259
    .line 260
    if-nez v10, :cond_10

    .line 261
    .line 262
    invoke-virtual {v0}, Lm/p0;->s1()V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_10
    iget-wide v5, v10, Ls1/t;->a:J

    .line 267
    .line 268
    iput-wide v5, v4, Lm/v;->h:J

    .line 269
    .line 270
    :cond_11
    const-string v5, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 271
    .line 272
    const-string v6, "AwaitTouchSlop.initialDown was not initialized"

    .line 273
    .line 274
    if-ne v2, v12, :cond_1e

    .line 275
    .line 276
    invoke-virtual {v10}, Ls1/t;->b()Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    if-nez v9, :cond_1b

    .line 281
    .line 282
    invoke-static {v10}, Ls1/s;->d(Ls1/t;)Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_15

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    const/4 v7, 0x0

    .line 293
    :goto_5
    if-ge v7, v3, :cond_13

    .line 294
    .line 295
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    move-object v9, v8

    .line 300
    check-cast v9, Ls1/t;

    .line 301
    .line 302
    iget-boolean v9, v9, Ls1/t;->d:Z

    .line 303
    .line 304
    if-eqz v9, :cond_12

    .line 305
    .line 306
    move-object v14, v8

    .line 307
    goto :goto_6

    .line 308
    :cond_12
    add-int/lit8 v7, v7, 0x1

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_13
    const/4 v14, 0x0

    .line 312
    :goto_6
    check-cast v14, Ls1/t;

    .line 313
    .line 314
    if-nez v14, :cond_14

    .line 315
    .line 316
    invoke-virtual {v0}, Lm/p0;->s1()V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_8

    .line 320
    .line 321
    :cond_14
    iget-wide v7, v14, Ls1/t;->a:J

    .line 322
    .line 323
    iput-wide v7, v4, Lm/v;->h:J

    .line 324
    .line 325
    goto/16 :goto_8

    .line 326
    .line 327
    :cond_15
    sget-object v1, Ly1/h1;->t:Li0/m2;

    .line 328
    .line 329
    invoke-static {v0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Ly1/l2;

    .line 334
    .line 335
    iget v9, v10, Ls1/t;->i:I

    .line 336
    .line 337
    invoke-static {v1, v9}, Lm/j0;->f(Ly1/l2;I)F

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    iget-object v9, v0, Lm/p0;->M:Lm/a3;

    .line 342
    .line 343
    if-eqz v9, :cond_1a

    .line 344
    .line 345
    invoke-static {v10, v3}, Ls1/s;->h(Ls1/t;Z)J

    .line 346
    .line 347
    .line 348
    move-result-wide v11

    .line 349
    invoke-virtual {v9, v11, v12, v1, v3}, Lm/a3;->a(JFZ)J

    .line 350
    .line 351
    .line 352
    move-result-wide v11

    .line 353
    const-wide v14, 0x7fffffff7fffffffL

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    and-long/2addr v14, v11

    .line 359
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    cmp-long v1, v14, v16

    .line 365
    .line 366
    if-eqz v1, :cond_19

    .line 367
    .line 368
    invoke-virtual {v0, v10}, Lm/p0;->X(Ls1/t;)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    invoke-static {v0}, Lk/n;->m(Lx1/j;)Lk/k0;

    .line 373
    .line 374
    .line 375
    move-result-object v9

    .line 376
    if-eqz v9, :cond_16

    .line 377
    .line 378
    invoke-interface {v9, v10}, Lk/k0;->X(Ls1/t;)Z

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    if-ne v9, v3, :cond_16

    .line 383
    .line 384
    move v9, v3

    .line 385
    goto :goto_7

    .line 386
    :cond_16
    const/4 v9, 0x0

    .line 387
    :goto_7
    if-nez v1, :cond_17

    .line 388
    .line 389
    if-eqz v9, :cond_17

    .line 390
    .line 391
    iput-boolean v3, v4, Lm/v;->i:Z

    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_17
    invoke-virtual {v10}, Ls1/t;->a()V

    .line 395
    .line 396
    .line 397
    iget-object v1, v4, Lm/v;->g:Ls1/t;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v1, v10, v11, v12}, Lm/p0;->B1(Ls1/t;Ls1/t;J)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v11, v12, v10}, Lm/p0;->A1(JLs1/t;)V

    .line 406
    .line 407
    .line 408
    iget-wide v11, v10, Ls1/t;->a:J

    .line 409
    .line 410
    iget-object v1, v0, Lm/p0;->G:Lm/w;

    .line 411
    .line 412
    if-nez v1, :cond_18

    .line 413
    .line 414
    new-instance v1, Lm/w;

    .line 415
    .line 416
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 417
    .line 418
    .line 419
    iput-wide v7, v1, Lm/w;->g:J

    .line 420
    .line 421
    iput-object v1, v0, Lm/p0;->G:Lm/w;

    .line 422
    .line 423
    :cond_18
    iput-wide v11, v1, Lm/w;->g:J

    .line 424
    .line 425
    iput-object v1, v0, Lm/p0;->J:Lx6/d;

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_19
    iput-boolean v3, v4, Lm/v;->i:Z

    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_1a
    const-string v1, "Touch slop detector not initialized."

    .line 432
    .line 433
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_1b
    iget-object v1, v4, Lm/v;->g:Ls1/t;

    .line 438
    .line 439
    if-eqz v1, :cond_1d

    .line 440
    .line 441
    iget-wide v7, v4, Lm/v;->h:J

    .line 442
    .line 443
    iget-object v3, v0, Lm/p0;->M:Lm/a3;

    .line 444
    .line 445
    if-eqz v3, :cond_1c

    .line 446
    .line 447
    invoke-virtual {v0, v1, v7, v8, v3}, Lm/p0;->t1(Ls1/t;JLm/a3;)V

    .line 448
    .line 449
    .line 450
    goto :goto_8

    .line 451
    :cond_1c
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :cond_1d
    invoke-static {v6}, Lj8/o;->t(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    return-void

    .line 459
    :cond_1e
    :goto_8
    if-ne v2, v13, :cond_38

    .line 460
    .line 461
    iget-boolean v1, v4, Lm/v;->i:Z

    .line 462
    .line 463
    if-eqz v1, :cond_38

    .line 464
    .line 465
    invoke-virtual {v10}, Ls1/t;->b()Z

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    if-eqz v1, :cond_21

    .line 470
    .line 471
    iget-object v1, v4, Lm/v;->g:Ls1/t;

    .line 472
    .line 473
    if-eqz v1, :cond_20

    .line 474
    .line 475
    iget-wide v2, v4, Lm/v;->h:J

    .line 476
    .line 477
    iget-object v4, v0, Lm/p0;->M:Lm/a3;

    .line 478
    .line 479
    if-eqz v4, :cond_1f

    .line 480
    .line 481
    invoke-virtual {v0, v1, v2, v3, v4}, Lm/p0;->t1(Ls1/t;JLm/a3;)V

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :cond_1f
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :cond_20
    invoke-static {v6}, Lj8/o;->t(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_21
    const/4 v1, 0x0

    .line 494
    iput-boolean v1, v4, Lm/v;->i:Z

    .line 495
    .line 496
    return-void

    .line 497
    :cond_22
    instance-of v5, v4, Lm/u;

    .line 498
    .line 499
    if-eqz v5, :cond_2a

    .line 500
    .line 501
    check-cast v4, Lm/u;

    .line 502
    .line 503
    if-eq v2, v13, :cond_23

    .line 504
    .line 505
    goto/16 :goto_12

    .line 506
    .line 507
    :cond_23
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 508
    .line 509
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    const/4 v5, 0x0

    .line 514
    :goto_9
    if-ge v5, v2, :cond_25

    .line 515
    .line 516
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v6

    .line 520
    check-cast v6, Ls1/t;

    .line 521
    .line 522
    invoke-virtual {v6}, Ls1/t;->b()Z

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    if-eqz v6, :cond_24

    .line 527
    .line 528
    const/4 v3, 0x0

    .line 529
    goto :goto_a

    .line 530
    :cond_24
    add-int/lit8 v5, v5, 0x1

    .line 531
    .line 532
    goto :goto_9

    .line 533
    :cond_25
    :goto_a
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    const/4 v5, 0x0

    .line 538
    :goto_b
    if-ge v5, v2, :cond_29

    .line 539
    .line 540
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v6

    .line 544
    check-cast v6, Ls1/t;

    .line 545
    .line 546
    iget-boolean v6, v6, Ls1/t;->d:Z

    .line 547
    .line 548
    if-eqz v6, :cond_28

    .line 549
    .line 550
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    if-eqz v2, :cond_26

    .line 555
    .line 556
    goto :goto_c

    .line 557
    :cond_26
    if-eqz v3, :cond_38

    .line 558
    .line 559
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    check-cast v1, Ls1/t;

    .line 564
    .line 565
    iget-wide v1, v1, Ls1/t;->c:J

    .line 566
    .line 567
    iget-object v3, v4, Lm/u;->g:Ls1/t;

    .line 568
    .line 569
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    iget-wide v5, v3, Ls1/t;->c:J

    .line 573
    .line 574
    invoke-static {v1, v2, v5, v6}, Le1/b;->d(JJ)J

    .line 575
    .line 576
    .line 577
    move-result-wide v1

    .line 578
    move-wide v2, v1

    .line 579
    iget-object v1, v4, Lm/u;->g:Ls1/t;

    .line 580
    .line 581
    if-eqz v1, :cond_27

    .line 582
    .line 583
    move-wide v5, v2

    .line 584
    iget-wide v2, v4, Lm/u;->h:J

    .line 585
    .line 586
    move-wide v4, v5

    .line 587
    const/16 v6, 0x8

    .line 588
    .line 589
    invoke-static/range {v0 .. v6}, Lm/p0;->u1(Lm/p0;Ls1/t;JJI)V

    .line 590
    .line 591
    .line 592
    return-void

    .line 593
    :cond_27
    const-string v1, "AwaitGesturePickup.initialDown was not initialized."

    .line 594
    .line 595
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :cond_28
    add-int/lit8 v5, v5, 0x1

    .line 600
    .line 601
    goto :goto_b

    .line 602
    :cond_29
    :goto_c
    invoke-virtual {v0}, Lm/p0;->s1()V

    .line 603
    .line 604
    .line 605
    return-void

    .line 606
    :cond_2a
    instance-of v5, v4, Lm/w;

    .line 607
    .line 608
    if-eqz v5, :cond_36

    .line 609
    .line 610
    check-cast v4, Lm/w;

    .line 611
    .line 612
    if-eq v2, v12, :cond_2b

    .line 613
    .line 614
    goto/16 :goto_12

    .line 615
    .line 616
    :cond_2b
    iget-wide v5, v4, Lm/w;->g:J

    .line 617
    .line 618
    iget-object v2, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 619
    .line 620
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 621
    .line 622
    .line 623
    move-result v7

    .line 624
    const/4 v8, 0x0

    .line 625
    :goto_d
    if-ge v8, v7, :cond_2d

    .line 626
    .line 627
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v9

    .line 631
    move-object v12, v9

    .line 632
    check-cast v12, Ls1/t;

    .line 633
    .line 634
    iget-wide v12, v12, Ls1/t;->a:J

    .line 635
    .line 636
    invoke-static {v12, v13, v5, v6}, Ls1/s;->e(JJ)Z

    .line 637
    .line 638
    .line 639
    move-result v12

    .line 640
    if-eqz v12, :cond_2c

    .line 641
    .line 642
    goto :goto_e

    .line 643
    :cond_2c
    add-int/lit8 v8, v8, 0x1

    .line 644
    .line 645
    goto :goto_d

    .line 646
    :cond_2d
    const/4 v9, 0x0

    .line 647
    :goto_e
    check-cast v9, Ls1/t;

    .line 648
    .line 649
    if-nez v9, :cond_2e

    .line 650
    .line 651
    goto/16 :goto_12

    .line 652
    .line 653
    :cond_2e
    invoke-static {v9}, Ls1/s;->d(Ls1/t;)Z

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    sget-object v5, Lm/x;->a:Lm/x;

    .line 658
    .line 659
    if-eqz v2, :cond_33

    .line 660
    .line 661
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 662
    .line 663
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    const/4 v3, 0x0

    .line 668
    :goto_f
    if-ge v3, v2, :cond_30

    .line 669
    .line 670
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v6

    .line 674
    move-object v7, v6

    .line 675
    check-cast v7, Ls1/t;

    .line 676
    .line 677
    iget-boolean v7, v7, Ls1/t;->d:Z

    .line 678
    .line 679
    if-eqz v7, :cond_2f

    .line 680
    .line 681
    goto :goto_10

    .line 682
    :cond_2f
    add-int/lit8 v3, v3, 0x1

    .line 683
    .line 684
    goto :goto_f

    .line 685
    :cond_30
    const/4 v6, 0x0

    .line 686
    :goto_10
    check-cast v6, Ls1/t;

    .line 687
    .line 688
    if-nez v6, :cond_32

    .line 689
    .line 690
    invoke-virtual {v9}, Ls1/t;->b()Z

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    if-nez v1, :cond_31

    .line 695
    .line 696
    invoke-static {v9}, Ls1/s;->d(Ls1/t;)Z

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    if-eqz v1, :cond_31

    .line 701
    .line 702
    invoke-virtual {v0}, Lm/p0;->z1()Lm/a;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    invoke-static {v1, v9, v10, v11}, Lg4/a;->f(Lm/a;Ls1/t;J)V

    .line 707
    .line 708
    .line 709
    sget-object v1, Ly1/h1;->t:Li0/m2;

    .line 710
    .line 711
    invoke-static {v0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    check-cast v1, Ly1/l2;

    .line 716
    .line 717
    invoke-interface {v1}, Ly1/l2;->e()F

    .line 718
    .line 719
    .line 720
    move-result v1

    .line 721
    invoke-virtual {v0}, Lm/p0;->z1()Lm/a;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    invoke-static {v1, v1}, La/a;->d(FF)J

    .line 726
    .line 727
    .line 728
    move-result-wide v3

    .line 729
    invoke-virtual {v2, v3, v4}, Lm/a;->j(J)J

    .line 730
    .line 731
    .line 732
    move-result-wide v1

    .line 733
    invoke-virtual {v0}, Lm/p0;->z1()Lm/a;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    iget-object v3, v3, Lm/a;->h:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v3, Lt1/b;

    .line 740
    .line 741
    iget-object v4, v3, Lt1/b;->a:Lt1/d;

    .line 742
    .line 743
    iget-object v5, v4, Lt1/d;->d:[Lt1/a;

    .line 744
    .line 745
    const/4 v6, 0x0

    .line 746
    invoke-static {v6, v5}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    const/4 v5, 0x0

    .line 750
    iput v5, v4, Lt1/d;->e:I

    .line 751
    .line 752
    iget-object v4, v3, Lt1/b;->b:Lt1/d;

    .line 753
    .line 754
    iget-object v7, v4, Lt1/d;->d:[Lt1/a;

    .line 755
    .line 756
    invoke-static {v6, v7}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    iput v5, v4, Lt1/d;->e:I

    .line 760
    .line 761
    iput-wide v10, v3, Lt1/b;->c:J

    .line 762
    .line 763
    invoke-virtual {v0}, Lm/p0;->y1()Lsg/g;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    new-instance v4, Lm/a0;

    .line 768
    .line 769
    invoke-static {v1, v2}, Lm/s0;->c(J)J

    .line 770
    .line 771
    .line 772
    move-result-wide v1

    .line 773
    invoke-direct {v4, v1, v2, v5}, Lm/a0;-><init>(JZ)V

    .line 774
    .line 775
    .line 776
    invoke-interface {v3, v4}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    iput-boolean v5, v0, Lm/p0;->E:Z

    .line 780
    .line 781
    goto :goto_11

    .line 782
    :cond_31
    invoke-virtual {v0}, Lm/p0;->y1()Lsg/g;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    invoke-interface {v1, v5}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    :goto_11
    invoke-virtual {v0}, Lm/p0;->s1()V

    .line 790
    .line 791
    .line 792
    return-void

    .line 793
    :cond_32
    iget-wide v1, v6, Ls1/t;->a:J

    .line 794
    .line 795
    iput-wide v1, v4, Lm/w;->g:J

    .line 796
    .line 797
    return-void

    .line 798
    :cond_33
    invoke-virtual {v9}, Ls1/t;->b()Z

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    if-eqz v1, :cond_34

    .line 803
    .line 804
    invoke-virtual {v0}, Lm/p0;->y1()Lsg/g;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    invoke-interface {v1, v5}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    return-void

    .line 812
    :cond_34
    invoke-static {v9, v3}, Ls1/s;->h(Ls1/t;Z)J

    .line 813
    .line 814
    .line 815
    move-result-wide v1

    .line 816
    invoke-static {v1, v2}, Le1/b;->c(J)F

    .line 817
    .line 818
    .line 819
    move-result v1

    .line 820
    const/4 v2, 0x0

    .line 821
    cmpg-float v1, v1, v2

    .line 822
    .line 823
    if-nez v1, :cond_35

    .line 824
    .line 825
    goto :goto_12

    .line 826
    :cond_35
    const/4 v1, 0x0

    .line 827
    invoke-static {v9, v1}, Ls1/s;->h(Ls1/t;Z)J

    .line 828
    .line 829
    .line 830
    move-result-wide v1

    .line 831
    invoke-virtual {v0, v1, v2, v9}, Lm/p0;->A1(JLs1/t;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v9}, Ls1/t;->a()V

    .line 835
    .line 836
    .line 837
    return-void

    .line 838
    :cond_36
    invoke-static {}, Lokio/a;->k()V

    .line 839
    .line 840
    .line 841
    return-void

    .line 842
    :cond_37
    const-string v1, "currentDragState should not be null"

    .line 843
    .line 844
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    :cond_38
    :goto_12
    return-void
.end method

.method public final T0(Lac/k;Ls1/l;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, Lac/k;->h:I

    .line 8
    .line 9
    iget-object v1, v1, Lac/k;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v4, v0, Lm/p0;->A:Lk/l0;

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    new-instance v4, Lk/l0;

    .line 18
    .line 19
    invoke-direct {v4, v0}, Lk/l0;-><init>(Lk/k0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v4}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 23
    .line 24
    .line 25
    iput-object v4, v0, Lm/p0;->A:Lk/l0;

    .line 26
    .line 27
    :cond_0
    iget-boolean v4, v0, Lm/p0;->y:Z

    .line 28
    .line 29
    if-eqz v4, :cond_38

    .line 30
    .line 31
    iget-object v4, v0, Lm/p0;->N:Lm/b1;

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    new-instance v4, Lm/b1;

    .line 36
    .line 37
    invoke-direct {v4, v0}, Lm/b1;-><init>(Lm/p0;)V

    .line 38
    .line 39
    .line 40
    iput-object v4, v0, Lm/p0;->N:Lm/b1;

    .line 41
    .line 42
    :cond_1
    iget-object v5, v0, Lm/p0;->N:Lm/b1;

    .line 43
    .line 44
    if-eqz v5, :cond_38

    .line 45
    .line 46
    iget-object v4, v5, Lm/b1;->a:Lm/p0;

    .line 47
    .line 48
    iget-object v6, v5, Lm/b1;->f:La7/a;

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    if-nez v6, :cond_3

    .line 52
    .line 53
    iget-object v6, v5, Lm/b1;->b:Lm/w0;

    .line 54
    .line 55
    if-nez v6, :cond_2

    .line 56
    .line 57
    new-instance v6, Lm/w0;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object v7, Lm/v0;->i:Lm/v0;

    .line 63
    .line 64
    iput-object v7, v6, Lm/w0;->b:Lm/v0;

    .line 65
    .line 66
    iput-boolean v11, v6, Lm/w0;->c:Z

    .line 67
    .line 68
    iput-object v6, v5, Lm/b1;->b:Lm/w0;

    .line 69
    .line 70
    :cond_2
    iput-object v6, v5, Lm/b1;->f:La7/a;

    .line 71
    .line 72
    :cond_3
    iget-object v6, v5, Lm/b1;->f:La7/a;

    .line 73
    .line 74
    if-eqz v6, :cond_37

    .line 75
    .line 76
    instance-of v7, v6, Lm/w0;

    .line 77
    .line 78
    const-wide/16 v14, 0x0

    .line 79
    .line 80
    sget-object v8, Ls1/l;->g:Ls1/l;

    .line 81
    .line 82
    const/4 v9, 0x1

    .line 83
    sget-object v10, Ls1/l;->h:Ls1/l;

    .line 84
    .line 85
    if-eqz v7, :cond_c

    .line 86
    .line 87
    check-cast v6, Lm/w0;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    goto/16 :goto_13

    .line 96
    .line 97
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    :goto_0
    if-ge v11, v7, :cond_6

    .line 102
    .line 103
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v16

    .line 107
    check-cast v16, Lp1/b;

    .line 108
    .line 109
    invoke-static/range {v16 .. v16}, Lac/p;->j(Lp1/b;)Z

    .line 110
    .line 111
    .line 112
    move-result v16

    .line 113
    if-nez v16, :cond_5

    .line 114
    .line 115
    goto/16 :goto_13

    .line 116
    .line 117
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lp1/b;

    .line 125
    .line 126
    iget-object v7, v6, Lm/w0;->b:Lm/v0;

    .line 127
    .line 128
    sget-object v11, Lm/a1;->a:[I

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    aget v7, v11, v7

    .line 135
    .line 136
    sget-object v11, Lm/v0;->h:Lm/v0;

    .line 137
    .line 138
    sget-object v12, Lm/v0;->g:Lm/v0;

    .line 139
    .line 140
    if-ne v7, v9, :cond_8

    .line 141
    .line 142
    invoke-virtual {v4}, Lm/p0;->C1()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_7

    .line 147
    .line 148
    move-object v4, v12

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    move-object v4, v11

    .line 151
    goto :goto_1

    .line 152
    :cond_8
    iget-object v4, v6, Lm/w0;->b:Lm/v0;

    .line 153
    .line 154
    :goto_1
    iput-object v4, v6, Lm/w0;->b:Lm/v0;

    .line 155
    .line 156
    if-ne v2, v8, :cond_9

    .line 157
    .line 158
    if-ne v4, v11, :cond_9

    .line 159
    .line 160
    iput-boolean v9, v1, Lp1/b;->i:Z

    .line 161
    .line 162
    iput-boolean v9, v6, Lm/w0;->c:Z

    .line 163
    .line 164
    :cond_9
    if-ne v2, v10, :cond_38

    .line 165
    .line 166
    if-ne v4, v12, :cond_a

    .line 167
    .line 168
    iget-wide v7, v1, Lp1/b;->a:J

    .line 169
    .line 170
    const-wide/16 v9, 0x0

    .line 171
    .line 172
    const/16 v11, 0xc

    .line 173
    .line 174
    move-object v6, v1

    .line 175
    invoke-static/range {v5 .. v11}, Lm/b1;->c(Lm/b1;Lp1/b;JJI)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_a
    iget-boolean v2, v6, Lm/w0;->c:Z

    .line 180
    .line 181
    if-eqz v2, :cond_38

    .line 182
    .line 183
    new-instance v8, Lp1/a;

    .line 184
    .line 185
    invoke-direct {v8, v3}, Lp1/a;-><init>(I)V

    .line 186
    .line 187
    .line 188
    const-wide/16 v9, 0x0

    .line 189
    .line 190
    move-object v7, v1

    .line 191
    move-object v6, v1

    .line 192
    invoke-virtual/range {v5 .. v10}, Lm/b1;->f(Lp1/b;Lp1/b;Lp1/a;J)V

    .line 193
    .line 194
    .line 195
    new-instance v1, Lp1/a;

    .line 196
    .line 197
    invoke-direct {v1, v3}, Lp1/a;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5, v6, v1, v14, v15}, Lm/b1;->e(Lp1/b;Lp1/a;J)V

    .line 201
    .line 202
    .line 203
    iget-wide v1, v6, Lp1/b;->a:J

    .line 204
    .line 205
    iget-object v3, v5, Lm/b1;->c:Lm/z0;

    .line 206
    .line 207
    if-nez v3, :cond_b

    .line 208
    .line 209
    new-instance v3, Lm/z0;

    .line 210
    .line 211
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    const-wide v6, 0x7fffffffffffffffL

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    iput-wide v6, v3, Lm/z0;->b:J

    .line 220
    .line 221
    iput-object v3, v5, Lm/b1;->c:Lm/z0;

    .line 222
    .line 223
    :cond_b
    iput-wide v1, v3, Lm/z0;->b:J

    .line 224
    .line 225
    iput-object v3, v5, Lm/b1;->f:La7/a;

    .line 226
    .line 227
    return-void

    .line 228
    :cond_c
    instance-of v7, v6, Lm/y0;

    .line 229
    .line 230
    sget-object v12, Ls1/l;->i:Ls1/l;

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    if-eqz v7, :cond_22

    .line 234
    .line 235
    move-object v14, v6

    .line 236
    check-cast v14, Lm/y0;

    .line 237
    .line 238
    if-ne v2, v8, :cond_d

    .line 239
    .line 240
    goto/16 :goto_13

    .line 241
    .line 242
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    move v7, v11

    .line 247
    :goto_2
    if-ge v7, v6, :cond_f

    .line 248
    .line 249
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    move-object v15, v8

    .line 254
    check-cast v15, Lp1/b;

    .line 255
    .line 256
    move-object/from16 v17, v12

    .line 257
    .line 258
    iget-wide v11, v15, Lp1/b;->a:J

    .line 259
    .line 260
    move-object/from16 v19, v10

    .line 261
    .line 262
    iget-wide v9, v14, Lm/y0;->c:J

    .line 263
    .line 264
    invoke-static {v11, v12, v9, v10}, Ls1/s;->e(JJ)Z

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    if-eqz v9, :cond_e

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 272
    .line 273
    move-object/from16 v12, v17

    .line 274
    .line 275
    move-object/from16 v10, v19

    .line 276
    .line 277
    const/4 v9, 0x1

    .line 278
    const/4 v11, 0x0

    .line 279
    goto :goto_2

    .line 280
    :cond_f
    move-object/from16 v19, v10

    .line 281
    .line 282
    move-object/from16 v17, v12

    .line 283
    .line 284
    move-object v8, v13

    .line 285
    :goto_3
    check-cast v8, Lp1/b;

    .line 286
    .line 287
    if-nez v8, :cond_13

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    const/4 v7, 0x0

    .line 294
    :goto_4
    if-ge v7, v6, :cond_11

    .line 295
    .line 296
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    move-object v9, v8

    .line 301
    check-cast v9, Lp1/b;

    .line 302
    .line 303
    iget-boolean v9, v9, Lp1/b;->d:Z

    .line 304
    .line 305
    if-eqz v9, :cond_10

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_11
    move-object v8, v13

    .line 312
    :goto_5
    check-cast v8, Lp1/b;

    .line 313
    .line 314
    if-nez v8, :cond_12

    .line 315
    .line 316
    invoke-virtual {v5}, Lm/b1;->a()V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :cond_12
    iget-wide v6, v8, Lp1/b;->a:J

    .line 321
    .line 322
    iput-wide v6, v14, Lm/y0;->c:J

    .line 323
    .line 324
    :cond_13
    move-object v7, v8

    .line 325
    const-string v11, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 326
    .line 327
    const-string v12, "AwaitTouchSlop.initialDown was not initialized"

    .line 328
    .line 329
    move-object/from16 v8, v19

    .line 330
    .line 331
    if-ne v2, v8, :cond_16

    .line 332
    .line 333
    iget-boolean v6, v7, Lp1/b;->i:Z

    .line 334
    .line 335
    if-nez v6, :cond_1c

    .line 336
    .line 337
    invoke-static {v7}, Lac/p;->c(Lp1/b;)Z

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    if-eqz v6, :cond_18

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    const/4 v4, 0x0

    .line 348
    :goto_6
    if-ge v4, v3, :cond_15

    .line 349
    .line 350
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    move-object v8, v6

    .line 355
    check-cast v8, Lp1/b;

    .line 356
    .line 357
    iget-boolean v8, v8, Lp1/b;->d:Z

    .line 358
    .line 359
    if-eqz v8, :cond_14

    .line 360
    .line 361
    move-object v13, v6

    .line 362
    goto :goto_7

    .line 363
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_15
    :goto_7
    check-cast v13, Lp1/b;

    .line 367
    .line 368
    if-nez v13, :cond_17

    .line 369
    .line 370
    invoke-virtual {v5}, Lm/b1;->a()V

    .line 371
    .line 372
    .line 373
    :cond_16
    :goto_8
    move-object/from16 v9, v17

    .line 374
    .line 375
    goto/16 :goto_9

    .line 376
    .line 377
    :cond_17
    iget-wide v3, v13, Lp1/b;->a:J

    .line 378
    .line 379
    iput-wide v3, v14, Lm/y0;->c:J

    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_18
    sget-object v1, Ly1/h1;->t:Li0/m2;

    .line 383
    .line 384
    invoke-static {v4, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    check-cast v1, Ly1/l2;

    .line 389
    .line 390
    sget v6, Lm/j0;->a:F

    .line 391
    .line 392
    invoke-interface {v1}, Ly1/l2;->f()F

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    iget-object v6, v5, Lm/b1;->i:Lm/a3;

    .line 397
    .line 398
    if-eqz v6, :cond_1b

    .line 399
    .line 400
    iget-object v4, v4, Lm/p0;->w:Lm/p1;

    .line 401
    .line 402
    new-instance v8, Lp1/a;

    .line 403
    .line 404
    invoke-direct {v8, v3}, Lp1/a;-><init>(I)V

    .line 405
    .line 406
    .line 407
    move-object v10, v5

    .line 408
    const/4 v9, 0x1

    .line 409
    invoke-static {v7, v4, v8, v9}, Lac/p;->H(Lp1/b;Lm/p1;Lp1/a;Z)J

    .line 410
    .line 411
    .line 412
    move-result-wide v4

    .line 413
    invoke-virtual {v6, v4, v5, v1, v9}, Lm/a3;->a(JFZ)J

    .line 414
    .line 415
    .line 416
    move-result-wide v4

    .line 417
    const-wide v18, 0x7fffffff7fffffffL

    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    and-long v18, v4, v18

    .line 423
    .line 424
    const-wide v20, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    cmp-long v1, v18, v20

    .line 430
    .line 431
    if-eqz v1, :cond_1a

    .line 432
    .line 433
    iput-boolean v9, v7, Lp1/b;->i:Z

    .line 434
    .line 435
    iget-object v6, v14, Lm/y0;->b:Lp1/b;

    .line 436
    .line 437
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    new-instance v8, Lp1/a;

    .line 441
    .line 442
    invoke-direct {v8, v3}, Lp1/a;-><init>(I)V

    .line 443
    .line 444
    .line 445
    move-wide/from16 v26, v4

    .line 446
    .line 447
    move-object v5, v10

    .line 448
    move-wide/from16 v9, v26

    .line 449
    .line 450
    invoke-virtual/range {v5 .. v10}, Lm/b1;->f(Lp1/b;Lp1/b;Lp1/a;J)V

    .line 451
    .line 452
    .line 453
    new-instance v1, Lp1/a;

    .line 454
    .line 455
    invoke-direct {v1, v3}, Lp1/a;-><init>(I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v5, v7, v1, v9, v10}, Lm/b1;->e(Lp1/b;Lp1/a;J)V

    .line 459
    .line 460
    .line 461
    iget-wide v3, v7, Lp1/b;->a:J

    .line 462
    .line 463
    iget-object v1, v5, Lm/b1;->c:Lm/z0;

    .line 464
    .line 465
    if-nez v1, :cond_19

    .line 466
    .line 467
    new-instance v1, Lm/z0;

    .line 468
    .line 469
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 470
    .line 471
    .line 472
    const-wide v8, 0x7fffffffffffffffL

    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    iput-wide v8, v1, Lm/z0;->b:J

    .line 478
    .line 479
    iput-object v1, v5, Lm/b1;->c:Lm/z0;

    .line 480
    .line 481
    :cond_19
    iput-wide v3, v1, Lm/z0;->b:J

    .line 482
    .line 483
    iput-object v1, v5, Lm/b1;->f:La7/a;

    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_1a
    move-object v5, v10

    .line 487
    iput-boolean v9, v14, Lm/y0;->d:Z

    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_1b
    const-string v1, "Touch slop detector not initialized."

    .line 491
    .line 492
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :cond_1c
    iget-object v1, v14, Lm/y0;->b:Lp1/b;

    .line 497
    .line 498
    if-eqz v1, :cond_1e

    .line 499
    .line 500
    iget-wide v3, v14, Lm/y0;->c:J

    .line 501
    .line 502
    iget-object v6, v5, Lm/b1;->i:Lm/a3;

    .line 503
    .line 504
    if-eqz v6, :cond_1d

    .line 505
    .line 506
    invoke-virtual {v5, v1, v3, v4, v6}, Lm/b1;->b(Lp1/b;JLm/a3;)V

    .line 507
    .line 508
    .line 509
    goto/16 :goto_8

    .line 510
    .line 511
    :cond_1d
    invoke-static {v11}, Lj8/o;->t(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :cond_1e
    invoke-static {v12}, Lj8/o;->t(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    return-void

    .line 519
    :goto_9
    if-ne v2, v9, :cond_38

    .line 520
    .line 521
    iget-boolean v1, v14, Lm/y0;->d:Z

    .line 522
    .line 523
    if-eqz v1, :cond_38

    .line 524
    .line 525
    iget-boolean v1, v7, Lp1/b;->i:Z

    .line 526
    .line 527
    if-eqz v1, :cond_21

    .line 528
    .line 529
    iget-object v1, v14, Lm/y0;->b:Lp1/b;

    .line 530
    .line 531
    if-eqz v1, :cond_20

    .line 532
    .line 533
    iget-wide v2, v14, Lm/y0;->c:J

    .line 534
    .line 535
    iget-object v4, v5, Lm/b1;->i:Lm/a3;

    .line 536
    .line 537
    if-eqz v4, :cond_1f

    .line 538
    .line 539
    invoke-virtual {v5, v1, v2, v3, v4}, Lm/b1;->b(Lp1/b;JLm/a3;)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :cond_1f
    invoke-static {v11}, Lj8/o;->t(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_20
    invoke-static {v12}, Lj8/o;->t(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :cond_21
    const/4 v1, 0x0

    .line 552
    iput-boolean v1, v14, Lm/y0;->d:Z

    .line 553
    .line 554
    return-void

    .line 555
    :cond_22
    move-object v8, v10

    .line 556
    move-object v9, v12

    .line 557
    instance-of v7, v6, Lm/x0;

    .line 558
    .line 559
    if-eqz v7, :cond_2a

    .line 560
    .line 561
    check-cast v6, Lm/x0;

    .line 562
    .line 563
    if-eq v2, v9, :cond_23

    .line 564
    .line 565
    goto/16 :goto_13

    .line 566
    .line 567
    :cond_23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    const/4 v7, 0x0

    .line 572
    :goto_a
    if-ge v7, v2, :cond_25

    .line 573
    .line 574
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    check-cast v8, Lp1/b;

    .line 579
    .line 580
    iget-boolean v8, v8, Lp1/b;->i:Z

    .line 581
    .line 582
    if-eqz v8, :cond_24

    .line 583
    .line 584
    const/4 v9, 0x0

    .line 585
    goto :goto_b

    .line 586
    :cond_24
    add-int/lit8 v7, v7, 0x1

    .line 587
    .line 588
    goto :goto_a

    .line 589
    :cond_25
    const/4 v9, 0x1

    .line 590
    :goto_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    const/4 v11, 0x0

    .line 595
    :goto_c
    if-ge v11, v2, :cond_29

    .line 596
    .line 597
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v7

    .line 601
    check-cast v7, Lp1/b;

    .line 602
    .line 603
    iget-boolean v7, v7, Lp1/b;->d:Z

    .line 604
    .line 605
    if-eqz v7, :cond_28

    .line 606
    .line 607
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-eqz v2, :cond_26

    .line 612
    .line 613
    goto :goto_d

    .line 614
    :cond_26
    if-eqz v9, :cond_38

    .line 615
    .line 616
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    check-cast v1, Lp1/b;

    .line 621
    .line 622
    iget-object v2, v4, Lm/p0;->w:Lm/p1;

    .line 623
    .line 624
    new-instance v7, Lp1/a;

    .line 625
    .line 626
    invoke-direct {v7, v3}, Lp1/a;-><init>(I)V

    .line 627
    .line 628
    .line 629
    invoke-static {v1, v2, v7}, Lac/p;->I(Lp1/b;Lm/p1;Lp1/a;)J

    .line 630
    .line 631
    .line 632
    move-result-wide v1

    .line 633
    iget-object v7, v6, Lm/x0;->b:Lp1/b;

    .line 634
    .line 635
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    iget-object v4, v4, Lm/p0;->w:Lm/p1;

    .line 639
    .line 640
    new-instance v8, Lp1/a;

    .line 641
    .line 642
    invoke-direct {v8, v3}, Lp1/a;-><init>(I)V

    .line 643
    .line 644
    .line 645
    invoke-static {v7, v4, v8}, Lac/p;->I(Lp1/b;Lm/p1;Lp1/a;)J

    .line 646
    .line 647
    .line 648
    move-result-wide v3

    .line 649
    invoke-static {v1, v2, v3, v4}, Le1/b;->d(JJ)J

    .line 650
    .line 651
    .line 652
    move-result-wide v9

    .line 653
    iget-object v1, v6, Lm/x0;->b:Lp1/b;

    .line 654
    .line 655
    if-eqz v1, :cond_27

    .line 656
    .line 657
    iget-wide v7, v6, Lm/x0;->c:J

    .line 658
    .line 659
    const/16 v11, 0x8

    .line 660
    .line 661
    move-object v6, v1

    .line 662
    invoke-static/range {v5 .. v11}, Lm/b1;->c(Lm/b1;Lp1/b;JJI)V

    .line 663
    .line 664
    .line 665
    return-void

    .line 666
    :cond_27
    const-string v1, "AwaitGesturePickup.initialDown was not initialized."

    .line 667
    .line 668
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    return-void

    .line 672
    :cond_28
    add-int/lit8 v11, v11, 0x1

    .line 673
    .line 674
    goto :goto_c

    .line 675
    :cond_29
    :goto_d
    invoke-virtual {v5}, Lm/b1;->a()V

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :cond_2a
    instance-of v7, v6, Lm/z0;

    .line 680
    .line 681
    if-eqz v7, :cond_36

    .line 682
    .line 683
    check-cast v6, Lm/z0;

    .line 684
    .line 685
    if-eq v2, v8, :cond_2b

    .line 686
    .line 687
    goto/16 :goto_13

    .line 688
    .line 689
    :cond_2b
    iget-wide v7, v6, Lm/z0;->b:J

    .line 690
    .line 691
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    const/4 v9, 0x0

    .line 696
    :goto_e
    if-ge v9, v2, :cond_2d

    .line 697
    .line 698
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    move-object v11, v10

    .line 703
    check-cast v11, Lp1/b;

    .line 704
    .line 705
    iget-wide v11, v11, Lp1/b;->a:J

    .line 706
    .line 707
    invoke-static {v11, v12, v7, v8}, Ls1/s;->e(JJ)Z

    .line 708
    .line 709
    .line 710
    move-result v11

    .line 711
    if-eqz v11, :cond_2c

    .line 712
    .line 713
    goto :goto_f

    .line 714
    :cond_2c
    add-int/lit8 v9, v9, 0x1

    .line 715
    .line 716
    goto :goto_e

    .line 717
    :cond_2d
    move-object v10, v13

    .line 718
    :goto_f
    check-cast v10, Lp1/b;

    .line 719
    .line 720
    if-nez v10, :cond_2e

    .line 721
    .line 722
    goto/16 :goto_13

    .line 723
    .line 724
    :cond_2e
    invoke-static {v10}, Lac/p;->c(Lp1/b;)Z

    .line 725
    .line 726
    .line 727
    move-result v2

    .line 728
    sget-object v7, Lm/x;->a:Lm/x;

    .line 729
    .line 730
    if-eqz v2, :cond_33

    .line 731
    .line 732
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 733
    .line 734
    .line 735
    move-result v2

    .line 736
    const/4 v8, 0x0

    .line 737
    :goto_10
    if-ge v8, v2, :cond_30

    .line 738
    .line 739
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v9

    .line 743
    move-object v11, v9

    .line 744
    check-cast v11, Lp1/b;

    .line 745
    .line 746
    iget-boolean v11, v11, Lp1/b;->d:Z

    .line 747
    .line 748
    if-eqz v11, :cond_2f

    .line 749
    .line 750
    goto :goto_11

    .line 751
    :cond_2f
    add-int/lit8 v8, v8, 0x1

    .line 752
    .line 753
    goto :goto_10

    .line 754
    :cond_30
    move-object v9, v13

    .line 755
    :goto_11
    check-cast v9, Lp1/b;

    .line 756
    .line 757
    if-nez v9, :cond_32

    .line 758
    .line 759
    iget-boolean v1, v10, Lp1/b;->i:Z

    .line 760
    .line 761
    if-nez v1, :cond_31

    .line 762
    .line 763
    invoke-static {v10}, Lac/p;->c(Lp1/b;)Z

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    if-eqz v1, :cond_31

    .line 768
    .line 769
    new-instance v1, Lp1/a;

    .line 770
    .line 771
    invoke-direct {v1, v3}, Lp1/a;-><init>(I)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v5}, Lm/b1;->d()Lm/a;

    .line 775
    .line 776
    .line 777
    move-result-object v19

    .line 778
    iget-object v2, v4, Lm/p0;->w:Lm/p1;

    .line 779
    .line 780
    iget-object v3, v5, Lm/b1;->j:La5/a;

    .line 781
    .line 782
    iget-wide v6, v5, Lm/b1;->l:J

    .line 783
    .line 784
    move-object/from16 v22, v1

    .line 785
    .line 786
    move-object/from16 v21, v2

    .line 787
    .line 788
    move-object/from16 v23, v3

    .line 789
    .line 790
    move-wide/from16 v24, v6

    .line 791
    .line 792
    move-object/from16 v20, v10

    .line 793
    .line 794
    invoke-static/range {v19 .. v25}, Lac/p;->b(Lm/a;Lp1/b;Lm/p1;Lp1/a;La5/a;J)V

    .line 795
    .line 796
    .line 797
    sget-object v1, Ly1/h1;->t:Li0/m2;

    .line 798
    .line 799
    invoke-static {v4, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    check-cast v1, Ly1/l2;

    .line 804
    .line 805
    invoke-interface {v1}, Ly1/l2;->e()F

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    invoke-virtual {v5}, Lm/b1;->d()Lm/a;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    invoke-static {v1, v1}, La/a;->d(FF)J

    .line 814
    .line 815
    .line 816
    move-result-wide v6

    .line 817
    invoke-virtual {v2, v6, v7}, Lm/a;->j(J)J

    .line 818
    .line 819
    .line 820
    move-result-wide v1

    .line 821
    invoke-virtual {v5}, Lm/b1;->d()Lm/a;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    iget-object v3, v3, Lm/a;->h:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v3, Lt1/b;

    .line 828
    .line 829
    iget-object v6, v3, Lt1/b;->a:Lt1/d;

    .line 830
    .line 831
    iget-object v7, v6, Lt1/d;->d:[Lt1/a;

    .line 832
    .line 833
    invoke-static {v13, v7}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    const/4 v7, 0x0

    .line 837
    iput v7, v6, Lt1/d;->e:I

    .line 838
    .line 839
    iget-object v6, v3, Lt1/b;->b:Lt1/d;

    .line 840
    .line 841
    iget-object v8, v6, Lt1/d;->d:[Lt1/a;

    .line 842
    .line 843
    invoke-static {v13, v8}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    iput v7, v6, Lt1/d;->e:I

    .line 847
    .line 848
    iput-wide v14, v3, Lt1/b;->c:J

    .line 849
    .line 850
    new-instance v3, Lm/a0;

    .line 851
    .line 852
    invoke-static {v1, v2}, Lm/s0;->c(J)J

    .line 853
    .line 854
    .line 855
    move-result-wide v1

    .line 856
    const/4 v9, 0x1

    .line 857
    invoke-direct {v3, v1, v2, v9}, Lm/a0;-><init>(JZ)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v4, v3}, Lm/p0;->v1(Lm/b0;)V

    .line 861
    .line 862
    .line 863
    goto :goto_12

    .line 864
    :cond_31
    invoke-virtual {v4, v7}, Lm/p0;->v1(Lm/b0;)V

    .line 865
    .line 866
    .line 867
    :goto_12
    invoke-virtual {v5}, Lm/b1;->a()V

    .line 868
    .line 869
    .line 870
    return-void

    .line 871
    :cond_32
    iget-wide v1, v9, Lp1/b;->a:J

    .line 872
    .line 873
    iput-wide v1, v6, Lm/z0;->b:J

    .line 874
    .line 875
    return-void

    .line 876
    :cond_33
    iget-boolean v1, v10, Lp1/b;->i:Z

    .line 877
    .line 878
    if-eqz v1, :cond_34

    .line 879
    .line 880
    invoke-virtual {v4, v7}, Lm/p0;->v1(Lm/b0;)V

    .line 881
    .line 882
    .line 883
    return-void

    .line 884
    :cond_34
    iget-object v1, v4, Lm/p0;->w:Lm/p1;

    .line 885
    .line 886
    new-instance v2, Lp1/a;

    .line 887
    .line 888
    invoke-direct {v2, v3}, Lp1/a;-><init>(I)V

    .line 889
    .line 890
    .line 891
    const/4 v9, 0x1

    .line 892
    invoke-static {v10, v1, v2, v9}, Lac/p;->H(Lp1/b;Lm/p1;Lp1/a;Z)J

    .line 893
    .line 894
    .line 895
    move-result-wide v1

    .line 896
    invoke-static {v1, v2}, Le1/b;->c(J)F

    .line 897
    .line 898
    .line 899
    move-result v1

    .line 900
    const/4 v2, 0x0

    .line 901
    cmpg-float v1, v1, v2

    .line 902
    .line 903
    if-nez v1, :cond_35

    .line 904
    .line 905
    goto :goto_13

    .line 906
    :cond_35
    iget-object v1, v4, Lm/p0;->w:Lm/p1;

    .line 907
    .line 908
    new-instance v2, Lp1/a;

    .line 909
    .line 910
    invoke-direct {v2, v3}, Lp1/a;-><init>(I)V

    .line 911
    .line 912
    .line 913
    const/4 v7, 0x0

    .line 914
    invoke-static {v10, v1, v2, v7}, Lac/p;->H(Lp1/b;Lm/p1;Lp1/a;Z)J

    .line 915
    .line 916
    .line 917
    move-result-wide v1

    .line 918
    new-instance v4, Lp1/a;

    .line 919
    .line 920
    invoke-direct {v4, v3}, Lp1/a;-><init>(I)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v5, v10, v4, v1, v2}, Lm/b1;->e(Lp1/b;Lp1/a;J)V

    .line 924
    .line 925
    .line 926
    const/4 v9, 0x1

    .line 927
    iput-boolean v9, v10, Lp1/b;->i:Z

    .line 928
    .line 929
    return-void

    .line 930
    :cond_36
    invoke-static {}, Lokio/a;->k()V

    .line 931
    .line 932
    .line 933
    return-void

    .line 934
    :cond_37
    const-string v1, "currentDragState should not be null"

    .line 935
    .line 936
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    :cond_38
    :goto_13
    return-void
.end method

.method public final X(Ls1/t;)Z
    .locals 8

    .line 1
    invoke-static {p1}, Ls1/s;->b(Ls1/t;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, Lm/p0;->y:Z

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    invoke-static {p1}, Ls1/s;->d(Ls1/t;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lm/p0;->M:Lm/a3;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    new-instance v0, Lm/a3;

    .line 24
    .line 25
    iget-object v2, p0, Lm/p0;->w:Lm/p1;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lm/a3;-><init>(Lm/p1;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lm/p0;->M:Lm/a3;

    .line 31
    .line 32
    :cond_2
    sget-object v0, Ly1/h1;->t:Li0/m2;

    .line 33
    .line 34
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ly1/l2;

    .line 39
    .line 40
    invoke-interface {v0}, Ly1/l2;->f()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p1, v1}, Ls1/s;->h(Ls1/t;Z)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iget-object p1, p0, Lm/p0;->M:Lm/a3;

    .line 49
    .line 50
    if-eqz p1, :cond_7

    .line 51
    .line 52
    invoke-virtual {p1, v2, v3, v0, v1}, Lm/a3;->a(JFZ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v4, v5, v6, v7}, Le1/b;->b(JJ)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    iget-wide v4, p1, Lm/a3;->b:J

    .line 68
    .line 69
    invoke-static {v4, v5, v2, v3}, Le1/b;->e(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    const/16 v0, 0x20

    .line 74
    .line 75
    shr-long v4, v2, v0

    .line 76
    .line 77
    long-to-int v0, v4

    .line 78
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const-wide v4, 0xffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v2, v4

    .line 92
    long-to-int v2, v2

    .line 93
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    float-to-double v2, v2

    .line 102
    float-to-double v4, v0

    .line 103
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    double-to-float v0, v2

    .line 108
    const/16 v2, 0xb4

    .line 109
    .line 110
    int-to-float v2, v2

    .line 111
    mul-float/2addr v0, v2

    .line 112
    float-to-double v2, v0

    .line 113
    const-wide v4, 0x400921fb54442d18L    # Math.PI

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    div-double/2addr v2, v4

    .line 119
    iget-object p1, p1, Lm/a3;->a:Lm/p1;

    .line 120
    .line 121
    if-nez p1, :cond_3

    .line 122
    .line 123
    const/4 p1, -0x1

    .line 124
    goto :goto_0

    .line 125
    :cond_3
    sget-object v0, Lm/z2;->a:[I

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    aget p1, v0, p1

    .line 132
    .line 133
    :goto_0
    const/4 v0, 0x1

    .line 134
    const-wide/high16 v4, 0x403e000000000000L    # 30.0

    .line 135
    .line 136
    if-eq p1, v0, :cond_5

    .line 137
    .line 138
    const/4 v6, 0x2

    .line 139
    if-eq p1, v6, :cond_4

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    cmpl-double p1, v2, v4

    .line 143
    .line 144
    if-lez p1, :cond_6

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    cmpg-double p1, v2, v4

    .line 148
    .line 149
    if-gez p1, :cond_6

    .line 150
    .line 151
    :goto_1
    return v0

    .line 152
    :cond_6
    :goto_2
    return v1

    .line 153
    :cond_7
    const-string p1, "Touch slop detector not initialized."

    .line 154
    .line 155
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const/4 p1, 0x0

    .line 159
    return p1
.end method

.method public final b0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm/p0;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lm/p0;->s1()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lm/p0;->D:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lm/p0;->y1()Lsg/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lm/x;->a:Lm/x;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lm/p0;->K:Lm/a;

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lm/p0;->E:Z

    .line 26
    .line 27
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm/p0;->D:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lm/p0;->q1()V

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lm/p0;->O:J

    .line 10
    .line 11
    iget-object v0, p0, Lm/p0;->A:Lk/l0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lx1/j;->l1(Lx1/i;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lm/p0;->A:Lk/l0;

    .line 20
    .line 21
    return-void
.end method

.method public final q1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/p0;->C:Ln/b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lm/p0;->z:Ln/k;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Ln/a;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Ln/a;-><init>(Ln/b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ln/k;->b(Ln/j;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lm/p0;->C:Ln/b;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public abstract r1(Lm/o0;Lm/o0;)Ljava/lang/Object;
.end method

.method public final s1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/p0;->F:Lm/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lm/s;->i:Lm/s;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lm/t;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Lm/t;->g:Lm/s;

    .line 14
    .line 15
    iput-boolean v1, v0, Lm/t;->h:Z

    .line 16
    .line 17
    iput-object v0, p0, Lm/p0;->F:Lm/t;

    .line 18
    .line 19
    :cond_0
    iput-object v2, v0, Lm/t;->g:Lm/s;

    .line 20
    .line 21
    iput-boolean v1, v0, Lm/t;->h:Z

    .line 22
    .line 23
    iput-object v0, p0, Lm/p0;->J:Lx6/d;

    .line 24
    .line 25
    return-void
.end method

.method public final t1(Ls1/t;JLm/a3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/p0;->I:Lm/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm/u;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lm/u;->g:Ls1/t;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Lm/u;->h:J

    .line 19
    .line 20
    iput-object v0, p0, Lm/p0;->I:Lm/u;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Lm/u;->g:Ls1/t;

    .line 23
    .line 24
    iput-wide p2, v0, Lm/u;->h:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Lm/a3;->b:J

    .line 29
    .line 30
    iput-object v0, p0, Lm/p0;->J:Lx6/d;

    .line 31
    .line 32
    return-void
.end method

.method public final v1(Lm/b0;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lm/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lm/p0;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lm/p0;->D:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lm/p0;->D1()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lm/p0;->y1()Lsg/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public abstract w1(J)V
.end method

.method public abstract x1(Lm/a0;)V
.end method

.method public final y0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/p0;->N:Lm/b1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lm/b1;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lm/b1;->a:Lm/p0;

    .line 9
    .line 10
    iget-boolean v2, v1, Lm/p0;->D:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Lm/x;->a:Lm/x;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lm/p0;->v1(Lm/b0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    iput-object v1, v0, Lm/b1;->g:Lm/a;

    .line 21
    .line 22
    iget-object v0, v0, Lm/b1;->k:La5/a;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput v1, v0, La5/a;->h:I

    .line 26
    .line 27
    iget-object v0, v0, La5/a;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lf/y;

    .line 30
    .line 31
    iput v1, v0, Lf/y;->b:I

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final y1()Lsg/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/p0;->B:Lsg/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Events channel not initialized."

    .line 7
    .line 8
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final z1()Lm/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/p0;->K:Lm/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method
