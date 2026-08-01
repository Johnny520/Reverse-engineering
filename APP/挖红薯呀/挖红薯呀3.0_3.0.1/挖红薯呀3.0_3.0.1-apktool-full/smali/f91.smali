.class public final Lf91;
.super Ll21;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final e:Ll21;

.field public final f:Z

.field public final g:Z

.field public h:Lsw;

.field public final i:J


# direct methods
.method public constructor <init>(Ll21;Lsw;ZZ)V
    .locals 3

    .line 1
    sget-object v0, Lt21;->a:Lsx0;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    sget-object v2, Lq21;->h:Lq21;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2}, Ll21;-><init>(JLq21;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lf91;->e:Ll21;

    .line 11
    .line 12
    iput-boolean p3, p0, Lf91;->f:Z

    .line 13
    .line 14
    iput-boolean p4, p0, Lf91;->g:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ll21;->e()Lsw;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    :cond_0
    sget-object p1, Lt21;->j:Lqx;

    .line 25
    .line 26
    iget-object p1, p1, Lnh0;->e:Lsw;

    .line 27
    .line 28
    :cond_1
    invoke-static {p2, p1, p3}, Lt21;->k(Lsw;Lsw;Z)Lsw;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lf91;->h:Lsw;

    .line 33
    .line 34
    invoke-static {}, Lu50;->g()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    iput-wide p1, p0, Lf91;->i:J

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll21;->c:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lf91;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lf91;->e:Ll21;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ll21;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final d()Lq21;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lf91;->v()Ll21;

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
    iget-object p0, p0, Lf91;->h:Lsw;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lf91;->v()Ll21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ll21;->f()Z

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
    invoke-virtual {p0}, Lf91;->v()Ll21;

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

.method public final i()Lsw;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
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
    invoke-virtual {p0}, Lf91;->v()Ll21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ll21;->m()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(Ld41;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lf91;->v()Ll21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ll21;->n(Ld41;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(Lsw;)Ll21;
    .locals 2

    .line 1
    iget-object v0, p0, Lf91;->h:Lsw;

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
    iget-boolean v0, p0, Lf91;->f:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lf91;->v()Ll21;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Ll21;->u(Lsw;)Ll21;

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
    invoke-virtual {p0}, Lf91;->v()Ll21;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Ll21;->u(Lsw;)Ll21;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final v()Ll21;
    .locals 0

    .line 1
    iget-object p0, p0, Lf91;->e:Ll21;

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
