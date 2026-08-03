.class public abstract Lqd/l;
.super Lmd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final k:Lmh/b;


# instance fields
.field public i:Lqd/j;

.field public j:Lud/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lqd/l;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lqd/l;->k:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static S(JLqd/j;)Lqd/n;
    .locals 4

    .line 1
    new-instance v0, Lqd/n;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    cmp-long v1, p0, v1

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {p2}, Lqd/j;->w()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_3

    .line 14
    .line 15
    sget-object v2, Lqd/q;->p:Lqd/q;

    .line 16
    .line 17
    invoke-virtual {p2, v2}, Lqd/j;->a(Lqd/q;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_3

    .line 22
    .line 23
    sget-object v2, Lqd/q;->q:Lqd/q;

    .line 24
    .line 25
    invoke-virtual {p2, v2}, Lqd/j;->a(Lqd/q;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    cmp-long p2, p0, v2

    .line 35
    .line 36
    if-nez p2, :cond_1

    .line 37
    .line 38
    sget-object p2, Lqd/j;->z:Lqd/h;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-gez v1, :cond_2

    .line 42
    .line 43
    sget-object p2, Lqd/j;->C:Lqd/h;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object p2, Lqd/j;->B:Lqd/h;

    .line 47
    .line 48
    :cond_3
    :goto_0
    invoke-direct {v0, p0, p1, p2}, Lqd/n;-><init>(JLqd/j;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

.method public static T(ILqd/j;Z)Lqd/r;
    .locals 1

    .line 1
    new-instance v0, Lqd/r;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lqd/r;-><init>(ILqd/j;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    sget-object p0, Lmd/a;->N:Lmd/a;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lmd/e;->w(Lmd/a;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public static U(Lgf/a;ILqd/j;)Lqd/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lgf/a;->i:[I

    .line 2
    .line 3
    aget p0, p0, p1

    .line 4
    .line 5
    new-instance p1, Lqd/r;

    .line 6
    .line 7
    invoke-direct {p1, p0, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public static Y(Lgf/a;ILqd/j;)Lqd/r;
    .locals 1

    .line 1
    invoke-virtual {p2}, Lqd/j;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lgf/a;->i:[I

    .line 8
    .line 9
    aget p0, p0, p1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-static {p0, p2, p1}, Lqd/l;->T(ILqd/j;Z)Lqd/r;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    iget-object p0, p0, Lgf/a;->i:[I

    .line 18
    .line 19
    aget p0, p0, p1

    .line 20
    .line 21
    new-instance p1, Lqd/r;

    .line 22
    .line 23
    invoke-direct {p1, p0, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static Z(Lud/p;)Lqd/m;
    .locals 4

    .line 1
    iget-object v0, p0, Lud/p;->l:Lqd/r;

    .line 2
    .line 3
    sget-object v1, Lmd/a;->S:Lmd/a;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lqd/m;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lqd/m;-><init>(Lud/p;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lud/p;->k:Lpd/k;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-eq v2, v3, :cond_1

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    const/4 v3, 0x6

    .line 28
    if-eq v2, v3, :cond_3

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lqd/r;->I()Lqd/j;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iput-object p0, v1, Lqd/l;->i:Lqd/j;

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    sget-object p0, Lqd/j;->l:Lqd/e;

    .line 40
    .line 41
    iput-object p0, v1, Lqd/l;->i:Lqd/j;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lqd/r;->W(Lqd/j;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    sget-object p0, Lqd/j;->m:Lqd/e;

    .line 50
    .line 51
    iput-object p0, v1, Lqd/l;->i:Lqd/j;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Lqd/r;->W(Lqd/j;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-object v1

    .line 59
    :cond_3
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string v0, "Don\'t wrap MOVE or CONST insns: "

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public static a0(Lud/p;)Lqd/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 2
    .line 3
    sget-object v1, Lpd/k;->g:Lpd/k;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    sget-object v1, Lpd/k;->m:Lpd/k;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    :goto_0
    sget-object v0, Lmd/a;->O:Lmd/a;

    .line 18
    .line 19
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lud/p;->l:Lqd/r;

    .line 28
    .line 29
    sget-object v1, Lmd/a;->S:Lmd/a;

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lqd/m;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lqd/m;-><init>(Lud/p;)V

    .line 37
    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Lqd/r;->I()Lqd/j;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iput-object p0, v1, Lqd/l;->i:Lqd/j;

    .line 46
    .line 47
    :cond_2
    return-object v1

    .line 48
    :cond_3
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, v0}, Lud/p;->S(I)Lqd/l;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Lmd/a;->s:Lmd/a;

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method


# virtual methods
.method public abstract H()Lqd/l;
.end method

.method public I()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/l;->i:Lqd/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Z
    .locals 4

    .line 1
    sget-object v0, Lmd/a;->J:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    instance-of v0, p0, Lqd/m;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    check-cast v0, Lqd/m;

    .line 19
    .line 20
    iget-object v0, v0, Lqd/m;->l:Lud/p;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v2, v0, Lud/p;->k:Lpd/k;

    .line 28
    .line 29
    sget-object v3, Lpd/k;->K:Lpd/k;

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lud/p;->S(I)Lqd/l;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lqd/l;->J()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0

    .line 42
    :cond_2
    return v1
.end method

.method public final K()Z
    .locals 1

    .line 1
    instance-of v0, p0, Lqd/n;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lqd/m;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Lqd/m;

    .line 11
    .line 12
    iget-object v0, v0, Lqd/m;->l:Lud/p;

    .line 13
    .line 14
    invoke-virtual {v0}, Lud/p;->W()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0

    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 24
    return v0
.end method

.method public final L()Z
    .locals 5

    .line 1
    instance-of v0, p0, Lqd/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lqd/n;

    .line 7
    .line 8
    iget-wide v1, v0, Lqd/n;->l:J

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lqd/l;->i:Lqd/j;

    .line 17
    .line 18
    sget-object v1, Lqd/j;->c:Lqd/g;

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public final M(Lqd/r;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p0, Lqd/r;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Lqd/r;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lqd/r;->h0(Lqd/l;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final N()Z
    .locals 2

    .line 1
    sget-object v0, Lmd/a;->J:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final O()Z
    .locals 5

    .line 1
    instance-of v0, p0, Lqd/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lqd/n;

    .line 7
    .line 8
    iget-wide v1, v0, Lqd/n;->l:J

    .line 9
    .line 10
    const-wide/16 v3, 0x1

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lqd/l;->i:Lqd/j;

    .line 17
    .line 18
    sget-object v1, Lqd/j;->c:Lqd/g;

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public P()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final Q()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lqd/l;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    instance-of v0, p0, Lqd/m;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p0

    .line 15
    check-cast v0, Lqd/m;

    .line 16
    .line 17
    iget-object v0, v0, Lqd/m;->l:Lud/p;

    .line 18
    .line 19
    iget-object v2, v0, Lud/p;->k:Lpd/k;

    .line 20
    .line 21
    sget-object v3, Lpd/k;->g:Lpd/k;

    .line 22
    .line 23
    if-ne v2, v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lud/p;->S(I)Lqd/l;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lqd/l;->R()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    :cond_1
    return v1
.end method

.method public R()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public V(Lud/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqd/l;->j:Lud/p;

    .line 2
    .line 3
    return-void
.end method

.method public W(Lqd/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqd/l;->i:Lqd/j;

    .line 2
    .line 3
    return-void
.end method

.method public abstract X()Ljava/lang/String;
.end method

.method public final b0(Lud/r;Lud/p;Z)Lqd/l;
    .locals 7

    .line 1
    iget-object v0, p0, Lqd/l;->j:Lud/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    if-ne v0, p2, :cond_1

    .line 8
    .line 9
    sget-object p1, Lqd/l;->k:Lmh/b;

    .line 10
    .line 11
    const-string p3, "Can\'t wrap instruction info itself: {}"

    .line 12
    .line 13
    invoke-interface {p1, p2, p3}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_1
    iget-object v2, v0, Lud/p;->m:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    move v4, v3

    .line 25
    :goto_0
    const/4 v5, -0x1

    .line 26
    if-ge v4, v2, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Lud/p;->S(I)Lqd/l;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    if-ne v6, p0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move v4, v5

    .line 39
    :goto_1
    if-ne v4, v5, :cond_4

    .line 40
    .line 41
    :goto_2
    return-object v1

    .line 42
    :cond_4
    iget-object v2, p2, Lud/p;->k:Lpd/k;

    .line 43
    .line 44
    sget-object v5, Lpd/k;->m:Lpd/k;

    .line 45
    .line 46
    if-ne v2, v5, :cond_6

    .line 47
    .line 48
    instance-of v2, p0, Lqd/r;

    .line 49
    .line 50
    if-eqz v2, :cond_6

    .line 51
    .line 52
    move-object v2, p0

    .line 53
    check-cast v2, Lqd/r;

    .line 54
    .line 55
    invoke-virtual {v2}, Lqd/r;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_6

    .line 60
    .line 61
    invoke-virtual {p2, v3}, Lud/p;->S(I)Lqd/l;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    instance-of v5, v3, Lqd/r;

    .line 69
    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    check-cast v3, Lqd/r;

    .line 73
    .line 74
    invoke-virtual {v3}, Lqd/r;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    if-nez v5, :cond_6

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Lqd/r;->p(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    instance-of v5, v3, Lqd/m;

    .line 85
    .line 86
    if-eqz v5, :cond_6

    .line 87
    .line 88
    check-cast v3, Lqd/m;

    .line 89
    .line 90
    iget-object v3, v3, Lqd/m;->l:Lud/p;

    .line 91
    .line 92
    iget-object v3, v3, Lud/p;->l:Lqd/r;

    .line 93
    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    invoke-virtual {v3}, Lqd/r;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    invoke-virtual {v3, v2}, Lqd/r;->p(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_6
    :goto_3
    invoke-static {p2}, Lqd/l;->a0(Lud/p;)Lqd/l;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v4}, Lud/p;->S(I)Lqd/l;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v2}, Lqd/l;->I()Lqd/j;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    sget-object v6, Lqd/j;->u:Lqd/h;

    .line 118
    .line 119
    if-ne v5, v6, :cond_7

    .line 120
    .line 121
    invoke-virtual {v3}, Lqd/l;->I()Lqd/j;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v2, v5}, Lqd/l;->W(Lqd/j;)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {v0, v4, v2}, Lud/p;->c0(ILqd/l;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1, v3}, Lxe/l;->i(Lud/r;Lqd/l;)V

    .line 132
    .line 133
    .line 134
    if-eqz p3, :cond_8

    .line 135
    .line 136
    invoke-static {p1, p0}, Lxe/l;->i(Lud/r;Lqd/l;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p2}, Lxe/l;->l(Lud/r;Lud/p;)V

    .line 140
    .line 141
    .line 142
    iput-object v1, p2, Lud/p;->l:Lqd/r;

    .line 143
    .line 144
    :cond_8
    return-object v2
.end method
