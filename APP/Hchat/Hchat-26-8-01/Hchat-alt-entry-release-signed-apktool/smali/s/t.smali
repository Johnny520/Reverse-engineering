.class public final Ls/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final q:J

.field public static final synthetic r:I


# instance fields
.field public final a:Lqg/t;

.field public final b:Lf1/z;

.field public final c:Li/e0;

.field public d:Li/y;

.field public e:Z

.field public final f:Li0/j1;

.field public final g:Li0/j1;

.field public final h:Li0/j1;

.field public final i:Li0/j1;

.field public j:J

.field public k:J

.field public l:Li1/b;

.field public final m:Li/c;

.field public final n:Li/c;

.field public final o:Li0/j1;

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    int-to-long v0, v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shl-long v2, v0, v2

    .line 8
    .line 9
    const-wide v4, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr v0, v4

    .line 15
    or-long/2addr v0, v2

    .line 16
    sput-wide v0, Ls/t;->q:J

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lqg/t;Lf1/z;Li/e0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/t;->a:Lqg/t;

    .line 5
    .line 6
    iput-object p2, p0, Ls/t;->b:Lf1/z;

    .line 7
    .line 8
    iput-object p3, p0, Ls/t;->c:Li/e0;

    .line 9
    .line 10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iput-object p3, p0, Ls/t;->f:Li0/j1;

    .line 17
    .line 18
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    iput-object p3, p0, Ls/t;->g:Li0/j1;

    .line 23
    .line 24
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iput-object p3, p0, Ls/t;->h:Li0/j1;

    .line 29
    .line 30
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ls/t;->i:Li0/j1;

    .line 35
    .line 36
    sget-wide v0, Ls/t;->q:J

    .line 37
    .line 38
    iput-wide v0, p0, Ls/t;->j:J

    .line 39
    .line 40
    const-wide/16 v2, 0x0

    .line 41
    .line 42
    iput-wide v2, p0, Ls/t;->k:J

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    invoke-interface {p2}, Lf1/z;->c()Li1/b;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object p2, p1

    .line 53
    :goto_0
    iput-object p2, p0, Ls/t;->l:Li1/b;

    .line 54
    .line 55
    new-instance p2, Li/c;

    .line 56
    .line 57
    new-instance p3, Lu2/j;

    .line 58
    .line 59
    invoke-direct {p3, v2, v3}, Lu2/j;-><init>(J)V

    .line 60
    .line 61
    .line 62
    sget-object v4, Li/d;->p:Li/m1;

    .line 63
    .line 64
    const/16 v5, 0xc

    .line 65
    .line 66
    invoke-direct {p2, p3, v4, p1, v5}, Li/c;-><init>(Ljava/lang/Object;Li/m1;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, Ls/t;->m:Li/c;

    .line 70
    .line 71
    new-instance p2, Li/c;

    .line 72
    .line 73
    const/high16 p3, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    sget-object v4, Li/d;->j:Li/m1;

    .line 80
    .line 81
    invoke-direct {p2, p3, v4, p1, v5}, Li/c;-><init>(Ljava/lang/Object;Li/m1;Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    iput-object p2, p0, Ls/t;->n:Li/c;

    .line 85
    .line 86
    new-instance p1, Lu2/j;

    .line 87
    .line 88
    invoke-direct {p1, v2, v3}, Lu2/j;-><init>(J)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Ls/t;->o:Li0/j1;

    .line 96
    .line 97
    iput-wide v0, p0, Ls/t;->p:J

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ls/t;->l:Li1/b;

    .line 2
    .line 3
    iget-object v1, p0, Ls/t;->g:Li0/j1;

    .line 4
    .line 5
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ls/t;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Li1/b;->f(F)V

    .line 25
    .line 26
    .line 27
    :cond_0
    new-instance v0, Ls/s;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p0, v2, v1}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    iget-object v3, p0, Ls/t;->a:Lqg/t;

    .line 36
    .line 37
    invoke-static {v3, v2, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls/t;->h:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-object v0, p0, Ls/t;->f:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x3

    .line 14
    iget-object v2, p0, Ls/t;->a:Lqg/t;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Ls/t;->d(Z)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ls/s;

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    invoke-direct {v0, p0, v4, v5}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v4, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Ls/t;->g:Li0/j1;

    .line 33
    .line 34
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Ls/t;->g:Li0/j1;

    .line 47
    .line 48
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v0, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Ls/s;

    .line 56
    .line 57
    const/4 v5, 0x3

    .line 58
    invoke-direct {v0, p0, v4, v5}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v4, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {p0}, Ls/t;->b()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    iget-object v0, p0, Ls/t;->h:Li0/j1;

    .line 71
    .line 72
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v0, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Ls/s;

    .line 80
    .line 81
    const/4 v5, 0x4

    .line 82
    invoke-direct {v0, p0, v4, v5}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v4, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 86
    .line 87
    .line 88
    :cond_2
    iput-boolean v3, p0, Ls/t;->e:Z

    .line 89
    .line 90
    const-wide/16 v0, 0x0

    .line 91
    .line 92
    invoke-virtual {p0, v0, v1}, Ls/t;->e(J)V

    .line 93
    .line 94
    .line 95
    sget-wide v0, Ls/t;->q:J

    .line 96
    .line 97
    iput-wide v0, p0, Ls/t;->j:J

    .line 98
    .line 99
    iget-object v0, p0, Ls/t;->l:Li1/b;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    iget-object v1, p0, Ls/t;->b:Lf1/z;

    .line 104
    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    invoke-interface {v1, v0}, Lf1/z;->a(Li1/b;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    iput-object v4, p0, Ls/t;->l:Li1/b;

    .line 111
    .line 112
    iput-object v4, p0, Ls/t;->d:Li/y;

    .line 113
    .line 114
    return-void
.end method

.method public final d(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls/t;->f:Li0/j1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e(J)V
    .locals 1

    .line 1
    new-instance v0, Lu2/j;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lu2/j;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls/t;->o:Li0/j1;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
