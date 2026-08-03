.class public final Lpd/i;
.super Lpd/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final s:Lqd/h;

.field public static final t:Lqd/h;


# instance fields
.field public p:I

.field public q:Lud/a;

.field public r:Lud/a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Lqd/q;->n:Lqd/q;

    .line 2
    .line 3
    sget-object v1, Lqd/q;->j:Lqd/q;

    .line 4
    .line 5
    sget-object v2, Lqd/q;->r:Lqd/q;

    .line 6
    .line 7
    sget-object v3, Lqd/q;->s:Lqd/q;

    .line 8
    .line 9
    sget-object v4, Lqd/q;->l:Lqd/q;

    .line 10
    .line 11
    sget-object v5, Lqd/q;->m:Lqd/q;

    .line 12
    .line 13
    sget-object v6, Lqd/q;->k:Lqd/q;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lqd/q;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lqd/h;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Lqd/h;-><init>([Lqd/q;)V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lpd/i;->s:Lqd/h;

    .line 25
    .line 26
    filled-new-array {v0, v4, v5, v6}, [Lqd/q;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lqd/h;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lqd/h;-><init>([Lqd/q;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lpd/i;->t:Lqd/h;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 64
    sget-object v0, Lpd/k;->v:Lpd/k;

    const/4 v1, 0x2

    invoke-direct {p0, v0, p2, v1}, Lpd/h;-><init>(Lpd/k;II)V

    .line 65
    iput p1, p0, Lpd/i;->p:I

    return-void
.end method

.method public constructor <init>(ILqd/l;Lqd/n;)V
    .locals 1

    const/4 v0, -0x1

    .line 66
    invoke-direct {p0, p1, v0}, Lpd/i;-><init>(II)V

    .line 67
    invoke-virtual {p0, p2}, Lud/p;->I(Lqd/l;)V

    .line 68
    invoke-virtual {p0, p3}, Lud/p;->I(Lqd/l;)V

    return-void
.end method

.method public constructor <init>(Lgf/a;I)V
    .locals 3

    .line 1
    iget v0, p1, Lgf/a;->l:I

    .line 2
    .line 3
    sget-object v1, Lpd/k;->v:Lpd/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {p0, v1, v0, v2}, Lpd/h;-><init>(Lpd/k;II)V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lpd/i;->p:I

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p2, v0, :cond_1

    .line 13
    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p2, Lpd/i;->t:Lqd/h;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    sget-object p2, Lpd/i;->s:Lqd/h;

    .line 21
    .line 22
    :goto_1
    sget-object v1, Lqd/l;->k:Lmh/b;

    .line 23
    .line 24
    iget-object v1, p1, Lgf/a;->i:[I

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    aget v1, v1, v2

    .line 28
    .line 29
    new-instance v2, Lqd/r;

    .line 30
    .line 31
    invoke-direct {v2, v1, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lud/p;->I(Lqd/l;)V

    .line 35
    .line 36
    .line 37
    iget v1, p1, Lgf/a;->j:I

    .line 38
    .line 39
    if-ne v1, v0, :cond_2

    .line 40
    .line 41
    const-wide/16 v0, 0x0

    .line 42
    .line 43
    invoke-static {v0, v1, p2}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Lud/p;->I(Lqd/l;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    iget-object p1, p1, Lgf/a;->i:[I

    .line 52
    .line 53
    aget p1, p1, v0

    .line 54
    .line 55
    new-instance v0, Lqd/r;

    .line 56
    .line 57
    invoke-direct {v0, p1, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lud/p;->I(Lqd/l;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 3

    .line 1
    new-instance v0, Lpd/i;

    .line 2
    .line 3
    iget v1, p0, Lpd/i;->p:I

    .line 4
    .line 5
    iget v2, p0, Lpd/h;->o:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lpd/i;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lpd/i;->q:Lud/a;

    .line 11
    .line 12
    iput-object v1, v0, Lpd/i;->q:Lud/a;

    .line 13
    .line 14
    iget-object v1, p0, Lpd/i;->r:Lud/a;

    .line 15
    .line 16
    iput-object v1, v0, Lpd/i;->r:Lud/a;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lpd/i;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lpd/i;

    .line 16
    .line 17
    iget v0, p0, Lpd/i;->p:I

    .line 18
    .line 19
    iget p1, p1, Lpd/i;->p:I

    .line 20
    .line 21
    if-ne v0, p1, :cond_2

    .line 22
    .line 23
    :goto_0
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public final i0(Lud/a;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lud/a;->n:Ljava/util/List;

    .line 2
    .line 3
    iget v0, p0, Lpd/h;->o:I

    .line 4
    .line 5
    invoke-static {v0, p1}, La/a;->T(ILjava/lang/Iterable;)Lud/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lpd/i;->q:Lud/a;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lpd/i;->q:Lud/a;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    iput-object v1, p0, Lpd/i;->r:Lud/a;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-static {p1, v1}, La/a;->N0(Ljava/util/List;Lud/a;)Lud/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lpd/i;->r:Lud/a;

    .line 28
    .line 29
    return-void
.end method

.method public final j0(Lud/a;Lud/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/i;->q:Lud/a;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p2, p0, Lpd/i;->q:Lud/a;

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lpd/i;->r:Lud/a;

    .line 8
    .line 9
    if-ne v0, p1, :cond_1

    .line 10
    .line 11
    iput-object p2, p0, Lpd/i;->r:Lud/a;

    .line 12
    .line 13
    :cond_1
    return-void
.end method

.method public final k0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/i;->q:Lud/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lpd/h;->o:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, v0, Lud/a;->k:I

    .line 9
    .line 10
    return v0
.end method

.method public final l0()V
    .locals 2

    .line 1
    iget v0, p0, Lpd/i;->p:I

    .line 2
    .line 3
    invoke-static {v0}, Lp/a;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lpd/i;->p:I

    .line 8
    .line 9
    iget-object v0, p0, Lpd/i;->q:Lud/a;

    .line 10
    .line 11
    iget-object v1, p0, Lpd/i;->r:Lud/a;

    .line 12
    .line 13
    iput-object v1, p0, Lpd/i;->q:Lud/a;

    .line 14
    .line 15
    iput-object v0, p0, Lpd/i;->r:Lud/a;

    .line 16
    .line 17
    return-void
.end method

.method public final m0()V
    .locals 7

    .line 1
    iget v0, p0, Lpd/i;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Lud/p;->S(I)Lqd/l;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lqd/l;->L()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p0, v1}, Lud/p;->S(I)Lqd/l;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, Lqd/n;

    .line 23
    .line 24
    const-wide/16 v4, 0x1

    .line 25
    .line 26
    sget-object v6, Lqd/j;->c:Lqd/g;

    .line 27
    .line 28
    invoke-direct {v3, v4, v5, v6}, Lqd/n;-><init>(JLqd/j;)V

    .line 29
    .line 30
    .line 31
    iput v0, p0, Lpd/i;->p:I

    .line 32
    .line 33
    invoke-virtual {p0, v1, v2}, Lud/p;->c0(ILqd/l;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, v3}, Lud/p;->c0(ILqd/l;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, Lud/p;->n:I

    .line 2
    .line 3
    invoke-static {v0}, Lxe/m;->d(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lud/p;->k:Lpd/k;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "  "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v2}, Lud/p;->S(I)Lqd/l;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget v3, p0, Lpd/i;->p:I

    .line 29
    .line 30
    invoke-static {v3}, Lp/a;->f(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-virtual {p0, v4}, Lud/p;->S(I)Lqd/l;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, p0, Lpd/i;->q:Lud/a;

    .line 44
    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget v5, p0, Lpd/h;->o:I

    .line 49
    .line 50
    invoke-static {v5}, Lxe/m;->d(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    :goto_0
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {p0}, Lud/p;->M()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    new-instance v7, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, ": "

    .line 71
    .line 72
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, " "

    .line 82
    .line 83
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, "  -> "

    .line 87
    .line 88
    invoke-static {v7, v3, v0, v4, v1}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v7, v5, v6}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method
