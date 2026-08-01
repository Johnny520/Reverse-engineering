.class public final Le91;
.super Lnh0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final o:Lnh0;

.field public final p:Z

.field public final q:Z

.field public r:Lsw;

.field public s:Lsw;

.field public final t:J


# direct methods
.method public constructor <init>(Lnh0;Lsw;Lsw;ZZ)V
    .locals 7

    .line 1
    sget-object v0, Lt21;->a:Lsx0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lnh0;->y()Lsw;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lt21;->j:Lqx;

    .line 12
    .line 13
    iget-object v0, v0, Lnh0;->e:Lsw;

    .line 14
    .line 15
    :cond_1
    invoke-static {p2, v0, p4}, Lt21;->k(Lsw;Lsw;Z)Lsw;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lnh0;->i()Lsw;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-nez p2, :cond_3

    .line 26
    .line 27
    :cond_2
    sget-object p2, Lt21;->j:Lqx;

    .line 28
    .line 29
    iget-object p2, p2, Lnh0;->f:Lsw;

    .line 30
    .line 31
    :cond_3
    invoke-static {p3, p2}, Lt21;->l(Lsw;Lsw;)Lsw;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    sget-object v4, Lq21;->h:Lq21;

    .line 38
    .line 39
    move-object v1, p0

    .line 40
    invoke-direct/range {v1 .. v6}, Lnh0;-><init>(JLq21;Lsw;Lsw;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v1, Le91;->o:Lnh0;

    .line 44
    .line 45
    iput-boolean p4, v1, Le91;->p:Z

    .line 46
    .line 47
    iput-boolean p5, v1, Le91;->q:Z

    .line 48
    .line 49
    iget-object p0, v1, Lnh0;->e:Lsw;

    .line 50
    .line 51
    iput-object p0, v1, Le91;->r:Lsw;

    .line 52
    .line 53
    iget-object p0, v1, Lnh0;->f:Lsw;

    .line 54
    .line 55
    iput-object p0, v1, Le91;->s:Lsw;

    .line 56
    .line 57
    invoke-static {}, Lu50;->g()J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    iput-wide p0, v1, Le91;->t:J

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final B(Lkh0;)V
    .locals 0

    .line 1
    invoke-static {}, Lw60;->N()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final C(Lsw;Lsw;)Lnh0;
    .locals 8

    .line 1
    iget-object v0, p0, Le91;->r:Lsw;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lt21;->k(Lsw;Lsw;Z)Lsw;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    iget-object p1, p0, Le91;->s:Lsw;

    .line 9
    .line 10
    invoke-static {p2, p1}, Lt21;->l(Lsw;Lsw;)Lsw;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-boolean p1, p0, Le91;->p:Z

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1, v5}, Lnh0;->C(Lsw;Lsw;)Lnh0;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v2, Le91;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    invoke-direct/range {v2 .. v7}, Le91;-><init>(Lnh0;Lsw;Lsw;ZZ)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_0
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v4, v5}, Lnh0;->C(Lsw;Lsw;)Lnh0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final D()Lnh0;
    .locals 0

    .line 1
    iget-object p0, p0, Le91;->o:Lnh0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lt21;->j:Lqx;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll21;->c:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Le91;->q:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Le91;->o:Lnh0;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lnh0;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final d()Lq21;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ll21;->d()Lq21;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final e()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Le91;->r:Lsw;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnh0;->f()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final g()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ll21;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final h()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnh0;->h()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Le91;->s:Lsw;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()V
    .locals 0

    .line 1
    invoke-static {}, Lw60;->N()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final l()V
    .locals 0

    .line 1
    invoke-static {}, Lw60;->N()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final m()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnh0;->m()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(Ld41;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnh0;->n(Ld41;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(Lq21;)V
    .locals 0

    .line 1
    invoke-static {}, Lw60;->N()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final s(J)V
    .locals 0

    .line 1
    invoke-static {}, Lw60;->N()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final t(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lnh0;->t(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(Lsw;)Ll21;
    .locals 2

    .line 1
    iget-object v0, p0, Le91;->r:Lsw;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lt21;->k(Lsw;Lsw;Z)Lsw;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-boolean v0, p0, Le91;->p:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lnh0;->u(Lsw;)Ll21;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p1, v1}, Lt21;->g(Ll21;Lsw;Z)Ll21;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Lnh0;->u(Lsw;)Ll21;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final w()Lv50;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnh0;->w()Lv50;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final x()Lkh0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le91;->D()Lnh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnh0;->x()Lkh0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final y()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Le91;->r:Lsw;

    .line 2
    .line 3
    return-object p0
.end method
