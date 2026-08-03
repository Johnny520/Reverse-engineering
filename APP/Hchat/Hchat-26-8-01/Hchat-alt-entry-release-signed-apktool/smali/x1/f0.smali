.class public final Lx1/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/h;
.implements Lx1/s1;
.implements Lx1/g;


# static fields
.field public static final X:Lx1/a0;

.field public static final Y:Lx1/z;

.field public static final Z:Lb8/c;


# instance fields
.field public final A:Lj0/b;

.field public B:Z

.field public C:Lv1/n0;

.field public D:Lp4/t;

.field public E:Lu2/c;

.field public F:Lu2/m;

.field public G:Ly1/l2;

.field public H:Li0/t;

.field public I:Lx1/d0;

.field public J:Lx1/d0;

.field public K:Z

.field public final L:Lx1/b1;

.field public final M:Lx1/j0;

.field public N:Lv1/j0;

.field public O:Lx1/i1;

.field public P:Z

.field public Q:Ly0/o;

.field public R:Ly0/o;

.field public S:Lx2/c;

.field public T:Ls1/b0;

.field public U:Z

.field public V:I

.field public W:Z

.field public final g:Z

.field public h:I

.field public i:Z

.field public j:J

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Lx1/f0;

.field public o:I

.field public final p:Lp4/t;

.field public q:Lj0/b;

.field public r:Z

.field public s:Lx1/f0;

.field public t:Lx1/r1;

.field public u:Lx2/v;

.field public v:I

.field public w:Z

.field public x:Z

