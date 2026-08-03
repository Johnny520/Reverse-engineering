.class public final Lm/t1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm/q1;
.implements Lu2/c;


# instance fields
.field public final synthetic g:Lu2/c;

.field public h:Z

.field public i:Z

.field public final j:Lyg/b;


# direct methods
.method public constructor <init>(Lu2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/t1;->g:Lu2/c;

    .line 5
    .line 6
    new-instance p1, Lyg/b;

    .line 7
    .line 8
    invoke-direct {p1}, Lyg/b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lm/t1;->j:Lyg/b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final G0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->G0(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final J(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->J(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final K(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->K(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final L0(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->L0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final O0(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->O0(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final S(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->S(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final T(Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lm/s1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lm/s1;

    .line 7
    .line 8
    iget v1, v0, Lm/s1;->i:I

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
    iput v1, v0, Lm/s1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/s1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lm/s1;-><init>(Lm/t1;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lm/s1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/s1;->i:I

    .line 28
    .line 29
    iget-object v2, p0, Lm/t1;->j:Lyg/b;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-boolean p1, p0, Lm/t1;->h:Z

    .line 51
    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    iget-boolean p1, p0, Lm/t1;->i:Z

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    iput v3, v0, Lm/s1;->i:I

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Lyg/b;->d(Lyf/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 65
    .line 66
    if-ne p1, v0, :cond_3

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 70
    invoke-virtual {v2, p1}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget-boolean p1, p0, Lm/t1;->h:Z

    .line 74
    .line 75
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu2/c;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm/t1;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lm/t1;->j:Lyg/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lyg/b;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final e0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->e0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final i0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->i0(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final j(Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lm/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lm/r1;

    .line 7
    .line 8
    iget v1, v0, Lm/r1;->i:I

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
    iput v1, v0, Lm/r1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/r1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lm/r1;-><init>(Lm/t1;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lm/r1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/r1;->i:I

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
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return-object p1

    .line 45
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput v2, v0, Lm/r1;->i:I

    .line 49
    .line 50
    iget-object p1, p0, Lm/t1;->j:Lyg/b;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lyg/b;->d(Lyf/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 57
    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 62
    iput-boolean p1, p0, Lm/t1;->h:Z

    .line 63
    .line 64
    iput-boolean p1, p0, Lm/t1;->i:Z

    .line 65
    .line 66
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 67
    .line 68
    return-object p1
.end method

.method public final l0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->l0(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu2/c;->q0()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final x0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/t1;->g:Lu2/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->x0(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
