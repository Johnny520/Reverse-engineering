.class public final Lb43;
.super Lvr2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final e:Lvr2;

.field public final f:Z

.field public final g:Z

.field public h:Lin0;

.field public final i:J


# direct methods
.method public constructor <init>(Lvr2;Lin0;ZZ)V
    .locals 3

    .line 1
    sget-object v0, Lds2;->a:Lml2;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    sget-object v2, Lbs2;->l:Lbs2;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2}, Lvr2;-><init>(JLbs2;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lb43;->e:Lvr2;

    .line 11
    .line 12
    iput-boolean p3, p0, Lb43;->f:Z

    .line 13
    .line 14
    iput-boolean p4, p0, Lb43;->g:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lvr2;->e()Lin0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    :cond_0
    sget-object p1, Lds2;->j:Lhq0;

    .line 25
    .line 26
    iget-object p1, p1, Lwk1;->e:Lin0;

    .line 27
    .line 28
    :cond_1
    invoke-static {p2, p1, p3}, Lds2;->k(Lin0;Lin0;Z)Lin0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lb43;->h:Lin0;

    .line 33
    .line 34
    invoke-static {}, Lv93;->b()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    iput-wide p1, p0, Lb43;->i:J

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
    iput-boolean v0, p0, Lvr2;->c:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lb43;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lb43;->e:Lvr2;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lvr2;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final d()Lbs2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lb43;->v()Lvr2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lvr2;->d()Lbs2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final e()Lin0;
    .locals 0

    .line 1
    iget-object p0, p0, Lb43;->h:Lin0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lb43;->v()Lvr2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lvr2;->f()Z

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
    invoke-virtual {p0}, Lb43;->v()Lvr2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lvr2;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final i()Lin0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final k()V
    .locals 0

    .line 1
    invoke-static {}, Lp40;->b0()V

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
    invoke-static {}, Lp40;->b0()V

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
    invoke-virtual {p0}, Lb43;->v()Lvr2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lvr2;->m()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(Lpu2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lb43;->v()Lvr2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lvr2;->n(Lpu2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(Lin0;)Lvr2;
    .locals 2

    .line 1
    iget-object v0, p0, Lb43;->h:Lin0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lds2;->k(Lin0;Lin0;Z)Lin0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-boolean v0, p0, Lb43;->f:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lb43;->v()Lvr2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lvr2;->u(Lin0;)Lvr2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p1, v1}, Lds2;->g(Lvr2;Lin0;Z)Lvr2;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lb43;->v()Lvr2;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Lvr2;->u(Lin0;)Lvr2;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final v()Lvr2;
    .locals 0

    .line 1
    iget-object p0, p0, Lb43;->e:Lvr2;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lds2;->j:Lhq0;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method