.field public y:Lf2/m;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx1/a0;

    .line 2
    .line 3
    const-string v1, "Undefined intrinsics block and it is required"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx1/c0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lx1/f0;->X:Lx1/a0;

    .line 9
    .line 10
    new-instance v0, Lx1/z;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lx1/f0;->Y:Lx1/z;

    .line 16
    .line 17
    new-instance v0, Lb8/c;

    .line 18
    .line 19
    const/16 v1, 0xc

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lb8/c;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lx1/f0;->Z:Lb8/c;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move p1, v0

    .line 108
    :goto_0
    sget-object v1, Lf2/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    .line 109
    invoke-direct {p0, v0, p1}, Lx1/f0;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lx1/f0;->g:Z

    .line 5
    .line 6
    iput p1, p0, Lx1/f0;->h:I

    .line 7
    .line 8
    const-wide p1, 0x7fffffff7fffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, Lx1/f0;->j:J

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lx1/f0;->k:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lx1/f0;->l:Z

    .line 19
    .line 20
    new-instance p2, Lp4/t;

    .line 21
    .line 22
    new-instance v0, Lj0/b;

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    new-array v2, v1, [Lx1/f0;

    .line 27
    .line 28
    invoke-direct {v0, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Ld1/c0;

    .line 32
    .line 33
    const/16 v3, 0x10

    .line 34
    .line 35
    invoke-direct {v2, p0, v3}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    const/16 v3, 0x11

    .line 39
    .line 40
    invoke-direct {p2, v0, v3, v2}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lx1/f0;->p:Lp4/t;

    .line 44
    .line 45
    new-instance p2, Lj0/b;

    .line 46
    .line 47
    new-array v0, v1, [Lx1/f0;

    .line 48
    .line 49
    invoke-direct {p2, v0}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Lx1/f0;->A:Lj0/b;

    .line 53
    .line 54
    iput-boolean p1, p0, Lx1/f0;->B:Z

    .line 55
    .line 56
    sget-object p2, Lx1/f0;->X:Lx1/a0;

    .line 57
    .line 58
    iput-object p2, p0, Lx1/f0;->C:Lv1/n0;

    .line 59
    .line 60
    sget-object p2, Lx1/i0;->a:Lu2/d;

    .line 61
    .line 62
    iput-object p2, p0, Lx1/f0;->E:Lu2/c;

    .line 63
    .line 64
    sget-object p2, Lu2/m;->g:Lu2/m;

    .line 65
    .line 66
    iput-object p2, p0, Lx1/f0;->F:Lu2/m;

    .line 67
    .line 68
    sget-object p2, Lx1/f0;->Y:Lx1/z;

    .line 69
    .line 70
    iput-object p2, p0, Lx1/f0;->G:Ly1/l2;

    .line 71
    .line 72
    sget-object p2, Li0/t;->b:Li0/s;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object p2, Li0/s;->b:Ls0/h;

    .line 78
    .line 79
    iput-object p2, p0, Lx1/f0;->H:Li0/t;

    .line 80
    .line 81
    sget-object p2, Lx1/d0;->i:Lx1/d0;

    .line 82
    .line 83
    iput-object p2, p0, Lx1/f0;->I:Lx1/d0;

    .line 84
    .line 85
    iput-object p2, p0, Lx1/f0;->J:Lx1/d0;

    .line 86
    .line 87
    new-instance p2, Lx1/b1;

    .line 88
    .line 89
    invoke-direct {p2, p0}, Lx1/b1;-><init>(Lx1/f0;)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lx1/f0;->L:Lx1/b1;

    .line 93
    .line 94
    new-instance p2, Lx1/j0;

    .line 95
    .line 96
    invoke-direct {p2, p0}, Lx1/j0;-><init>(Lx1/f0;)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Lx1/f0;->M:Lx1/j0;

    .line 100
    .line 101
    iput-boolean p1, p0, Lx1/f0;->P:Z

    .line 102
    .line 103
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 104
    .line 105
    iput-object p1, p0, Lx1/f0;->Q:Ly0/o;

    .line 106
    .line 107
    return-void
.end method

.method public static T(Lx1/f0;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v1

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_2
    iget-object p2, p0, Lx1/f0;->n:Lx1/f0;

    .line 21
    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_3
    const-string p2, "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"

    .line 26
    .line 27
    invoke-static {p2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    iget-object p2, p0, Lx1/f0;->t:Lx1/r1;

    .line 31
    .line 32
    if-nez p2, :cond_4

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_4
    iget-boolean v3, p0, Lx1/f0;->w:Z

    .line 36
    .line 37
    if-nez v3, :cond_b

    .line 38
    .line 39
    iget-boolean v3, p0, Lx1/f0;->g:Z

    .line 40
    .line 41
    if-nez v3, :cond_b

    .line 42
    .line 43
    check-cast p2, Ly1/t;

    .line 44
    .line 45
    invoke-virtual {p2, p0, v2, p1, v0}, Ly1/t;->C(Lx1/f0;ZZZ)V

    .line 46
    .line 47
    .line 48
    if-eqz v1, :cond_b

    .line 49
    .line 50
    iget-object p0, p0, Lx1/f0;->M:Lx1/j0;

    .line 51
    .line 52
    iget-object p0, p0, Lx1/j0;->q:Lx1/r0;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Lx1/r0;->l:Lx1/j0;

    .line 58
    .line 59
    iget-object p2, p0, Lx1/j0;->a:Lx1/f0;

    .line 60
    .line 61
    invoke-virtual {p2}, Lx1/f0;->u()Lx1/f0;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-object p0, p0, Lx1/j0;->a:Lx1/f0;

    .line 66
    .line 67
    iget-object p0, p0, Lx1/f0;->I:Lx1/d0;

    .line 68
    .line 69
    if-eqz p2, :cond_b

    .line 70
    .line 71
    sget-object v0, Lx1/d0;->i:Lx1/d0;

    .line 72
    .line 73
    if-eq p0, v0, :cond_b

    .line 74
    .line 75
    :goto_2
    iget-object v0, p2, Lx1/f0;->I:Lx1/d0;

    .line 76
    .line 77
    if-ne v0, p0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p2}, Lx1/f0;->u()Lx1/f0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object p2, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_9

    .line 93
    .line 94
    if-ne p0, v2, :cond_8

    .line 95
    .line 96
    iget-object p0, p2, Lx1/f0;->n:Lx1/f0;

    .line 97
    .line 98
    if-eqz p0, :cond_7

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Lx1/f0;->S(Z)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_7
    invoke-virtual {p2, p1}, Lx1/f0;->U(Z)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_8
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 109
    .line 110
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_9
    iget-object p0, p2, Lx1/f0;->n:Lx1/f0;

    .line 115
    .line 116
    const/4 v0, 0x6

    .line 117
    if-eqz p0, :cond_a

    .line 118
    .line 119
    invoke-static {p2, p1, v0}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    invoke-static {p2, p1, v0}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 124
    .line 125
    .line 126
    :cond_b
    :goto_4
    return-void
.end method

.method public static V(Lx1/f0;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v1

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    move p2, v2

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move p2, v1

    .line 22
    :goto_1
    iget-boolean v3, p0, Lx1/f0;->w:Z

    .line 23
    .line 24
    if-nez v3, :cond_8

    .line 25
    .line 26
    iget-boolean v3, p0, Lx1/f0;->g:Z

    .line 27
    .line 28
    if-nez v3, :cond_8

    .line 29
    .line 30
    iget-object v3, p0, Lx1/f0;->t:Lx1/r1;

    .line 31
    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_3
    check-cast v3, Ly1/t;

    .line 36
    .line 37
    invoke-virtual {v3, p0, v1, p1, v0}, Ly1/t;->C(Lx1/f0;ZZZ)V

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_8

    .line 41
    .line 42
    iget-object p0, p0, Lx1/f0;->M:Lx1/j0;

    .line 43
    .line 44
    iget-object p0, p0, Lx1/j0;->p:Lx1/v0;

    .line 45
    .line 46
    iget-object p0, p0, Lx1/v0;->l:Lx1/j0;

    .line 47
    .line 48
    iget-object p2, p0, Lx1/j0;->a:Lx1/f0;

    .line 49
    .line 50
    invoke-virtual {p2}, Lx1/f0;->u()Lx1/f0;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-object p0, p0, Lx1/j0;->a:Lx1/f0;

    .line 55
    .line 56
    iget-object p0, p0, Lx1/f0;->I:Lx1/d0;

    .line 57
    .line 58
    if-eqz p2, :cond_8

    .line 59
    .line 60
    sget-object v0, Lx1/d0;->i:Lx1/d0;

    .line 61
    .line 62
    if-eq p0, v0, :cond_8

    .line 63
    .line 64
    :goto_2
    iget-object v0, p2, Lx1/f0;->I:Lx1/d0;

    .line 65
    .line 66
    if-ne v0, p0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p2}, Lx1/f0;->u()Lx1/f0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move-object p2, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    if-ne p0, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Lx1/f0;->U(Z)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 90
    .line 91
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_7
    const/4 p0, 0x6

    .line 96
    invoke-static {p2, p1, p0}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 97
    .line 98
    .line 99
    :cond_8
    :goto_4
    return-void
.end method

.method public static W(Lx1/f0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->d:Lx1/b0;

    .line 4
    .line 5
    sget-object v1, Lx1/e0;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    iget-object v1, p0, Lx1/f0;->M:Lx1/j0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v2, :cond_4

    .line 17
    .line 18
    iget-boolean v0, v1, Lx1/j0;->e:Z

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0, v2, v3}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-boolean v0, v1, Lx1/j0;->f:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lx1/f0;->S(Z)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lx1/f0;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-static {p0, v2, v3}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {p0}, Lx1/f0;->p()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lx1/f0;->U(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void

    .line 54
    :cond_4
    const-string p0, "Unexpected state "

    .line 55
    .line 56
    iget-object v0, v1, Lx1/j0;->d:Lx1/b0;

    .line 57
    .line 58
    invoke-static {v0, p0}, Lokio/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private final j(Lx1/f0;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Cannot insert "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " because it already has a parent or an owner. This tree: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1}, Lx1/f0;->g(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " Other tree: "

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, Lx1/f0;->s:Lx1/f0;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lx1/f0;->g(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method


# virtual methods
.method public final A(ILx1/f0;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lx1/f0;->s:Lx1/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p2, Lx1/f0;->t:Lx1/r1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p2}, Lx1/f0;->j(Lx1/f0;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p0, p2, Lx1/f0;->s:Lx1/f0;

    .line 18
    .line 19
    iget-object v0, p0, Lx1/f0;->p:Lp4/t;

    .line 20
    .line 21
    iget-object v1, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lj0/b;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Lj0/b;->a(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ld1/c0;

    .line 31
    .line 32
    invoke-virtual {p1}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lx1/f0;->O()V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p2, Lx1/f0;->g:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lx1/f0;->o:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, Lx1/f0;->o:I

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Lx1/f0;->F()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lx1/f0;->t:Lx1/r1;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lx1/f0;->d(Lx1/r1;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p1, p2, Lx1/f0;->M:Lx1/j0;

    .line 59
    .line 60
    iget p1, p1, Lx1/j0;->l:I

    .line 61
    .line 62
    if-lez p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, Lx1/f0;->M:Lx1/j0;

    .line 65
    .line 66
    iget v0, p1, Lx1/j0;->l:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lx1/j0;->d(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget p1, p2, Lx1/f0;->V:I

    .line 74
    .line 75
    if-lez p1, :cond_5

    .line 76
    .line 77
    iget p1, p0, Lx1/f0;->V:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lx1/f0;->a0(I)V

    .line 82
    .line 83
    .line 84
    :cond_5
    return-void
.end method

.method public final B()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lx1/f0;->P:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 6
    .line 7
    iget-object v1, v0, Lx1/b1;->c:Lx1/r;

    .line 8
    .line 9
    iget-object v0, v0, Lx1/b1;->d:Lx1/i1;

    .line 10
    .line 11
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, p0, Lx1/f0;->O:Lx1/i1;

    .line 15
    .line 16
    :goto_0
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v3, v1, Lx1/i1;->R:Lx1/q1;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move-object v3, v2

    .line 28
    :goto_1
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iput-object v1, p0, Lx1/f0;->O:Lx1/i1;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v1, Lx1/i1;->w:Lx1/i1;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lx1/f0;->P:Z

    .line 42
    .line 43
    :cond_4
    iget-object v0, p0, Lx1/f0;->O:Lx1/i1;

    .line 44
    .line 45
    if-eqz v0, :cond_6

    .line 46
    .line 47
    iget-object v1, v0, Lx1/i1;->R:Lx1/q1;

    .line 48
    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_5
    const-string v0, "layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?"

    .line 53
    .line 54
    invoke-static {v0}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    throw v0

    .line 59
    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    .line 60
    .line 61
    invoke-virtual {v0}, Lx1/i1;->y1()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_7
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_8

    .line 70
    .line 71
    invoke-virtual {v0}, Lx1/f0;->B()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_8
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 76
    .line 77
    if-eqz v0, :cond_9

    .line 78
    .line 79
    check-cast v0, Ly1/t;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 82
    .line 83
    .line 84
    :cond_9
    return-void
.end method

.method public final C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/b1;->d:Lx1/i1;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/b1;->c:Lx1/r;

    .line 6
    .line 7
    :goto_0
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v1, Lx1/x;

    .line 13
    .line 14
    iget-object v3, v1, Lx1/i1;->R:Lx1/q1;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    check-cast v3, Ly1/o1;

    .line 19
    .line 20
    invoke-virtual {v3}, Ly1/o1;->c()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v1, v1, Lx1/i1;->v:Lx1/i1;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 27
    .line 28
    iget-object v0, v0, Lx1/i1;->R:Lx1/q1;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    check-cast v0, Ly1/o1;

    .line 33
    .line 34
    invoke-virtual {v0}, Ly1/o1;->c()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final D()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lx1/f0;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/f0;->D()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Lx1/f0;->n:Lx1/f0;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0, v2, v1}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {p0, v2, v1}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final E()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lx1/f0;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 7
    .line 8
    iget-object v0, v0, Lx1/b1;->b:Lx1/a1;

    .line 9
    .line 10
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lx1/f0;->R:Ly0/o;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :goto_0
    iput-boolean v1, p0, Lx1/f0;->x:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    iget-object v0, p0, Lx1/f0;->y:Lf2/m;

    .line 24
    .line 25
    iput-boolean v1, p0, Lx1/f0;->z:Z

    .line 26
    .line 27
    new-instance v1, Lgg/u;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lf2/m;

    .line 33
    .line 34
    invoke-direct {v2}, Lf2/m;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ly1/t;

    .line 44
    .line 45
    invoke-virtual {v2}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, Lc1/b;

    .line 50
    .line 51
    const/4 v4, 0x4

    .line 52
    invoke-direct {v3, p0, v4, v1}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v4, v2, Lx1/t1;->d:Lx1/d;

    .line 56
    .line 57
    iget-object v2, v2, Lx1/t1;->a:Lw0/s;

    .line 58
    .line 59
    invoke-virtual {v2, p0, v4, v3}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    iput-boolean v2, p0, Lx1/f0;->z:Z

    .line 64
    .line 65
    iget-object v1, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Lf2/m;

    .line 68
    .line 69
    iput-object v1, p0, Lx1/f0;->y:Lf2/m;

    .line 70
    .line 71
    iput-boolean v2, p0, Lx1/f0;->x:Z

    .line 72
    .line 73
    invoke-static {p0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ly1/t;

    .line 78
    .line 79
    invoke-virtual {v1}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2, p0, v0}, Lf2/s;->b(Lx1/f0;Lf2/m;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ly1/t;->E()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final F()V
    .locals 1

    .line 1
    iget v0, p0, Lx1/f0;->o:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lx1/f0;->r:Z

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lx1/f0;->g:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lx1/f0;->s:Lx1/f0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lx1/f0;->F()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 4
    .line 5
    iget-boolean v0, v0, Lx1/v0;->y:Z

    .line 6
    .line 7
    return v0
.end method

.method public final I()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lx1/r0;->w:Lx1/p0;

    .line 8
    .line 9
    sget-object v1, Lx1/p0;->i:Lx1/p0;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method

.method public final J()V
    .locals 7

    .line 1
    iget-object v0, p0, Lx1/f0;->I:Lx1/d0;

    .line 2
    .line 3
    sget-object v1, Lx1/d0;->i:Lx1/d0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lx1/f0;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 11
    .line 12
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_0
    iput-boolean v1, v0, Lx1/r0;->m:Z

    .line 20
    .line 21
    iget-boolean v3, v0, Lx1/r0;->q:Z

    .line 22
    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    const-string v3, "replace() called on item that was not placed"

    .line 26
    .line 27
    invoke-static {v3}, Lu1/a;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    iput-boolean v2, v0, Lx1/r0;->H:Z

    .line 34
    .line 35
    iget-object v3, v0, Lx1/r0;->w:Lx1/p0;

    .line 36
    .line 37
    sget-object v4, Lx1/p0;->i:Lx1/p0;

    .line 38
    .line 39
    if-eq v3, v4, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v2

    .line 43
    :goto_1
    iget-wide v3, v0, Lx1/r0;->t:J

    .line 44
    .line 45
    iget-object v5, v0, Lx1/r0;->u:Lfg/l;

    .line 46
    .line 47
    iget-object v6, v0, Lx1/r0;->v:Li1/b;

    .line 48
    .line 49
    invoke-virtual {v0, v3, v4, v5, v6}, Lx1/r0;->T0(JLfg/l;Li1/b;)V

    .line 50
    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-boolean v1, v0, Lx1/r0;->H:Z

    .line 55
    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    iget-object v1, v0, Lx1/r0;->l:Lx1/j0;

    .line 59
    .line 60
    iget-object v1, v1, Lx1/j0;->a:Lx1/f0;

    .line 61
    .line 62
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lx1/f0;->S(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_3
    iput-boolean v2, v0, Lx1/r0;->m:Z

    .line 72
    .line 73
    return-void

    .line 74
    :goto_2
    iput-boolean v2, v0, Lx1/r0;->m:Z

    .line 75
    .line 76
    throw v1
.end method

.method public final K(III)V
    .locals 6

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge v0, p3, :cond_3

    .line 6
    .line 7
    if-le p1, p2, :cond_1

    .line 8
    .line 9
    add-int v1, p1, v0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v1, p1

    .line 13
    :goto_1
    if-le p1, p2, :cond_2

    .line 14
    .line 15
    add-int v2, p2, v0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    add-int v2, p2, p3

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x2

    .line 21
    .line 22
    :goto_2
    iget-object v3, p0, Lx1/f0;->p:Lp4/t;

    .line 23
    .line 24
    iget-object v4, v3, Lp4/t;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lj0/b;

    .line 27
    .line 28
    iget-object v5, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ld1/c0;

    .line 31
    .line 32
    invoke-virtual {v4, v1}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v5}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast v1, Lx1/f0;

    .line 40
    .line 41
    iget-object v3, v3, Lp4/t;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lj0/b;

    .line 44
    .line 45
    invoke-virtual {v3, v2, v1}, Lj0/b;->a(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0}, Lx1/f0;->O()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lx1/f0;->F()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lx1/f0;->D()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final L()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/f0;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final M(Lx1/f0;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget v0, v0, Lx1/j0;->l:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 8
    .line 9
    iget v1, v0, Lx1/j0;->l:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lx1/j0;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lx1/f0;->h()V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, Lx1/f0;->s:Lx1/f0;

    .line 25
    .line 26
    iget v1, p1, Lx1/f0;->V:I

    .line 27
    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    iget v1, p0, Lx1/f0;->V:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lx1/f0;->a0(I)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v1, p1, Lx1/f0;->L:Lx1/b1;

    .line 38
    .line 39
    iget-object v1, v1, Lx1/b1;->d:Lx1/i1;

    .line 40
    .line 41
    iput-object v0, v1, Lx1/i1;->w:Lx1/i1;

    .line 42
    .line 43
    iget-boolean v1, p1, Lx1/f0;->g:Z

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iget v1, p0, Lx1/f0;->o:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    iput v1, p0, Lx1/f0;->o:I

    .line 52
    .line 53
    iget-object p1, p1, Lx1/f0;->p:Lp4/t;

    .line 54
    .line 55
    iget-object p1, p1, Lp4/t;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lj0/b;

    .line 58
    .line 59
    iget-object v1, p1, Lj0/b;->g:[Ljava/lang/Object;

    .line 60
    .line 61
    iget p1, p1, Lj0/b;->i:I

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    :goto_0
    if-ge v2, p1, :cond_3

    .line 65
    .line 66
    aget-object v3, v1, v2

    .line 67
    .line 68
    check-cast v3, Lx1/f0;

    .line 69
    .line 70
    iget-object v3, v3, Lx1/f0;->L:Lx1/b1;

    .line 71
    .line 72
    iget-object v3, v3, Lx1/b1;->d:Lx1/i1;

    .line 73
    .line 74
    iput-object v0, v3, Lx1/i1;->w:Lx1/i1;

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {p0}, Lx1/f0;->F()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lx1/f0;->O()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final N(Lx1/i1;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Ly1/t;

    .line 6
    .line 7
    invoke-virtual {v0}, Ly1/t;->getRectManager()Lg2/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lx1/f0;->M:Lx1/j0;

    .line 14
    .line 15
    iget-object v2, v1, Lx1/j0;->d:Lx1/b0;

    .line 16
    .line 17
    sget-object v3, Lx1/b0;->k:Lx1/b0;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x1

    .line 21
    if-ne v2, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lx1/f0;->q()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lx1/f0;->p()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v4

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :goto_1
    move v2, v5

    .line 39
    :goto_2
    iget-boolean v3, p0, Lx1/f0;->m:Z

    .line 40
    .line 41
    if-eqz v3, :cond_8

    .line 42
    .line 43
    if-eqz v0, :cond_8

    .line 44
    .line 45
    iget-object v3, p0, Lx1/f0;->L:Lx1/b1;

    .line 46
    .line 47
    iget-object v3, v3, Lx1/b1;->d:Lx1/i1;

    .line 48
    .line 49
    if-ne p1, v3, :cond_3

    .line 50
    .line 51
    iput-boolean v5, p0, Lx1/f0;->l:Z

    .line 52
    .line 53
    if-nez v2, :cond_8

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Lg2/b;->f(Lx1/f0;)V

    .line 56
    .line 57
    .line 58
    goto :goto_6

    .line 59
    :cond_3
    iput-boolean v5, p0, Lx1/f0;->k:Z

    .line 60
    .line 61
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object v3, p1, Lj0/b;->g:[Ljava/lang/Object;

    .line 66
    .line 67
    iget p1, p1, Lj0/b;->i:I

    .line 68
    .line 69
    move v6, v4

    .line 70
    :goto_3
    if-ge v6, p1, :cond_5

    .line 71
    .line 72
    aget-object v7, v3, v6

    .line 73
    .line 74
    check-cast v7, Lx1/f0;

    .line 75
    .line 76
    iput-boolean v5, v7, Lx1/f0;->l:Z

    .line 77
    .line 78
    if-nez v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0, v7}, Lg2/b;->f(Lx1/f0;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    iget-boolean p1, p0, Lx1/f0;->m:Z

    .line 87
    .line 88
    if-eqz p1, :cond_7

    .line 89
    .line 90
    iput-boolean v5, v0, Lg2/b;->e:Z

    .line 91
    .line 92
    iget-object p1, v0, Lg2/b;->b:Lac/k;

    .line 93
    .line 94
    iget v2, p0, Lx1/f0;->h:I

    .line 95
    .line 96
    const v3, 0x1ffffff

    .line 97
    .line 98
    .line 99
    and-int/2addr v2, v3

    .line 100
    iget-object v5, p1, Lac/k;->i:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, [J

    .line 103
    .line 104
    iget p1, p1, Lac/k;->h:I

    .line 105
    .line 106
    :goto_4
    array-length v6, v5

    .line 107
    add-int/lit8 v6, v6, -0x2

    .line 108
    .line 109
    if-ge v4, v6, :cond_7

    .line 110
    .line 111
    if-ge v4, p1, :cond_7

    .line 112
    .line 113
    add-int/lit8 v6, v4, 0x2

    .line 114
    .line 115
    aget-wide v7, v5, v6

    .line 116
    .line 117
    long-to-int v9, v7

    .line 118
    and-int/2addr v9, v3

    .line 119
    if-ne v9, v2, :cond_6

    .line 120
    .line 121
    const/16 p1, 0x3f

    .line 122
    .line 123
    shr-long v2, v7, p1

    .line 124
    .line 125
    const-wide/16 v9, 0x1

    .line 126
    .line 127
    and-long/2addr v2, v9

    .line 128
    const/16 p1, 0x3c

    .line 129
    .line 130
    shl-long/2addr v2, p1

    .line 131
    or-long/2addr v2, v7

    .line 132
    aput-wide v2, v5, v6

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_6
    add-int/lit8 v4, v4, 0x3

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_7
    :goto_5
    invoke-virtual {v0}, Lg2/b;->i()V

    .line 139
    .line 140
    .line 141
    :cond_8
    :goto_6
    iget-object p1, v1, Lx1/j0;->p:Lx1/v0;

    .line 142
    .line 143
    invoke-virtual {p1}, Lx1/v0;->Y0()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final O()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx1/f0;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/f0;->O()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lx1/f0;->B:Z

    .line 17
    .line 18
    return-void
.end method

.method public final P()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/f0;->p:Lp4/t;

    .line 2
    .line 3
    iget-object v1, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lj0/b;

    .line 6
    .line 7
    iget v1, v1, Lj0/b;->i:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    iget-object v2, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lj0/b;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Lj0/b;->g:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    check-cast v2, Lx1/f0;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lx1/f0;->M(Lx1/f0;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Lj0/b;->g()V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ld1/c0;

    .line 36
    .line 37
    invoke-virtual {v0}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final Q(II)V
    .locals 2

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "count ("

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ") must be greater than 0"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lu1/a;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    add-int/2addr p2, p1

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    if-gt p1, p2, :cond_1

    .line 30
    .line 31
    :goto_1
    iget-object v0, p0, Lx1/f0;->p:Lp4/t;

    .line 32
    .line 33
    iget-object v1, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lj0/b;

    .line 36
    .line 37
    iget-object v1, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v1, v1, p2

    .line 40
    .line 41
    check-cast v1, Lx1/f0;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lx1/f0;->M(Lx1/f0;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lj0/b;

    .line 49
    .line 50
    invoke-virtual {v1, p2}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ld1/c0;

    .line 57
    .line 58
    invoke-virtual {v0}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    check-cast v1, Lx1/f0;

    .line 62
    .line 63
    if-eq p2, p1, :cond_1

    .line 64
    .line 65
    add-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    iget-object v0, p0, Lx1/f0;->I:Lx1/d0;

    .line 2
    .line 3
    sget-object v1, Lx1/d0;->i:Lx1/d0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lx1/f0;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 11
    .line 12
    iget-object v1, v0, Lx1/j0;->p:Lx1/v0;

    .line 13
    .line 14
    iget-object v7, v1, Lx1/v0;->l:Lx1/j0;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v0, 0x1

    .line 18
    :try_start_0
    iput-boolean v0, v1, Lx1/v0;->m:Z

    .line 19
    .line 20
    iget-boolean v0, v1, Lx1/v0;->q:Z

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string v0, "replace called on unplaced item"

    .line 25
    .line 26
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    iget-boolean v0, v1, Lx1/v0;->y:Z

    .line 33
    .line 34
    iget-wide v2, v1, Lx1/v0;->s:J

    .line 35
    .line 36
    iget v4, v1, Lx1/v0;->v:F

    .line 37
    .line 38
    iget-object v5, v1, Lx1/v0;->t:Lfg/l;

    .line 39
    .line 40
    iget-object v6, v1, Lx1/v0;->u:Li1/b;

    .line 41
    .line 42
    invoke-virtual/range {v1 .. v6}, Lx1/v0;->S0(JFLfg/l;Li1/b;)V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-boolean v0, v1, Lx1/v0;->L:Z

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    iget-object v0, v7, Lx1/j0;->a:Lx1/f0;

    .line 52
    .line 53
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v8}, Lx1/f0;->U(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_2
    iput-boolean v8, v1, Lx1/v0;->m:Z

    .line 63
    .line 64
    return-void

    .line 65
    :goto_1
    :try_start_1
    iget-object v2, v7, Lx1/j0;->a:Lx1/f0;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Lx1/f0;->Y(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    iput-boolean v8, v1, Lx1/v0;->m:Z

    .line 74
    .line 75
    throw v0
.end method

.method public final S(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx1/f0;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    check-cast v0, Ly1/t;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Ly1/t;->D(Lx1/f0;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final U(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx1/f0;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    check-cast v0, Ly1/t;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Ly1/t;->D(Lx1/f0;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final X()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lj0/b;->i:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, Lx1/f0;

    .line 15
    .line 16
    iget-object v4, v3, Lx1/f0;->J:Lx1/d0;

    .line 17
    .line 18
    iput-object v4, v3, Lx1/f0;->I:Lx1/d0;

    .line 19
    .line 20
    sget-object v5, Lx1/d0;->i:Lx1/d0;

    .line 21
    .line 22
    if-eq v4, v5, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Lx1/f0;->X()V

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public final Y(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/f0;->H:Li0/t;

    .line 2
    .line 3
    sget-object v1, Lx0/e;->a:Li0/m2;

    .line 4
    .line 5
    check-cast v0, Ls0/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lx0/d;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, Lwb/xi;

    .line 19
    .line 20
    const/16 v2, 0x18

    .line 21
    .line 22
    invoke-direct {v1, v0, v2, p0}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v1}, Lig/a;->b0(Ljava/lang/Throwable;Lfg/a;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    throw p1
.end method

.method public final Z(Lu2/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->E:Lu2/c;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, Lx1/f0;->E:Lu2/c;

    .line 10
    .line 11
    invoke-virtual {p0}, Lx1/f0;->D()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lx1/f0;->B()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, Lx1/f0;->t:Lx1/r1;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    check-cast p1, Ly1/t;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lx1/f0;->C()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lx1/f0;->L:Lx1/b1;

    .line 37
    .line 38
    iget-object p1, p1, Lx1/b1;->f:Ly0/n;

    .line 39
    .line 40
    :goto_1
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Lx1/i;->m()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, Ly0/n;->l:Ly0/n;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    return-void
.end method

.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/f0;->u:Lx2/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lx2/h;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lx1/f0;->N:Lv1/j0;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lv1/j0;->a()V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 16
    .line 17
    iget-object v1, v0, Lx1/b1;->d:Lx1/i1;

    .line 18
    .line 19
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 20
    .line 21
    iget-object v0, v0, Lx1/i1;->v:Lx1/i1;

    .line 22
    .line 23
    :goto_0
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, Lx1/i1;->D1()V

    .line 32
    .line 33
    .line 34
    iget-object v1, v1, Lx1/i1;->v:Lx1/i1;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-void
.end method

.method public final a0(I)V
    .locals 2

    .line 1
    iget v0, p0, Lx1/f0;->V:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lx1/f0;->V:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lx1/f0;->a0(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget v0, p0, Lx1/f0;->V:I

    .line 25
    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v1, v0, Lx1/f0;->V:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lx1/f0;->a0(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput p1, p0, Lx1/f0;->V:I

    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/f0;->u:Lx2/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lx2/h;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lx1/f0;->N:Lv1/j0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lv1/j0;->i(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iput-boolean v1, p0, Lx1/f0;->W:Z

    .line 17
    .line 18
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 19
    .line 20
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 21
    .line 22
    move-object v1, v0

    .line 23
    :goto_0
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-boolean v2, v1, Ly0/n;->t:Z

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Ly0/n;->f1()V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    move-object v1, v0

    .line 36
    :goto_1
    if-eqz v1, :cond_5

    .line 37
    .line 38
    iget-boolean v2, v1, Ly0/n;->t:Z

    .line 39
    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    invoke-virtual {v1}, Ly0/n;->h1()V

    .line 43
    .line 44
    .line 45
    :cond_4
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_5
    :goto_2
    if-eqz v0, :cond_7

    .line 49
    .line 50
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 51
    .line 52
    if-eqz v1, :cond_6

    .line 53
    .line 54
    invoke-virtual {v0}, Ly0/n;->b1()V

    .line 55
    .line 56
    .line 57
    :cond_6
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_7
    invoke-virtual {p0}, Lx1/f0;->G()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x0

    .line 65
    if-eqz v0, :cond_8

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lx1/f0;->y:Lf2/m;

    .line 69
    .line 70
    iput-boolean v1, p0, Lx1/f0;->x:Z

    .line 71
    .line 72
    :cond_8
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 73
    .line 74
    if-eqz v0, :cond_9

    .line 75
    .line 76
    check-cast v0, Ly1/t;

    .line 77
    .line 78
    iget-object v0, v0, Ly1/t;->T:Lz0/c;

    .line 79
    .line 80
    if-eqz v0, :cond_9

    .line 81
    .line 82
    iget-object v2, v0, Lz0/c;->n:Lf/x;

    .line 83
    .line 84
    iget v3, p0, Lx1/f0;->h:I

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Lf/x;->e(I)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_9

    .line 91
    .line 92
    iget-object v2, v0, Lz0/c;->g:Lxe/e;

    .line 93
    .line 94
    iget-object v0, v0, Lz0/c;->i:Ly1/t;

    .line 95
    .line 96
    iget v3, p0, Lx1/f0;->h:I

    .line 97
    .line 98
    invoke-virtual {v2, v0, v3, v1}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 99
    .line 100
    .line 101
    :cond_9
    return-void
.end method

.method public final b0(Lx1/f0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/f0;->n:Lx1/f0;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Lx1/f0;->n:Lx1/f0;

    .line 10
    .line 11
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p1, v0, Lx1/j0;->q:Lx1/r0;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Lx1/r0;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lx1/r0;-><init>(Lx1/j0;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, Lx1/j0;->q:Lx1/r0;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lx1/f0;->L:Lx1/b1;

    .line 27
    .line 28
    iget-object v0, p1, Lx1/b1;->d:Lx1/i1;

    .line 29
    .line 30
    iget-object p1, p1, Lx1/b1;->c:Lx1/r;

    .line 31
    .line 32
    iget-object p1, p1, Lx1/i1;->v:Lx1/i1;

    .line 33
    .line 34
    :goto_0
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lx1/i1;->m1()V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Lx1/i1;->v:Lx1/i1;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    iput-object p1, v0, Lx1/j0;->q:Lx1/r0;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, v0, Lx1/j0;->f:Z

    .line 53
    .line 54
    iput-boolean p1, v0, Lx1/j0;->e:Z

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Lx1/f0;->D()V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final c(Ly0/o;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lx1/f0;->L:Lx1/b1;

    .line 6
    .line 7
    const/16 v7, 0x10

    .line 8
    .line 9
    invoke-virtual {v2, v7}, Lx1/b1;->d(I)Z

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    iget-object v9, v2, Lx1/b1;->e:Lx1/b2;

    .line 14
    .line 15
    const/16 v10, 0x400

    .line 16
    .line 17
    invoke-virtual {v2, v10}, Lx1/b1;->d(I)Z

    .line 18
    .line 19
    .line 20
    move-result v11

    .line 21
    iput-object v1, v0, Lx1/f0;->Q:Ly0/o;

    .line 22
    .line 23
    iget-object v3, v2, Lx1/b1;->c:Lx1/r;

    .line 24
    .line 25
    iget-object v4, v2, Lx1/b1;->a:Lx1/f0;

    .line 26
    .line 27
    iget-object v5, v2, Lx1/b1;->f:Ly0/n;

    .line 28
    .line 29
    iget-object v12, v2, Lx1/b1;->b:Lx1/a1;

    .line 30
    .line 31
    if-eq v5, v12, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v5, "padChain called on already padded chain"

    .line 35
    .line 36
    invoke-static {v5}, Lu1/a;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v5, v2, Lx1/b1;->f:Ly0/n;

    .line 40
    .line 41
    iput-object v12, v5, Ly0/n;->k:Ly0/n;

    .line 42
    .line 43
    iput-object v5, v12, Ly0/n;->l:Ly0/n;

    .line 44
    .line 45
    move-object v5, v3

    .line 46
    iget-object v3, v2, Lx1/b1;->g:Lj0/b;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    iget v6, v3, Lj0/b;->i:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v6, 0x0

    .line 54
    :goto_1
    iget-object v14, v2, Lx1/b1;->h:Lj0/b;

    .line 55
    .line 56
    if-nez v14, :cond_2

    .line 57
    .line 58
    new-instance v14, Lj0/b;

    .line 59
    .line 60
    new-array v15, v7, [Ly0/m;

    .line 61
    .line 62
    invoke-direct {v14, v15}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v15, v2, Lx1/b1;->i:Lj0/b;

    .line 66
    .line 67
    invoke-virtual {v15, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    :goto_2
    iget v1, v15, Lj0/b;->i:I

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    add-int/lit8 v1, v1, -0x1

    .line 77
    .line 78
    invoke-virtual {v15, v1}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Ly0/o;

    .line 83
    .line 84
    instance-of v13, v1, Ly0/i;

    .line 85
    .line 86
    if-eqz v13, :cond_3

    .line 87
    .line 88
    check-cast v1, Ly0/i;

    .line 89
    .line 90
    iget-object v13, v1, Ly0/i;->b:Ly0/o;

    .line 91
    .line 92
    invoke-virtual {v15, v13}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, v1, Ly0/i;->a:Ly0/o;

    .line 96
    .line 97
    invoke-virtual {v15, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    instance-of v13, v1, Ly0/m;

    .line 102
    .line 103
    if-eqz v13, :cond_4

    .line 104
    .line 105
    invoke-virtual {v14, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    if-nez v16, :cond_5

    .line 110
    .line 111
    new-instance v13, Lb1/f;

    .line 112
    .line 113
    const/16 v10, 0x11

    .line 114
    .line 115
    invoke-direct {v13, v14, v10}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    move-object/from16 v16, v13

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    move-object/from16 v13, v16

    .line 122
    .line 123
    :goto_3
    invoke-interface {v1, v13}, Ly0/o;->a(Lfg/l;)Z

    .line 124
    .line 125
    .line 126
    :goto_4
    const/16 v10, 0x400

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    iget v1, v14, Lj0/b;->i:I

    .line 130
    .line 131
    const-string v13, "expected prior modifier list to be non-empty"

    .line 132
    .line 133
    if-ne v1, v6, :cond_11

    .line 134
    .line 135
    iget-object v1, v12, Ly0/n;->l:Ly0/n;

    .line 136
    .line 137
    move-object v5, v2

    .line 138
    const/4 v2, 0x0

    .line 139
    :goto_5
    if-eqz v1, :cond_c

    .line 140
    .line 141
    if-ge v2, v6, :cond_c

    .line 142
    .line 143
    if-eqz v3, :cond_b

    .line 144
    .line 145
    const/16 v16, 0x2

    .line 146
    .line 147
    iget-object v10, v3, Lj0/b;->g:[Ljava/lang/Object;

    .line 148
    .line 149
    aget-object v10, v10, v2

    .line 150
    .line 151
    check-cast v10, Ly0/m;

    .line 152
    .line 153
    iget-object v7, v14, Lj0/b;->g:[Ljava/lang/Object;

    .line 154
    .line 155
    aget-object v7, v7, v2

    .line 156
    .line 157
    check-cast v7, Ly0/m;

    .line 158
    .line 159
    invoke-static {v10, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v17

    .line 163
    if-eqz v17, :cond_7

    .line 164
    .line 165
    move-object/from16 v18, v3

    .line 166
    .line 167
    move/from16 v3, v16

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_7
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    move-object/from16 v18, v3

    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    if-ne v15, v3, :cond_8

    .line 181
    .line 182
    const/4 v3, 0x1

    .line 183
    goto :goto_6

    .line 184
    :cond_8
    const/4 v3, 0x0

    .line 185
    :goto_6
    if-eqz v3, :cond_a

    .line 186
    .line 187
    const/4 v15, 0x1

    .line 188
    if-eq v3, v15, :cond_9

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_9
    invoke-static {v10, v7, v1}, Lx1/b1;->h(Ly0/m;Ly0/m;Ly0/n;)V

    .line 192
    .line 193
    .line 194
    :goto_7
    iget-object v1, v1, Ly0/n;->l:Ly0/n;

    .line 195
    .line 196
    add-int/lit8 v2, v2, 0x1

    .line 197
    .line 198
    move-object/from16 v3, v18

    .line 199
    .line 200
    const/16 v7, 0x10

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_a
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_b
    invoke-static {v13}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    throw v1

    .line 211
    :cond_c
    move-object/from16 v18, v3

    .line 212
    .line 213
    const/16 v16, 0x2

    .line 214
    .line 215
    :goto_8
    if-ge v2, v6, :cond_10

    .line 216
    .line 217
    if-eqz v18, :cond_f

    .line 218
    .line 219
    if-eqz v1, :cond_e

    .line 220
    .line 221
    iget-object v3, v4, Lx1/f0;->R:Ly0/o;

    .line 222
    .line 223
    if-eqz v3, :cond_d

    .line 224
    .line 225
    const/16 v17, 0x1

    .line 226
    .line 227
    :goto_9
    const/4 v15, 0x1

    .line 228
    goto :goto_a

    .line 229
    :cond_d
    const/16 v17, 0x0

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :goto_a
    xor-int/lit8 v6, v17, 0x1

    .line 233
    .line 234
    move-object v3, v5

    .line 235
    move-object v5, v1

    .line 236
    move-object v1, v3

    .line 237
    move-object v4, v14

    .line 238
    move-object/from16 v3, v18

    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    invoke-virtual/range {v1 .. v6}, Lx1/b1;->f(ILj0/b;Lj0/b;Ly0/n;Z)V

    .line 242
    .line 243
    .line 244
    move-object v5, v12

    .line 245
    :goto_b
    const/4 v15, 0x1

    .line 246
    goto/16 :goto_13

    .line 247
    .line 248
    :cond_e
    const-string v1, "structuralUpdate requires a non-null tail"

    .line 249
    .line 250
    invoke-static {v1}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    throw v1

    .line 255
    :cond_f
    invoke-static {v13}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    throw v1

    .line 260
    :cond_10
    move-object v2, v5

    .line 261
    move-object/from16 v3, v18

    .line 262
    .line 263
    const/4 v7, 0x0

    .line 264
    goto :goto_10

    .line 265
    :cond_11
    const/4 v7, 0x0

    .line 266
    const/16 v16, 0x2

    .line 267
    .line 268
    iget-object v10, v4, Lx1/f0;->R:Ly0/o;

    .line 269
    .line 270
    if-eqz v10, :cond_14

    .line 271
    .line 272
    if-nez v6, :cond_14

    .line 273
    .line 274
    move-object v4, v12

    .line 275
    const/4 v1, 0x0

    .line 276
    :goto_c
    iget v5, v14, Lj0/b;->i:I

    .line 277
    .line 278
    if-ge v1, v5, :cond_12

    .line 279
    .line 280
    iget-object v5, v14, Lj0/b;->g:[Ljava/lang/Object;

    .line 281
    .line 282
    aget-object v5, v5, v1

    .line 283
    .line 284
    check-cast v5, Ly0/m;

    .line 285
    .line 286
    invoke-static {v5, v4}, Lx1/b1;->b(Ly0/m;Ly0/n;)Ly0/n;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    add-int/lit8 v1, v1, 0x1

    .line 291
    .line 292
    goto :goto_c

    .line 293
    :cond_12
    iget-object v1, v9, Ly0/n;->k:Ly0/n;

    .line 294
    .line 295
    const/4 v4, 0x0

    .line 296
    :goto_d
    if-eqz v1, :cond_13

    .line 297
    .line 298
    if-eq v1, v12, :cond_13

    .line 299
    .line 300
    iget v5, v1, Ly0/n;->i:I

    .line 301
    .line 302
    or-int/2addr v4, v5

    .line 303
    iput v4, v1, Ly0/n;->j:I

    .line 304
    .line 305
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 306
    .line 307
    goto :goto_d

    .line 308
    :cond_13
    move-object v1, v2

    .line 309
    move-object v5, v12

    .line 310
    move-object v4, v14

    .line 311
    goto :goto_b

    .line 312
    :cond_14
    if-nez v1, :cond_18

    .line 313
    .line 314
    if-eqz v3, :cond_17

    .line 315
    .line 316
    iget-object v1, v12, Ly0/n;->l:Ly0/n;

    .line 317
    .line 318
    const/4 v6, 0x0

    .line 319
    :goto_e
    if-eqz v1, :cond_15

    .line 320
    .line 321
    iget v10, v3, Lj0/b;->i:I

    .line 322
    .line 323
    if-ge v6, v10, :cond_15

    .line 324
    .line 325
    invoke-static {v1}, Lx1/b1;->c(Ly0/n;)Ly0/n;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget-object v1, v1, Ly0/n;->l:Ly0/n;

    .line 330
    .line 331
    add-int/lit8 v6, v6, 0x1

    .line 332
    .line 333
    goto :goto_e

    .line 334
    :cond_15
    invoke-virtual {v4}, Lx1/f0;->u()Lx1/f0;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    if-eqz v1, :cond_16

    .line 339
    .line 340
    iget-object v1, v1, Lx1/f0;->L:Lx1/b1;

    .line 341
    .line 342
    iget-object v1, v1, Lx1/b1;->c:Lx1/r;

    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_16
    move-object v1, v7

    .line 346
    :goto_f
    iput-object v1, v5, Lx1/i1;->w:Lx1/i1;

    .line 347
    .line 348
    iput-object v5, v2, Lx1/b1;->d:Lx1/i1;

    .line 349
    .line 350
    :goto_10
    move-object v1, v2

    .line 351
    move-object v5, v12

    .line 352
    move-object v4, v14

    .line 353
    const/4 v15, 0x0

    .line 354
    goto :goto_13

    .line 355
    :cond_17
    invoke-static {v13}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    throw v1

    .line 360
    :cond_18
    if-nez v3, :cond_19

    .line 361
    .line 362
    new-instance v3, Lj0/b;

    .line 363
    .line 364
    const/16 v1, 0x10

    .line 365
    .line 366
    new-array v4, v1, [Ly0/m;

    .line 367
    .line 368
    invoke-direct {v3, v4}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_19
    if-eqz v10, :cond_1a

    .line 372
    .line 373
    const/4 v15, 0x1

    .line 374
    :goto_11
    const/16 v17, 0x1

    .line 375
    .line 376
    goto :goto_12

    .line 377
    :cond_1a
    const/4 v15, 0x0

    .line 378
    goto :goto_11

    .line 379
    :goto_12
    xor-int/lit8 v6, v15, 0x1

    .line 380
    .line 381
    move-object v1, v2

    .line 382
    const/4 v2, 0x0

    .line 383
    move-object v5, v12

    .line 384
    move-object v4, v14

    .line 385
    invoke-virtual/range {v1 .. v6}, Lx1/b1;->f(ILj0/b;Lj0/b;Ly0/n;Z)V

    .line 386
    .line 387
    .line 388
    move/from16 v15, v17

    .line 389
    .line 390
    :goto_13
    iput-object v4, v1, Lx1/b1;->g:Lj0/b;

    .line 391
    .line 392
    if-eqz v3, :cond_1b

    .line 393
    .line 394
    invoke-virtual {v3}, Lj0/b;->g()V

    .line 395
    .line 396
    .line 397
    goto :goto_14

    .line 398
    :cond_1b
    move-object v3, v7

    .line 399
    :goto_14
    iput-object v3, v1, Lx1/b1;->h:Lj0/b;

    .line 400
    .line 401
    iget-object v2, v5, Ly0/n;->l:Ly0/n;

    .line 402
    .line 403
    if-nez v2, :cond_1c

    .line 404
    .line 405
    goto :goto_15

    .line 406
    :cond_1c
    move-object v9, v2

    .line 407
    :goto_15
    iput-object v7, v9, Ly0/n;->k:Ly0/n;

    .line 408
    .line 409
    iput-object v7, v5, Ly0/n;->l:Ly0/n;

    .line 410
    .line 411
    const/4 v2, -0x1

    .line 412
    iput v2, v5, Ly0/n;->j:I

    .line 413
    .line 414
    iput-object v7, v5, Ly0/n;->n:Lx1/i1;

    .line 415
    .line 416
    if-eq v9, v5, :cond_1d

    .line 417
    .line 418
    goto :goto_16

    .line 419
    :cond_1d
    const-string v2, "trimChain did not update the head"

    .line 420
    .line 421
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    :goto_16
    iput-object v9, v1, Lx1/b1;->f:Ly0/n;

    .line 425
    .line 426
    if-eqz v15, :cond_1e

    .line 427
    .line 428
    invoke-virtual {v1}, Lx1/b1;->g()V

    .line 429
    .line 430
    .line 431
    :cond_1e
    const/16 v2, 0x10

    .line 432
    .line 433
    invoke-virtual {v1, v2}, Lx1/b1;->d(I)Z

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    const/16 v3, 0x400

    .line 438
    .line 439
    invoke-virtual {v1, v3}, Lx1/b1;->d(I)Z

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    iget-object v4, v0, Lx1/f0;->M:Lx1/j0;

    .line 444
    .line 445
    invoke-virtual {v4}, Lx1/j0;->j()V

    .line 446
    .line 447
    .line 448
    iget-object v4, v0, Lx1/f0;->n:Lx1/f0;

    .line 449
    .line 450
    if-nez v4, :cond_1f

    .line 451
    .line 452
    const/16 v4, 0x200

    .line 453
    .line 454
    invoke-virtual {v1, v4}, Lx1/b1;->d(I)Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_1f

    .line 459
    .line 460
    invoke-virtual {v0, v0}, Lx1/f0;->b0(Lx1/f0;)V

    .line 461
    .line 462
    .line 463
    :cond_1f
    if-ne v8, v2, :cond_20

    .line 464
    .line 465
    if-eq v11, v3, :cond_22

    .line 466
    .line 467
    :cond_20
    invoke-static {v0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    check-cast v1, Ly1/t;

    .line 472
    .line 473
    invoke-virtual {v1}, Ly1/t;->getRectManager()Lg2/b;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0}, Lx1/f0;->G()Z

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    if-eqz v4, :cond_22

    .line 485
    .line 486
    iget-object v1, v1, Lg2/b;->b:Lac/k;

    .line 487
    .line 488
    iget v4, v0, Lx1/f0;->h:I

    .line 489
    .line 490
    const v5, 0x1ffffff

    .line 491
    .line 492
    .line 493
    and-int/2addr v4, v5

    .line 494
    iget-object v6, v1, Lac/k;->i:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v6, [J

    .line 497
    .line 498
    iget v1, v1, Lac/k;->h:I

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    :goto_17
    array-length v7, v6

    .line 502
    add-int/lit8 v7, v7, -0x2

    .line 503
    .line 504
    if-ge v13, v7, :cond_22

    .line 505
    .line 506
    if-ge v13, v1, :cond_22

    .line 507
    .line 508
    add-int/lit8 v7, v13, 0x2

    .line 509
    .line 510
    aget-wide v8, v6, v7

    .line 511
    .line 512
    long-to-int v10, v8

    .line 513
    and-int/2addr v10, v5

    .line 514
    if-ne v10, v4, :cond_21

    .line 515
    .line 516
    const-wide v4, -0x6000000000000001L

    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    and-long/2addr v4, v8

    .line 522
    const-wide/high16 v8, 0x2000000000000000L

    .line 523
    .line 524
    int-to-long v10, v3

    .line 525
    mul-long/2addr v10, v8

    .line 526
    or-long v3, v4, v10

    .line 527
    .line 528
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 529
    .line 530
    int-to-long v1, v2

    .line 531
    mul-long/2addr v1, v8

    .line 532
    or-long/2addr v1, v3

    .line 533
    aput-wide v1, v6, v7

    .line 534
    .line 535
    return-void

    .line 536
    :cond_21
    add-int/lit8 v13, v13, 0x3

    .line 537
    .line 538
    goto :goto_17

    .line 539
    :cond_22
    return-void
.end method

.method public final c0(Lv1/n0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->C:Lv1/n0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lx1/f0;->C:Lv1/n0;

    .line 10
    .line 11
    iget-object v0, p0, Lx1/f0;->D:Lp4/t;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Li0/j1;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lx1/f0;->D()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final d(Lx1/r1;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Cannot attach "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " as it already is attached.  Tree: "

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lx1/f0;->g(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Lx1/f0;->s:Lx1/f0;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-object v0, v0, Lx1/f0;->t:Lx1/r1;

    .line 42
    .line 43
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v3, "Attaching to a different owner("

    .line 53
    .line 54
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v3, ") than the parent\'s owner("

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    iget-object v3, v3, Lx1/f0;->t:Lx1/r1;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v3, v2

    .line 75
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v3, "). This tree: "

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lx1/f0;->g(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v3, " Parent tree: "

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v3, p0, Lx1/f0;->s:Lx1/f0;

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Lx1/f0;->g(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move-object v3, v2

    .line 105
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v3, p0, Lx1/f0;->M:Lx1/j0;

    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    iget-object v5, v3, Lx1/j0;->p:Lx1/v0;

    .line 125
    .line 126
    iput-boolean v4, v5, Lx1/v0;->y:Z

    .line 127
    .line 128
    move-object v5, p1

    .line 129
    check-cast v5, Ly1/t;

    .line 130
    .line 131
    invoke-virtual {v5}, Ly1/t;->getRectManager()Lg2/b;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v5, p0}, Lg2/b;->f(Lx1/f0;)V

    .line 136
    .line 137
    .line 138
    iget-object v5, v3, Lx1/j0;->q:Lx1/r0;

    .line 139
    .line 140
    if-eqz v5, :cond_5

    .line 141
    .line 142
    sget-object v6, Lx1/p0;->g:Lx1/p0;

    .line 143
    .line 144
    iput-object v6, v5, Lx1/r0;->w:Lx1/p0;

    .line 145
    .line 146
    :cond_5
    iget-object v5, p0, Lx1/f0;->L:Lx1/b1;

    .line 147
    .line 148
    iget-object v6, v5, Lx1/b1;->d:Lx1/i1;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    iget-object v7, v0, Lx1/f0;->L:Lx1/b1;

    .line 153
    .line 154
    iget-object v7, v7, Lx1/b1;->c:Lx1/r;

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move-object v7, v2

    .line 158
    :goto_4
    iput-object v7, v6, Lx1/i1;->w:Lx1/i1;

    .line 159
    .line 160
    iput-object p1, p0, Lx1/f0;->t:Lx1/r1;

    .line 161
    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    iget v6, v0, Lx1/f0;->v:I

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_7
    const/4 v6, -0x1

    .line 168
    :goto_5
    add-int/2addr v6, v4

    .line 169
    iput v6, p0, Lx1/f0;->v:I

    .line 170
    .line 171
    iget-object v6, p0, Lx1/f0;->R:Ly0/o;

    .line 172
    .line 173
    if-eqz v6, :cond_8

    .line 174
    .line 175
    invoke-virtual {p0, v6}, Lx1/f0;->c(Ly0/o;)V

    .line 176
    .line 177
    .line 178
    :cond_8
    iput-object v2, p0, Lx1/f0;->R:Ly0/o;

    .line 179
    .line 180
    move-object v2, p1

    .line 181
    check-cast v2, Ly1/t;

    .line 182
    .line 183
    invoke-virtual {v2}, Ly1/t;->getLayoutNodes()Lf/w;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    iget v7, p0, Lx1/f0;->h:I

    .line 188
    .line 189
    invoke-virtual {v6, v7, p0}, Lf/w;->h(ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object v6, p0, Lx1/f0;->s:Lx1/f0;

    .line 193
    .line 194
    if-eqz v6, :cond_9

    .line 195
    .line 196
    iget-object v6, v6, Lx1/f0;->n:Lx1/f0;

    .line 197
    .line 198
    if-nez v6, :cond_a

    .line 199
    .line 200
    :cond_9
    iget-object v6, p0, Lx1/f0;->n:Lx1/f0;

    .line 201
    .line 202
    :cond_a
    invoke-virtual {p0, v6}, Lx1/f0;->b0(Lx1/f0;)V

    .line 203
    .line 204
    .line 205
    iget-object v6, p0, Lx1/f0;->n:Lx1/f0;

    .line 206
    .line 207
    if-nez v6, :cond_b

    .line 208
    .line 209
    const/16 v6, 0x200

    .line 210
    .line 211
    invoke-virtual {v5, v6}, Lx1/b1;->d(I)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_b

    .line 216
    .line 217
    invoke-virtual {p0, p0}, Lx1/f0;->b0(Lx1/f0;)V

    .line 218
    .line 219
    .line 220
    :cond_b
    iget-boolean v6, p0, Lx1/f0;->W:Z

    .line 221
    .line 222
    if-nez v6, :cond_c

    .line 223
    .line 224
    iget-object v6, v5, Lx1/b1;->f:Ly0/n;

    .line 225
    .line 226
    :goto_6
    if-eqz v6, :cond_c

    .line 227
    .line 228
    invoke-virtual {v6}, Ly0/n;->a1()V

    .line 229
    .line 230
    .line 231
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_c
    iget-object v6, p0, Lx1/f0;->p:Lp4/t;

    .line 235
    .line 236
    iget-object v6, v6, Lp4/t;->h:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v6, Lj0/b;

    .line 239
    .line 240
    iget-object v7, v6, Lj0/b;->g:[Ljava/lang/Object;

    .line 241
    .line 242
    iget v6, v6, Lj0/b;->i:I

    .line 243
    .line 244
    :goto_7
    if-ge v1, v6, :cond_d

    .line 245
    .line 246
    aget-object v8, v7, v1

    .line 247
    .line 248
    check-cast v8, Lx1/f0;

    .line 249
    .line 250
    invoke-virtual {v8, p1}, Lx1/f0;->d(Lx1/r1;)V

    .line 251
    .line 252
    .line 253
    add-int/lit8 v1, v1, 0x1

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_d
    iget-boolean v1, p0, Lx1/f0;->W:Z

    .line 257
    .line 258
    if-nez v1, :cond_e

    .line 259
    .line 260
    invoke-virtual {v5}, Lx1/b1;->e()V

    .line 261
    .line 262
    .line 263
    :cond_e
    invoke-virtual {p0}, Lx1/f0;->D()V

    .line 264
    .line 265
    .line 266
    if-eqz v0, :cond_f

    .line 267
    .line 268
    invoke-virtual {v0}, Lx1/f0;->D()V

    .line 269
    .line 270
    .line 271
    :cond_f
    iget-object v0, p0, Lx1/f0;->S:Lx2/c;

    .line 272
    .line 273
    if-eqz v0, :cond_10

    .line 274
    .line 275
    invoke-virtual {v0, p1}, Lx2/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    :cond_10
    invoke-virtual {v3}, Lx1/j0;->j()V

    .line 279
    .line 280
    .line 281
    iget-boolean p1, p0, Lx1/f0;->W:Z

    .line 282
    .line 283
    if-nez p1, :cond_11

    .line 284
    .line 285
    const/16 p1, 0x8

    .line 286
    .line 287
    invoke-virtual {v5, p1}, Lx1/b1;->d(I)Z

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    if-eqz p1, :cond_11

    .line 292
    .line 293
    invoke-virtual {p0}, Lx1/f0;->E()V

    .line 294
    .line 295
    .line 296
    :cond_11
    iget-object p1, v2, Ly1/t;->T:Lz0/c;

    .line 297
    .line 298
    if-eqz p1, :cond_12

    .line 299
    .line 300
    invoke-virtual {p0}, Lx1/f0;->w()Lf2/m;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-eqz v0, :cond_12

    .line 305
    .line 306
    iget-object v0, v0, Lf2/m;->g:Lf/k0;

    .line 307
    .line 308
    sget-object v1, Lf2/u;->q:Lf2/x;

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-ne v0, v4, :cond_12

    .line 315
    .line 316
    iget-object v0, p1, Lz0/c;->n:Lf/x;

    .line 317
    .line 318
    iget v1, p0, Lx1/f0;->h:I

    .line 319
    .line 320
    invoke-virtual {v0, v1}, Lf/x;->a(I)Z

    .line 321
    .line 322
    .line 323
    iget-object v0, p1, Lz0/c;->g:Lxe/e;

    .line 324
    .line 325
    iget-object p1, p1, Lz0/c;->i:Ly1/t;

    .line 326
    .line 327
    iget v1, p0, Lx1/f0;->h:I

    .line 328
    .line 329
    invoke-virtual {v0, p1, v1, v4}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 330
    .line 331
    .line 332
    :cond_12
    return-void
.end method

.method public final d0(Ly0/o;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx1/f0;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lx1/f0;->Q:Ly0/o;

    .line 6
    .line 7
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    .line 13
    .line 14
    invoke-static {v0}, Lu1/a;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lx1/f0;->W:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const-string v0, "modifier is updated when deactivated"

    .line 22
    .line 23
    invoke-static {v0}, Lu1/a;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-virtual {p0}, Lx1/f0;->G()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lx1/f0;->c(Ly0/o;)V

    .line 33
    .line 34
    .line 35
    iget-boolean p1, p0, Lx1/f0;->x:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Lx1/f0;->E()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void

    .line 43
    :cond_4
    iput-object p1, p0, Lx1/f0;->R:Ly0/o;

    .line 44
    .line 45
    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lx1/f0;->I:Lx1/d0;

    .line 2
    .line 3
    iput-object v0, p0, Lx1/f0;->J:Lx1/d0;

    .line 4
    .line 5
    sget-object v0, Lx1/d0;->i:Lx1/d0;

    .line 6
    .line 7
    iput-object v0, p0, Lx1/f0;->I:Lx1/d0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    iget v1, v1, Lj0/b;->i:I

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v1, :cond_1

    .line 19
    .line 20
    aget-object v4, v2, v3

    .line 21
    .line 22
    check-cast v4, Lx1/f0;

    .line 23
    .line 24
    iget-object v5, v4, Lx1/f0;->I:Lx1/d0;

    .line 25
    .line 26
    if-eq v5, v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4}, Lx1/f0;->e()V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final e0(Ly1/l2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lx1/f0;->G:Ly1/l2;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iput-object p1, p0, Lx1/f0;->G:Ly1/l2;

    .line 10
    .line 11
    iget-object p1, p0, Lx1/f0;->L:Lx1/b1;

    .line 12
    .line 13
    iget-object p1, p1, Lx1/b1;->f:Ly0/n;

    .line 14
    .line 15
    iget v0, p1, Ly0/n;->j:I

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    :goto_0
    if-eqz p1, :cond_8

    .line 23
    .line 24
    iget v0, p1, Ly0/n;->i:I

    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    if-eqz v0, :cond_7

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, v0

    .line 32
    :goto_1
    if-eqz v2, :cond_7

    .line 33
    .line 34
    instance-of v4, v2, Lx1/w1;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    check-cast v2, Lx1/w1;

    .line 39
    .line 40
    invoke-interface {v2}, Lx1/w1;->N0()V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_0
    iget v4, v2, Ly0/n;->i:I

    .line 45
    .line 46
    and-int/2addr v4, v1

    .line 47
    if-eqz v4, :cond_6

    .line 48
    .line 49
    instance-of v4, v2, Lx1/j;

    .line 50
    .line 51
    if-eqz v4, :cond_6

    .line 52
    .line 53
    move-object v4, v2

    .line 54
    check-cast v4, Lx1/j;

    .line 55
    .line 56
    iget-object v4, v4, Lx1/j;->v:Ly0/n;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    :goto_2
    const/4 v6, 0x1

    .line 60
    if-eqz v4, :cond_5

    .line 61
    .line 62
    iget v7, v4, Ly0/n;->i:I

    .line 63
    .line 64
    and-int/2addr v7, v1

    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    if-ne v5, v6, :cond_1

    .line 70
    .line 71
    move-object v2, v4

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    if-nez v3, :cond_2

    .line 74
    .line 75
    new-instance v3, Lj0/b;

    .line 76
    .line 77
    new-array v6, v1, [Ly0/n;

    .line 78
    .line 79
    invoke-direct {v3, v6}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-virtual {v3, v2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v2, v0

    .line 88
    :cond_3
    invoke-virtual {v3, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_3
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    if-ne v5, v6, :cond_6

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    :goto_4
    invoke-static {v3}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    goto :goto_1

    .line 102
    :cond_7
    iget v0, p1, Ly0/n;->j:I

    .line 103
    .line 104
    and-int/2addr v0, v1

    .line 105
    if-eqz v0, :cond_8

    .line 106
    .line 107
    iget-object p1, p1, Ly0/n;->l:Ly0/n;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_8
    return-void
.end method

.method public final f()V
    .locals 6

    .line 1
    iget-object v0, p0, Lx1/f0;->I:Lx1/d0;

    .line 2
    .line 3
    iput-object v0, p0, Lx1/f0;->J:Lx1/d0;

    .line 4
    .line 5
    sget-object v0, Lx1/d0;->i:Lx1/d0;

    .line 6
    .line 7
    iput-object v0, p0, Lx1/f0;->I:Lx1/d0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    iget v0, v0, Lj0/b;->i:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_1

    .line 19
    .line 20
    aget-object v3, v1, v2

    .line 21
    .line 22
    check-cast v3, Lx1/f0;

    .line 23
    .line 24
    iget-object v4, v3, Lx1/f0;->I:Lx1/d0;

    .line 25
    .line 26
    sget-object v5, Lx1/d0;->h:Lx1/d0;

    .line 27
    .line 28
    if-ne v4, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Lx1/f0;->f()V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final f0()V
    .locals 6

    .line 1
    iget v0, p0, Lx1/f0;->o:I

    .line 2
    .line 3
    if-lez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lx1/f0;->r:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lx1/f0;->r:Z

    .line 11
    .line 12
    iget-object v1, p0, Lx1/f0;->q:Lj0/b;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lj0/b;

    .line 17
    .line 18
    const/16 v2, 0x10

    .line 19
    .line 20
    new-array v2, v2, [Lx1/f0;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lx1/f0;->q:Lj0/b;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1}, Lj0/b;->g()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lx1/f0;->p:Lp4/t;

    .line 31
    .line 32
    iget-object v2, v2, Lp4/t;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lj0/b;

    .line 35
    .line 36
    iget-object v3, v2, Lj0/b;->g:[Ljava/lang/Object;

    .line 37
    .line 38
    iget v2, v2, Lj0/b;->i:I

    .line 39
    .line 40
    :goto_0
    if-ge v0, v2, :cond_2

    .line 41
    .line 42
    aget-object v4, v3, v0

    .line 43
    .line 44
    check-cast v4, Lx1/f0;

    .line 45
    .line 46
    iget-boolean v5, v4, Lx1/f0;->g:Z

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v4}, Lx1/f0;->y()Lj0/b;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget v5, v1, Lj0/b;->i:I

    .line 55
    .line 56
    invoke-virtual {v1, v5, v4}, Lj0/b;->c(ILj0/b;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 67
    .line 68
    iget-object v1, v0, Lx1/j0;->p:Lx1/v0;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    iput-boolean v2, v1, Lx1/v0;->F:Z

    .line 72
    .line 73
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iput-boolean v2, v0, Lx1/r0;->z:Z

    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public final g(I)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    const-string v3, "  "

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "|-"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lx1/f0;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, v2, Lj0/b;->g:[Ljava/lang/Object;

    .line 40
    .line 41
    iget v2, v2, Lj0/b;->i:I

    .line 42
    .line 43
    move v4, v1

    .line 44
    :goto_1
    if-ge v4, v2, :cond_1

    .line 45
    .line 46
    aget-object v5, v3, v4

    .line 47
    .line 48
    check-cast v5, Lx1/f0;

    .line 49
    .line 50
    add-int/lit8 v6, p1, 0x1

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Lx1/f0;->g(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    invoke-static {p1, v1, v0}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_2
    return-object v0
.end method

.method public final h()V
    .locals 11

    .line 1
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "Cannot detach node that is already detached!  Tree: "

    .line 10
    .line 11
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Lx1/f0;->g(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lu1/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lokio/a;->c()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, Lx1/f0;->M:Lx1/j0;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3}, Lx1/f0;->B()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lx1/f0;->D()V

    .line 50
    .line 51
    .line 52
    iget-object v3, v4, Lx1/j0;->p:Lx1/v0;

    .line 53
    .line 54
    sget-object v5, Lx1/d0;->i:Lx1/d0;

    .line 55
    .line 56
    iput-object v5, v3, Lx1/v0;->r:Lx1/d0;

    .line 57
    .line 58
    iget-object v3, v4, Lx1/j0;->q:Lx1/r0;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    iput-object v5, v3, Lx1/r0;->p:Lx1/d0;

    .line 63
    .line 64
    :cond_2
    iget-object v3, v4, Lx1/j0;->p:Lx1/v0;

    .line 65
    .line 66
    iget-object v3, v3, Lx1/v0;->D:Lx1/g0;

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    iput-boolean v5, v3, Lx1/g0;->b:Z

    .line 70
    .line 71
    iput-boolean v2, v3, Lx1/g0;->c:Z

    .line 72
    .line 73
    iput-boolean v2, v3, Lx1/g0;->d:Z

    .line 74
    .line 75
    iput-boolean v2, v3, Lx1/g0;->e:Z

    .line 76
    .line 77
    iput-object v1, v3, Lx1/g0;->f:Lx1/a;

    .line 78
    .line 79
    iget-object v3, v4, Lx1/j0;->q:Lx1/r0;

    .line 80
    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    iget-object v3, v3, Lx1/r0;->x:Lx1/g0;

    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    iput-boolean v5, v3, Lx1/g0;->b:Z

    .line 88
    .line 89
    iput-boolean v2, v3, Lx1/g0;->c:Z

    .line 90
    .line 91
    iput-boolean v2, v3, Lx1/g0;->d:Z

    .line 92
    .line 93
    iput-boolean v2, v3, Lx1/g0;->e:Z

    .line 94
    .line 95
    iput-object v1, v3, Lx1/g0;->f:Lx1/a;

    .line 96
    .line 97
    :cond_3
    iget-object v3, p0, Lx1/f0;->L:Lx1/b1;

    .line 98
    .line 99
    iget-object v6, v3, Lx1/b1;->d:Lx1/i1;

    .line 100
    .line 101
    iget-object v7, v3, Lx1/b1;->e:Lx1/b2;

    .line 102
    .line 103
    iget-object v8, v3, Lx1/b1;->c:Lx1/r;

    .line 104
    .line 105
    iget-object v8, v8, Lx1/i1;->v:Lx1/i1;

    .line 106
    .line 107
    :goto_0
    invoke-static {v6, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-nez v9, :cond_5

    .line 112
    .line 113
    if-eqz v6, :cond_5

    .line 114
    .line 115
    invoke-virtual {v6}, Lx1/i1;->J1()V

    .line 116
    .line 117
    .line 118
    iget-object v9, v6, Lx1/i1;->u:Lx1/f0;

    .line 119
    .line 120
    invoke-virtual {v9}, Lx1/f0;->H()Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_4

    .line 125
    .line 126
    invoke-virtual {v6}, Lx1/i1;->E1()V

    .line 127
    .line 128
    .line 129
    :cond_4
    iget-object v6, v6, Lx1/i1;->v:Lx1/i1;

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_5
    iget-object v6, p0, Lx1/f0;->T:Ls1/b0;

    .line 133
    .line 134
    if-eqz v6, :cond_6

    .line 135
    .line 136
    invoke-virtual {v6, v0}, Ls1/b0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :cond_6
    move-object v6, v7

    .line 140
    :goto_1
    if-eqz v6, :cond_8

    .line 141
    .line 142
    iget-boolean v8, v6, Ly0/n;->t:Z

    .line 143
    .line 144
    if-eqz v8, :cond_7

    .line 145
    .line 146
    invoke-virtual {v6}, Ly0/n;->h1()V

    .line 147
    .line 148
    .line 149
    :cond_7
    iget-object v6, v6, Ly0/n;->k:Ly0/n;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_8
    iput-boolean v5, p0, Lx1/f0;->w:Z

    .line 153
    .line 154
    iget-object v6, p0, Lx1/f0;->p:Lp4/t;

    .line 155
    .line 156
    iget-object v6, v6, Lp4/t;->h:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v6, Lj0/b;

    .line 159
    .line 160
    iget-object v8, v6, Lj0/b;->g:[Ljava/lang/Object;

    .line 161
    .line 162
    iget v6, v6, Lj0/b;->i:I

    .line 163
    .line 164
    move v9, v2

    .line 165
    :goto_2
    if-ge v9, v6, :cond_9

    .line 166
    .line 167
    aget-object v10, v8, v9

    .line 168
    .line 169
    check-cast v10, Lx1/f0;

    .line 170
    .line 171
    invoke-virtual {v10}, Lx1/f0;->h()V

    .line 172
    .line 173
    .line 174
    add-int/lit8 v9, v9, 0x1

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    iput-boolean v2, p0, Lx1/f0;->w:Z

    .line 178
    .line 179
    :goto_3
    if-eqz v7, :cond_b

    .line 180
    .line 181
    iget-boolean v6, v7, Ly0/n;->t:Z

    .line 182
    .line 183
    if-eqz v6, :cond_a

    .line 184
    .line 185
    invoke-virtual {v7}, Ly0/n;->b1()V

    .line 186
    .line 187
    .line 188
    :cond_a
    iget-object v7, v7, Ly0/n;->k:Ly0/n;

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_b
    check-cast v0, Ly1/t;

    .line 192
    .line 193
    invoke-virtual {v0}, Ly1/t;->getLayoutNodes()Lf/w;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    iget v7, p0, Lx1/f0;->h:I

    .line 198
    .line 199
    invoke-virtual {v6, v7}, Lf/w;->g(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    iget-object v6, v0, Ly1/t;->f0:Lx1/t0;

    .line 203
    .line 204
    iget-object v7, v6, Lx1/t0;->b:Lb5/c;

    .line 205
    .line 206
    iget-object v8, v7, Lb5/c;->a:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v8, Lm/a;

    .line 209
    .line 210
    invoke-virtual {v8, p0}, Lm/a;->u(Lx1/f0;)Z

    .line 211
    .line 212
    .line 213
    iget-object v8, v7, Lb5/c;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v8, Lm/a;

    .line 216
    .line 217
    invoke-virtual {v8, p0}, Lm/a;->u(Lx1/f0;)Z

    .line 218
    .line 219
    .line 220
    iget-object v7, v7, Lb5/c;->c:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v7, Lm/a;

    .line 223
    .line 224
    invoke-virtual {v7, p0}, Lm/a;->u(Lx1/f0;)Z

    .line 225
    .line 226
    .line 227
    iget-object v6, v6, Lx1/t0;->e:Lp4/t;

    .line 228
    .line 229
    iget-object v6, v6, Lp4/t;->h:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v6, Lj0/b;

    .line 232
    .line 233
    invoke-virtual {v6, p0}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    iput-boolean v5, v0, Ly1/t;->U:Z

    .line 237
    .line 238
    iget-object v5, v0, Ly1/t;->T:Lz0/c;

    .line 239
    .line 240
    if-eqz v5, :cond_c

    .line 241
    .line 242
    iget-object v6, v5, Lz0/c;->n:Lf/x;

    .line 243
    .line 244
    iget v7, p0, Lx1/f0;->h:I

    .line 245
    .line 246
    invoke-virtual {v6, v7}, Lf/x;->e(I)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-eqz v6, :cond_c

    .line 251
    .line 252
    iget-object v6, v5, Lz0/c;->g:Lxe/e;

    .line 253
    .line 254
    iget-object v5, v5, Lz0/c;->i:Ly1/t;

    .line 255
    .line 256
    iget v7, p0, Lx1/f0;->h:I

    .line 257
    .line 258
    invoke-virtual {v6, v5, v7, v2}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 259
    .line 260
    .line 261
    :cond_c
    invoke-virtual {v0}, Ly1/t;->getRectManager()Lg2/b;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v5, p0}, Lg2/b;->g(Lx1/f0;)V

    .line 266
    .line 267
    .line 268
    iput-object v1, p0, Lx1/f0;->t:Lx1/r1;

    .line 269
    .line 270
    invoke-virtual {p0, v1}, Lx1/f0;->b0(Lx1/f0;)V

    .line 271
    .line 272
    .line 273
    iput v2, p0, Lx1/f0;->v:I

    .line 274
    .line 275
    iget-object v5, v4, Lx1/j0;->p:Lx1/v0;

    .line 276
    .line 277
    const v6, 0x7fffffff

    .line 278
    .line 279
    .line 280
    iput v6, v5, Lx1/v0;->o:I

    .line 281
    .line 282
    iput v6, v5, Lx1/v0;->n:I

    .line 283
    .line 284
    iput-boolean v2, v5, Lx1/v0;->y:Z

    .line 285
    .line 286
    iget-object v4, v4, Lx1/j0;->q:Lx1/r0;

    .line 287
    .line 288
    if-eqz v4, :cond_d

    .line 289
    .line 290
    iput v6, v4, Lx1/r0;->o:I

    .line 291
    .line 292
    iput v6, v4, Lx1/r0;->n:I

    .line 293
    .line 294
    sget-object v5, Lx1/p0;->i:Lx1/p0;

    .line 295
    .line 296
    iput-object v5, v4, Lx1/r0;->w:Lx1/p0;

    .line 297
    .line 298
    :cond_d
    const/16 v4, 0x8

    .line 299
    .line 300
    invoke-virtual {v3, v4}, Lx1/b1;->d(I)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_e

    .line 305
    .line 306
    iget-object v3, p0, Lx1/f0;->y:Lf2/m;

    .line 307
    .line 308
    iput-object v1, p0, Lx1/f0;->y:Lf2/m;

    .line 309
    .line 310
    iput-boolean v2, p0, Lx1/f0;->x:Z

    .line 311
    .line 312
    invoke-virtual {v0}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v1, p0, v3}, Lf2/s;->b(Lx1/f0;Lf2/m;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Ly1/t;->E()V

    .line 320
    .line 321
    .line 322
    :cond_e
    return-void
.end method

.method public final i(Lf1/u;Li1/b;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/b1;->d:Lx1/i1;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lx1/i1;->k1(Lf1/u;Li1/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    invoke-virtual {p0, p1}, Lx1/f0;->Y(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    throw p1
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/f0;->n:Lx1/f0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, v2, v1}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0, v2, v1}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 15
    .line 16
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 17
    .line 18
    iget-boolean v1, v0, Lx1/v0;->p:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-wide v0, v0, Lv1/b1;->j:J

    .line 23
    .line 24
    new-instance v2, Lu2/a;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lu2/a;-><init>(J)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_1
    iget-object v0, p0, Lx1/f0;->t:Lx1/r1;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-wide v1, v2, Lu2/a;->a:J

    .line 38
    .line 39
    check-cast v0, Ly1/t;

    .line 40
    .line 41
    invoke-virtual {v0, p0, v1, v2}, Ly1/t;->y(Lx1/f0;J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    check-cast v0, Ly1/t;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ly1/t;->x(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public final l()Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lx1/r0;->y:Lj0/b;

    .line 9
    .line 10
    iget-object v2, v0, Lx1/r0;->l:Lx1/j0;

    .line 11
    .line 12
    iget-object v3, v2, Lx1/j0;->a:Lx1/f0;

    .line 13
    .line 14
    invoke-virtual {v3}, Lx1/f0;->n()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    iget-boolean v3, v0, Lx1/r0;->z:Z

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Lj0/b;->f()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object v2, v2, Lx1/j0;->a:Lx1/f0;

    .line 27
    .line 28
    invoke-virtual {v2}, Lx1/f0;->y()Lj0/b;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-object v4, v3, Lj0/b;->g:[Ljava/lang/Object;

    .line 33
    .line 34
    iget v3, v3, Lj0/b;->i:I

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    move v6, v5

    .line 38
    :goto_0
    if-ge v6, v3, :cond_2

    .line 39
    .line 40
    aget-object v7, v4, v6

    .line 41
    .line 42
    check-cast v7, Lx1/f0;

    .line 43
    .line 44
    iget v8, v1, Lj0/b;->i:I

    .line 45
    .line 46
    if-gt v8, v6, :cond_1

    .line 47
    .line 48
    iget-object v7, v7, Lx1/f0;->M:Lx1/j0;

    .line 49
    .line 50
    iget-object v7, v7, Lx1/j0;->q:Lx1/r0;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-object v7, v7, Lx1/f0;->M:Lx1/j0;

    .line 60
    .line 61
    iget-object v7, v7, Lx1/j0;->q:Lx1/r0;

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v8, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v9, v8, v6

    .line 69
    .line 70
    aput-object v7, v8, v6

    .line 71
    .line 72
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v2}, Lx1/f0;->n()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lf/d0;

    .line 80
    .line 81
    iget-object v2, v2, Lf/d0;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Lj0/b;

    .line 84
    .line 85
    iget v2, v2, Lj0/b;->i:I

    .line 86
    .line 87
    iget v3, v1, Lj0/b;->i:I

    .line 88
    .line 89
    invoke-virtual {v1, v2, v3}, Lj0/b;->l(II)V

    .line 90
    .line 91
    .line 92
    iput-boolean v5, v0, Lx1/r0;->z:Z

    .line 93
    .line 94
    invoke-virtual {v1}, Lj0/b;->f()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/v0;->J0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final n()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lj0/b;->f()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final o()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->p:Lp4/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lj0/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lj0/b;->f()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 4
    .line 5
    iget-boolean v0, v0, Lx1/v0;->B:Z

    .line 6
    .line 7
    return v0
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 4
    .line 5
    iget-boolean v0, v0, Lx1/v0;->A:Z

    .line 6
    .line 7
    return v0
.end method

.method public final r()Lx1/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 4
    .line 5
    iget-object v0, v0, Lx1/v0;->r:Lx1/d0;

    .line 6
    .line 7
    return-object v0
.end method

.method public final s()Lx1/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lx1/r0;->p:Lx1/d0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    sget-object v0, Lx1/d0;->i:Lx1/d0;

    .line 14
    .line 15
    return-object v0
.end method

.method public final t()Lp4/t;
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/f0;->D:Lp4/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp4/t;

    .line 6
    .line 7
    iget-object v1, p0, Lx1/f0;->C:Lv1/n0;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lp4/t;-><init>(Lx1/f0;Lv1/n0;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lx1/f0;->D:Lp4/t;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ly1/g0;->u(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " children: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lx1/f0;->n()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lf/d0;

    .line 23
    .line 24
    iget-object v1, v1, Lf/d0;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lj0/b;

    .line 27
    .line 28
    iget v1, v1, Lj0/b;->i:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, " measurePolicy: "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lx1/f0;->C:Lv1/n0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, " deactivated: "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, Lx1/f0;->W:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

.method public final u()Lx1/f0;
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/f0;->s:Lx1/f0;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lx1/f0;->g:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lx1/f0;->s:Lx1/f0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-object v0
.end method

.method public final v()I
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 4
    .line 5
    iget v0, v0, Lx1/v0;->o:I

    .line 6
    .line 7
    return v0
.end method

.method public final w()Lf2/m;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lx1/f0;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lx1/f0;->W:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lx1/b1;->d(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lx1/f0;->y:Lf2/m;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method

.method public final x()Lj0/b;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lx1/f0;->B:Z

    .line 2
    .line 3
    iget-object v1, p0, Lx1/f0;->A:Lj0/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lj0/b;->g()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v1, Lj0/b;->i:I

    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Lj0/b;->c(ILj0/b;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 20
    .line 21
    iget v2, v1, Lj0/b;->i:I

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    sget-object v4, Lx1/f0;->Z:Lb8/c;

    .line 25
    .line 26
    invoke-static {v0, v3, v2, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    iput-boolean v3, p0, Lx1/f0;->B:Z

    .line 30
    .line 31
    :cond_0
    return-object v1
.end method

.method public final y()Lj0/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/f0;->f0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lx1/f0;->o:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lx1/f0;->p:Lp4/t;

    .line 9
    .line 10
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lj0/b;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v0, p0, Lx1/f0;->q:Lj0/b;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final z(JLx1/p;IZ)V
    .locals 10

    .line 1
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/b1;->d:Lx1/i1;

    .line 4
    .line 5
    sget-object v2, Lx1/i1;->T:Lf1/o0;

    .line 6
    .line 7
    invoke-virtual {v1, p1, p2}, Lx1/i1;->o1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v5

    .line 11
    iget-object v3, v0, Lx1/b1;->d:Lx1/i1;

    .line 12
    .line 13
    sget-object v4, Lx1/i1;->W:Lx1/c1;

    .line 14
    .line 15
    move-object v7, p3

    .line 16
    move v8, p4

    .line 17
    move v9, p5

    .line 18
    invoke-virtual/range {v3 .. v9}, Lx1/i1;->w1(Lx1/e1;JLx1/p;IZ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
