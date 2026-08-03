.class public abstract Lk/g;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/w1;
.implements Lq1/e;
.implements Lx1/z1;
.implements Lx1/e2;
.implements Lx1/h;
.implements Lx1/m1;
.implements Lp1/c;
.implements Lk/k0;


# static fields
.field public static final Q:Lk/b;


# instance fields
.field public A:Lf2/i;

.field public B:Z

.field public C:Lfg/a;

.field public final D:Lk/i0;

.field public E:Lk/y0;

.field public F:Ls1/l0;

.field public G:Lk/l0;

.field public H:Lx1/i;

.field public I:Ln/m;

.field public J:Ln/h;

.field public final K:Lf/z;

.field public L:Ln/m;

.field public M:Ln/k;

.field public N:Z

.field public O:Lqg/e1;

.field public final P:Lk/b;

.field public w:Ln/k;

.field public x:Lk/y0;

.field public y:Z

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk/g;->Q:Lk/b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/g;->w:Ln/k;

    .line 5
    .line 6
    iput-object p2, p0, Lk/g;->x:Lk/y0;

    .line 7
    .line 8
    iput-boolean p3, p0, Lk/g;->y:Z

    .line 9
    .line 10
    iput-object p5, p0, Lk/g;->z:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lk/g;->A:Lf2/i;

    .line 13
    .line 14
    iput-boolean p4, p0, Lk/g;->B:Z

    .line 15
    .line 16
    move-object/from16 p2, p7

    .line 17
    .line 18
    iput-object p2, p0, Lk/g;->C:Lfg/a;

    .line 19
    .line 20
    new-instance p2, Lk/i0;

    .line 21
    .line 22
    new-instance v0, Lc0/f;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/16 v8, 0x1a

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    const-class v3, Lk/g;

    .line 29
    .line 30
    const-string v4, "onFocusChange"

    .line 31
    .line 32
    const-string v5, "onFocusChange(Z)V"

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    move-object v2, p0

    .line 36
    invoke-direct/range {v0 .. v8}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 37
    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    invoke-direct {p2, p1, p3, v0}, Lk/i0;-><init>(Ln/k;ILc0/f;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lk/g;->D:Lk/i0;

    .line 44
    .line 45
    sget p1, Lf/n;->a:I

    .line 46
    .line 47
    new-instance p1, Lf/z;

    .line 48
    .line 49
    const/4 p2, 0x6

    .line 50
    invoke-direct {p1, p2}, Lf/z;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lk/g;->K:Lf/z;

    .line 54
    .line 55
    iget-object p1, p0, Lk/g;->w:Ln/k;

    .line 56
    .line 57
    iput-object p1, p0, Lk/g;->M:Ln/k;

    .line 58
    .line 59
    if-nez p1, :cond_0

    .line 60
    .line 61
    const/4 p3, 0x1

    .line 62
    :cond_0
    iput-boolean p3, p0, Lk/g;->N:Z

    .line 63
    .line 64
    sget-object p1, Lk/g;->Q:Lk/b;

    .line 65
    .line 66
    iput-object p1, p0, Lk/g;->P:Lk/b;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final C(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk/g;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lk/a;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lk/a;-><init>(Lk/g;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final F()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/g;->P:Lk/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public P(Ls1/k;Ls1/l;J)V
    .locals 8

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    shr-long v1, p3, v0

    .line 4
    .line 5
    const/16 v3, 0x20

    .line 6
    .line 7
    shl-long/2addr v1, v3

    .line 8
    shl-long v4, p3, v3

    .line 9
    .line 10
    shr-long/2addr v4, v0

    .line 11
    const-wide v6, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v4, v6

    .line 17
    or-long v0, v1, v4

    .line 18
    .line 19
    shr-long v2, v0, v3

    .line 20
    .line 21
    long-to-int v2, v2

    .line 22
    int-to-float v2, v2

    .line 23
    and-long/2addr v0, v6

    .line 24
    long-to-int v0, v0

    .line 25
    int-to-float v0, v0

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lk/g;->v1()V

    .line 33
    .line 34
    .line 35
    iget-boolean v0, p0, Lk/g;->B:Z

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lk/g;->G:Lk/l0;

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    new-instance v0, Lk/l0;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Lk/l0;-><init>(Lk/k0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lk/g;->G:Lk/l0;

    .line 52
    .line 53
    :cond_0
    sget-object v0, Ls1/l;->h:Ls1/l;

    .line 54
    .line 55
    if-ne p2, v0, :cond_2

    .line 56
    .line 57
    iget v0, p1, Ls1/k;->f:I

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    const/4 v2, 0x3

    .line 61
    const/4 v3, 0x0

    .line 62
    if-ne v0, v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v1, Lk/f;

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-direct {v1, p0, v3, v4}, Lk/f;-><init>(Lk/g;Lwf/c;I)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/4 v1, 0x5

    .line 79
    if-ne v0, v1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v1, Lk/f;

    .line 86
    .line 87
    const/4 v4, 0x1

    .line 88
    invoke-direct {v1, p0, v3, v4}, Lk/f;-><init>(Lk/g;Lwf/c;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_0
    iget-object v0, p0, Lk/g;->F:Ls1/l0;

    .line 95
    .line 96
    if-nez v0, :cond_3

    .line 97
    .line 98
    invoke-virtual {p0}, Lk/g;->o1()Ls1/l0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lk/g;->F:Ls1/l0;

    .line 108
    .line 109
    :cond_3
    iget-object v0, p0, Lk/g;->F:Ls1/l0;

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0, p1, p2, p3, p4}, Ls1/l0;->P(Ls1/k;Ls1/l;J)V

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void
.end method

.method public final S0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final W(Landroid/view/KeyEvent;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Lk/g;->v1()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lq1/d;->b(Landroid/view/KeyEvent;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-boolean v2, p0, Lk/g;->B:Z

    .line 9
    .line 10
    const/4 v3, 0x3

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v5, p0, Lk/g;->K:Lf/z;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-static {p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v8, 0x2

    .line 23
    if-ne v2, v8, :cond_2

    .line 24
    .line 25
    invoke-static {p1}, Lk/n;->o(Landroid/view/KeyEvent;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v5, v0, v1}, Lf/z;->b(J)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    new-instance v2, Ln/m;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v2, v0, v1}, Lf/z;->g(Ljava/lang/Object;J)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lk/g;->w:Ln/k;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, Lk/e;

    .line 54
    .line 55
    const/4 v5, 0x2

    .line 56
    invoke-direct {v1, p0, v2, v4, v5}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v4, v1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 60
    .line 61
    .line 62
    :cond_0
    move v0, v6

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move v0, v7

    .line 65
    :goto_0
    invoke-virtual {p0, p1}, Lk/g;->x1(Landroid/view/KeyEvent;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_5

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-boolean v2, p0, Lk/g;->B:Z

    .line 75
    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    invoke-static {p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ne v2, v6, :cond_6

    .line 83
    .line 84
    invoke-static {p1}, Lk/n;->o(Landroid/view/KeyEvent;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    invoke-virtual {v5, v0, v1}, Lf/z;->f(J)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ln/m;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    iget-object v1, p0, Lk/g;->w:Ln/k;

    .line 99
    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Lk/e;

    .line 107
    .line 108
    const/4 v5, 0x3

    .line 109
    invoke-direct {v2, p0, v0, v4, v5}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v4, v2, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-virtual {p0, p1}, Lk/g;->y1(Landroid/view/KeyEvent;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    if-eqz v0, :cond_6

    .line 119
    .line 120
    :cond_5
    :goto_1
    return v6

    .line 121
    :cond_6
    return v7
.end method

.method public final X0(Lf2/y;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk/g;->A:Lf2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lf2/i;->a:I

    .line 6
    .line 7
    invoke-static {p1, v0}, Lf2/w;->c(Lf2/y;I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lk/g;->z:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v1, Lk/a;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Lk/a;-><init>(Lk/g;I)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 19
    .line 20
    sget-object v2, Lf2/l;->b:Lf2/x;

    .line 21
    .line 22
    new-instance v3, Lf2/a;

    .line 23
    .line 24
    invoke-direct {v3, v0, v1}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Lk/g;->B:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lk/g;->D:Lk/i0;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lk/i0;->X0(Lf2/y;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object v0, Lf2/u;->j:Lf2/x;

    .line 41
    .line 42
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-interface {p1, v0, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p0, p1}, Lk/g;->n1(Lf2/y;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public b0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk/g;->w:Ln/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lk/g;->J:Ln/h;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Ln/i;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Ln/i;-><init>(Ln/h;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ln/k;->b(Ln/j;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lk/g;->J:Ln/h;

    .line 19
    .line 20
    iget-object v0, p0, Lk/g;->F:Ls1/l0;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Ls1/l0;->b0()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final c1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk/g;->C0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lk/g;->N:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lk/g;->v1()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lk/g;->B:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lk/g;->D:Lk/i0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk/g;->p1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk/g;->M:Ln/k;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Lk/g;->w:Ln/k;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lk/g;->H:Lx1/i;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lx1/j;->l1(Lx1/i;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v1, p0, Lk/g;->H:Lx1/i;

    .line 19
    .line 20
    iget-object v0, p0, Lk/g;->G:Lk/l0;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lx1/j;->l1(Lx1/i;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    iput-object v1, p0, Lk/g;->G:Lk/l0;

    .line 28
    .line 29
    return-void
.end method

.method public n1(Lf2/y;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o1()Ls1/l0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final p1()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lk/g;->w:Ln/k;

    .line 4
    .line 5
    iget-object v2, v0, Lk/g;->K:Lf/z;

    .line 6
    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    iget-object v3, v0, Lk/g;->I:Ln/m;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    new-instance v4, Ln/l;

    .line 14
    .line 15
    invoke-direct {v4, v3}, Ln/l;-><init>(Ln/m;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v4}, Ln/k;->b(Ln/j;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v3, v0, Lk/g;->L:Ln/m;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    new-instance v4, Ln/l;

    .line 26
    .line 27
    invoke-direct {v4, v3}, Ln/l;-><init>(Ln/m;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v4}, Ln/k;->b(Ln/j;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v3, v0, Lk/g;->J:Ln/h;

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    new-instance v4, Ln/i;

    .line 38
    .line 39
    invoke-direct {v4, v3}, Ln/i;-><init>(Ln/h;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v4}, Ln/k;->b(Ln/j;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v3, v2, Lf/z;->c:[Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v4, v2, Lf/z;->a:[J

    .line 48
    .line 49
    array-length v5, v4

    .line 50
    add-int/lit8 v5, v5, -0x2

    .line 51
    .line 52
    if-ltz v5, :cond_6

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    move v7, v6

    .line 56
    :goto_0
    aget-wide v8, v4, v7

    .line 57
    .line 58
    not-long v10, v8

    .line 59
    const/4 v12, 0x7

    .line 60
    shl-long/2addr v10, v12

    .line 61
    and-long/2addr v10, v8

    .line 62
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v10, v12

    .line 68
    cmp-long v10, v10, v12

    .line 69
    .line 70
    if-eqz v10, :cond_5

    .line 71
    .line 72
    sub-int v10, v7, v5

    .line 73
    .line 74
    not-int v10, v10

    .line 75
    ushr-int/lit8 v10, v10, 0x1f

    .line 76
    .line 77
    const/16 v11, 0x8

    .line 78
    .line 79
    rsub-int/lit8 v10, v10, 0x8

    .line 80
    .line 81
    move v12, v6

    .line 82
    :goto_1
    if-ge v12, v10, :cond_4

    .line 83
    .line 84
    const-wide/16 v13, 0xff

    .line 85
    .line 86
    and-long/2addr v13, v8

    .line 87
    const-wide/16 v15, 0x80

    .line 88
    .line 89
    cmp-long v13, v13, v15

    .line 90
    .line 91
    if-gez v13, :cond_3

    .line 92
    .line 93
    shl-int/lit8 v13, v7, 0x3

    .line 94
    .line 95
    add-int/2addr v13, v12

    .line 96
    aget-object v13, v3, v13

    .line 97
    .line 98
    check-cast v13, Ln/m;

    .line 99
    .line 100
    new-instance v14, Ln/l;

    .line 101
    .line 102
    invoke-direct {v14, v13}, Ln/l;-><init>(Ln/m;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v14}, Ln/k;->b(Ln/j;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    shr-long/2addr v8, v11

    .line 109
    add-int/lit8 v12, v12, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    if-ne v10, v11, :cond_6

    .line 113
    .line 114
    :cond_5
    if-eq v7, v5, :cond_6

    .line 115
    .line 116
    add-int/lit8 v7, v7, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    const/4 v1, 0x0

    .line 120
    iput-object v1, v0, Lk/g;->I:Ln/m;

    .line 121
    .line 122
    iput-object v1, v0, Lk/g;->L:Ln/m;

    .line 123
    .line 124
    iput-object v1, v0, Lk/g;->J:Ln/h;

    .line 125
    .line 126
    invoke-virtual {v2}, Lf/z;->a()V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final q1(J)J
    .locals 8

    .line 1
    sget-object v0, Ly1/h1;->t:Li0/m2;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ly1/l2;

    .line 8
    .line 9
    invoke-interface {v0}, Ly1/l2;->d()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v2, v2, Lx1/f0;->E:Lu2/c;

    .line 18
    .line 19
    invoke-interface {v2, v0, v1}, Lu2/c;->L0(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const/16 v2, 0x20

    .line 24
    .line 25
    shr-long v3, v0, v2

    .line 26
    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    shr-long v4, p1, v2

    .line 33
    .line 34
    long-to-int v4, v4

    .line 35
    int-to-float v4, v4

    .line 36
    sub-float/2addr v3, v4

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/high16 v5, 0x40000000    # 2.0f

    .line 43
    .line 44
    div-float/2addr v3, v5

    .line 45
    const-wide v6, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v0, v6

    .line 51
    long-to-int v0, v0

    .line 52
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    and-long/2addr p1, v6

    .line 57
    long-to-int p1, p1

    .line 58
    int-to-float p1, p1

    .line 59
    sub-float/2addr v0, p1

    .line 60
    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    div-float/2addr p1, v5

    .line 65
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    int-to-long v0, p2

    .line 70
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    int-to-long p1, p1

    .line 75
    shl-long/2addr v0, v2

    .line 76
    and-long/2addr p1, v6

    .line 77
    or-long/2addr p1, v0

    .line 78
    return-wide p1
.end method

.method public final r1(Z)V
    .locals 7

    .line 1
    iget-object v1, p0, Lk/g;->w:Ln/k;

    .line 2
    .line 3
    if-eqz v1, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lk/g;->O:Lqg/e1;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lqg/y0;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lk/g;->O:Lqg/e1;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lk/g;->L:Ln/m;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lk/g;->I:Ln/m;

    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_3

    .line 33
    .line 34
    new-instance v2, Ln/l;

    .line 35
    .line 36
    invoke-direct {v2, v0}, Ln/l;-><init>(Ln/m;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lvg/c;

    .line 44
    .line 45
    iget-object v0, v0, Lvg/c;->g:Lwf/g;

    .line 46
    .line 47
    sget-object v3, Lqg/q;->h:Lqg/q;

    .line 48
    .line 49
    invoke-interface {v0, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lqg/r0;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    new-instance v3, Lc9/i;

    .line 58
    .line 59
    const/16 v5, 0x18

    .line 60
    .line 61
    invoke-direct {v3, v1, v5, v2}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v3}, Lqg/r0;->o(Lfg/l;)Lqg/d0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v3, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move-object v3, v4

    .line 71
    :goto_1
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    new-instance v0, Lc0/m;

    .line 76
    .line 77
    const/4 v5, 0x7

    .line 78
    invoke-direct/range {v0 .. v5}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x3

    .line 82
    invoke-static {v6, v4, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 83
    .line 84
    .line 85
    :cond_3
    :goto_2
    if-eqz p1, :cond_4

    .line 86
    .line 87
    iput-object v4, p0, Lk/g;->L:Ln/m;

    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    iput-object v4, p0, Lk/g;->I:Ln/m;

    .line 91
    .line 92
    :cond_5
    return-void
.end method

.method public final s1(JZ)V
    .locals 10

    .line 1
    iget-object v4, p0, Lk/g;->w:Ln/k;

    .line 2
    .line 3
    if-eqz v4, :cond_4

    .line 4
    .line 5
    iget-object v1, p0, Lk/g;->O:Lqg/e1;

    .line 6
    .line 7
    const/4 v7, 0x3

    .line 8
    const/4 v8, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lqg/y0;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v8}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    new-instance v0, Lc0/i;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x3

    .line 29
    move-wide v2, p1

    .line 30
    invoke-direct/range {v0 .. v6}, Lc0/i;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lwf/c;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v9, v8, v0, v7}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    if-eqz p3, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lk/g;->L:Ln/m;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object p1, p0, Lk/g;->I:Ln/m;

    .line 43
    .line 44
    :goto_0
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance v0, Lk/c;

    .line 51
    .line 52
    invoke-direct {v0, p1, v4, v8}, Lk/c;-><init>(Ln/m;Ln/k;Lwf/c;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2, v8, v0, v7}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    if-eqz p3, :cond_3

    .line 59
    .line 60
    iput-object v8, p0, Lk/g;->L:Ln/m;

    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iput-object v8, p0, Lk/g;->I:Ln/m;

    .line 64
    .line 65
    :cond_4
    return-void
.end method

.method public final t1(Lp1/b;)V
    .locals 7

    .line 1
    iget-object v1, p0, Lk/g;->w:Ln/k;

    .line 2
    .line 3
    if-eqz v1, :cond_2

    .line 4
    .line 5
    new-instance v2, Ln/m;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lgg/q;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v3, Lc9/i;

    .line 16
    .line 17
    const/16 v4, 0x1b

    .line 18
    .line 19
    invoke-direct {v3, p1, v4, v0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Li/x0;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {p1, v3, v4}, Li/x0;-><init>(Lfg/l;I)V

    .line 26
    .line 27
    .line 28
    sget-object v3, Lk/l0;->v:Lk/b;

    .line 29
    .line 30
    invoke-static {p0, v3, p1}, Lx1/k;->z(Lx1/i;Ljava/lang/Object;Lfg/l;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p1, v0, Lgg/q;->g:Z

    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v4, 0x0

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    invoke-static {p0}, Lk/x;->a(Lk/g;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iput-object v2, p0, Lk/g;->L:Ln/m;

    .line 47
    .line 48
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Lk/c;

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    invoke-direct {v0, v1, v2, v4, v3}, Lk/c;-><init>(Ln/k;Ln/m;Lwf/c;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v4, v0, v6}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Lk/d;

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    move-object v3, p0

    .line 70
    invoke-direct/range {v0 .. v5}, Lk/d;-><init>(Ln/k;Ln/m;Lk/g;Lwf/c;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v4, v0, v6}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, v3, Lk/g;->O:Lqg/e1;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    move-object v3, p0

    .line 81
    return-void
.end method

.method public final u1(Ls1/t;)V
    .locals 7

    .line 1
    iget-object v1, p0, Lk/g;->w:Ln/k;

    .line 2
    .line 3
    if-eqz v1, :cond_5

    .line 4
    .line 5
    new-instance v2, Ln/m;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lk/n;->m(Lx1/j;)Lk/k0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move p1, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v4, Lgg/q;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v5, Lc9/i;

    .line 30
    .line 31
    const/16 v6, 0x1c

    .line 32
    .line 33
    invoke-direct {v5, p1, v6, v4}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Li/x0;

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    invoke-direct {p1, v5, v6}, Li/x0;-><init>(Lfg/l;I)V

    .line 40
    .line 41
    .line 42
    sget-object v5, Lk/l0;->v:Lk/b;

    .line 43
    .line 44
    invoke-static {p0, v5, p1}, Lx1/k;->z(Lx1/i;Ljava/lang/Object;Lfg/l;)V

    .line 45
    .line 46
    .line 47
    iget-boolean p1, v4, Lgg/q;->g:Z

    .line 48
    .line 49
    :goto_0
    if-nez p1, :cond_2

    .line 50
    .line 51
    invoke-static {p0}, Lk/x;->a(Lk/g;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    :cond_2
    move v0, v3

    .line 58
    :cond_3
    const/4 p1, 0x3

    .line 59
    const/4 v4, 0x0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    new-instance v0, Lk/d;

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    move-object v3, p0

    .line 70
    invoke-direct/range {v0 .. v5}, Lk/d;-><init>(Ln/k;Ln/m;Lk/g;Lwf/c;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v4, v0, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, v3, Lk/g;->O:Lqg/e1;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_4
    move-object v3, p0

    .line 81
    iput-object v2, v3, Lk/g;->I:Ln/m;

    .line 82
    .line 83
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v5, Lk/c;

    .line 88
    .line 89
    const/4 v6, 0x2

    .line 90
    invoke-direct {v5, v1, v2, v4, v6}, Lk/c;-><init>(Ln/k;Ln/m;Lwf/c;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v4, v5, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    move-object v3, p0

    .line 98
    return-void
.end method

.method public final v1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk/g;->H:Lx1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-boolean v0, p0, Lk/g;->y:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lk/g;->E:Lk/y0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object v0, p0, Lk/g;->x:Lk/y0;

    .line 14
    .line 15
    :goto_0
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v1, p0, Lk/g;->w:Ln/k;

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    new-instance v1, Ln/k;

    .line 22
    .line 23
    invoke-direct {v1}, Ln/k;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lk/g;->w:Ln/k;

    .line 27
    .line 28
    :cond_2
    iget-object v1, p0, Lk/g;->D:Lk/i0;

    .line 29
    .line 30
    iget-object v2, p0, Lk/g;->w:Ln/k;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lk/i0;->o1(Ln/k;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lk/g;->w:Ln/k;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Lk/y0;->a(Ln/k;)Lx1/i;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lk/g;->H:Lx1/i;

    .line 48
    .line 49
    :cond_3
    :goto_1
    return-void
.end method

.method public w1()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract x1(Landroid/view/KeyEvent;)Z
.end method

.method public abstract y1(Landroid/view/KeyEvent;)V
.end method

.method public final z1(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk/g;->M:Ln/k;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lk/g;->p1()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lk/g;->M:Ln/k;

    .line 15
    .line 16
    iput-object p1, p0, Lk/g;->w:Ln/k;

    .line 17
    .line 18
    move p1, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p1, v2

    .line 21
    :goto_0
    iget-object v0, p0, Lk/g;->x:Lk/y0;

    .line 22
    .line 23
    invoke-static {v0, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iput-object p2, p0, Lk/g;->x:Lk/y0;

    .line 30
    .line 31
    move p1, v1

    .line 32
    :cond_1
    iget-boolean p2, p0, Lk/g;->y:Z

    .line 33
    .line 34
    if-eq p2, p3, :cond_3

    .line 35
    .line 36
    iput-boolean p3, p0, Lk/g;->y:Z

    .line 37
    .line 38
    if-eqz p3, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lk/g;->C0()V

    .line 41
    .line 42
    .line 43
    :cond_2
    move p1, v1

    .line 44
    :cond_3
    iget-boolean p2, p0, Lk/g;->B:Z

    .line 45
    .line 46
    iget-object p3, p0, Lk/g;->D:Lk/i0;

    .line 47
    .line 48
    if-eq p2, p4, :cond_5

    .line 49
    .line 50
    if-eqz p4, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p3}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    invoke-virtual {p0, p3}, Lx1/j;->l1(Lx1/i;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lk/g;->p1()V

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-static {p0}, Lx1/k;->n(Lx1/z1;)V

    .line 63
    .line 64
    .line 65
    iput-boolean p4, p0, Lk/g;->B:Z

    .line 66
    .line 67
    :cond_5
    iget-object p2, p0, Lk/g;->z:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {p2, p5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_6

    .line 74
    .line 75
    iput-object p5, p0, Lk/g;->z:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p0}, Lx1/k;->n(Lx1/z1;)V

    .line 78
    .line 79
    .line 80
    :cond_6
    iget-object p2, p0, Lk/g;->A:Lf2/i;

    .line 81
    .line 82
    invoke-static {p2, p6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-nez p2, :cond_7

    .line 87
    .line 88
    iput-object p6, p0, Lk/g;->A:Lf2/i;

    .line 89
    .line 90
    invoke-static {p0}, Lx1/k;->n(Lx1/z1;)V

    .line 91
    .line 92
    .line 93
    :cond_7
    iput-object p7, p0, Lk/g;->C:Lfg/a;

    .line 94
    .line 95
    iget-boolean p2, p0, Lk/g;->N:Z

    .line 96
    .line 97
    iget-object p4, p0, Lk/g;->M:Ln/k;

    .line 98
    .line 99
    if-nez p4, :cond_8

    .line 100
    .line 101
    move p5, v1

    .line 102
    goto :goto_2

    .line 103
    :cond_8
    move p5, v2

    .line 104
    :goto_2
    if-eq p2, p5, :cond_a

    .line 105
    .line 106
    if-nez p4, :cond_9

    .line 107
    .line 108
    move v2, v1

    .line 109
    :cond_9
    iput-boolean v2, p0, Lk/g;->N:Z

    .line 110
    .line 111
    if-nez v2, :cond_a

    .line 112
    .line 113
    iget-object p2, p0, Lk/g;->H:Lx1/i;

    .line 114
    .line 115
    if-nez p2, :cond_a

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_a
    move v1, p1

    .line 119
    :goto_3
    if-eqz v1, :cond_d

    .line 120
    .line 121
    iget-object p1, p0, Lk/g;->H:Lx1/i;

    .line 122
    .line 123
    if-nez p1, :cond_b

    .line 124
    .line 125
    iget-boolean p2, p0, Lk/g;->N:Z

    .line 126
    .line 127
    if-nez p2, :cond_d

    .line 128
    .line 129
    :cond_b
    if-eqz p1, :cond_c

    .line 130
    .line 131
    invoke-virtual {p0, p1}, Lx1/j;->l1(Lx1/i;)V

    .line 132
    .line 133
    .line 134
    :cond_c
    const/4 p1, 0x0

    .line 135
    iput-object p1, p0, Lk/g;->H:Lx1/i;

    .line 136
    .line 137
    invoke-virtual {p0}, Lk/g;->v1()V

    .line 138
    .line 139
    .line 140
    :cond_d
    iget-object p1, p0, Lk/g;->w:Ln/k;

    .line 141
    .line 142
    invoke-virtual {p3, p1}, Lk/i0;->o1(Ln/k;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method
