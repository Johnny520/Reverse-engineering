.class public final Lf1/o0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf1/d0;


# instance fields
.field public A:Lf1/c0;

.field public g:I

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:J

.field public o:J

.field public p:F

.field public q:F

.field public r:J

.field public s:Lf1/r0;

.field public t:Z

.field public u:I

.field public v:J

.field public w:Lu2/c;

.field public x:Lu2/m;

.field public y:Lf1/n;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lf1/o0;->h:F

    .line 7
    .line 8
    iput v0, p0, Lf1/o0;->i:F

    .line 9
    .line 10
    iput v0, p0, Lf1/o0;->j:F

    .line 11
    .line 12
    sget-wide v0, Lf1/e0;->a:J

    .line 13
    .line 14
    iput-wide v0, p0, Lf1/o0;->n:J

    .line 15
    .line 16
    iput-wide v0, p0, Lf1/o0;->o:J

    .line 17
    .line 18
    const/high16 v0, 0x41000000    # 8.0f

    .line 19
    .line 20
    iput v0, p0, Lf1/o0;->q:F

    .line 21
    .line 22
    sget-wide v0, Lf1/u0;->b:J

    .line 23
    .line 24
    iput-wide v0, p0, Lf1/o0;->r:J

    .line 25
    .line 26
    sget-object v0, Lf1/c0;->b:Lf1/m0;

    .line 27
    .line 28
    iput-object v0, p0, Lf1/o0;->s:Lf1/r0;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Lf1/o0;->u:I

    .line 32
    .line 33
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, Lf1/o0;->v:J

    .line 39
    .line 40
    invoke-static {}, Lfb/v0;->a()Lu2/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lf1/o0;->w:Lu2/c;

    .line 45
    .line 46
    sget-object v0, Lu2/m;->g:Lu2/m;

    .line 47
    .line 48
    iput-object v0, p0, Lf1/o0;->x:Lu2/m;

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    iput v0, p0, Lf1/o0;->z:I

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final H0(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lf1/o0;->r:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lf1/u0;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lf1/o0;->g:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x1000

    .line 12
    .line 13
    iput v0, p0, Lf1/o0;->g:I

    .line 14
    .line 15
    iput-wide p1, p0, Lf1/o0;->r:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final I()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Q0(Lf1/r0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/o0;->s:Lf1/r0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lf1/o0;->g:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x2000

    .line 12
    .line 13
    iput v0, p0, Lf1/o0;->g:I

    .line 14
    .line 15
    iput-object p1, p0, Lf1/o0;->s:Lf1/r0;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final Y(I)V
    .locals 2

    .line 1
    iget v0, p0, Lf1/o0;->u:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 7
    .line 8
    const v1, 0x8000

    .line 9
    .line 10
    .line 11
    or-int/2addr v0, v1

    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->u:I

    .line 15
    .line 16
    return-void
.end method

.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lf1/o0;->v:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public final c(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->m:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->m:F

    .line 15
    .line 16
    return-void
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/o0;->w:Lu2/c;

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
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf1/o0;->q(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lf1/o0;->i(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lf1/o0;->n(F)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lf1/o0;->s(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lf1/o0;->g(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lf1/o0;->c(F)V

    .line 20
    .line 21
    .line 22
    sget-wide v1, Lf1/e0;->a:J

    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Lf1/o0;->p(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Lf1/o0;->t(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lf1/o0;->f(F)V

    .line 31
    .line 32
    .line 33
    const/high16 v0, 0x41000000    # 8.0f

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lf1/o0;->u(F)V

    .line 36
    .line 37
    .line 38
    sget-wide v0, Lf1/u0;->b:J

    .line 39
    .line 40
    invoke-virtual {p0, v0, v1}, Lf1/o0;->H0(J)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lf1/c0;->b:Lf1/m0;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lf1/o0;->Q0(Lf1/r0;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, v0}, Lf1/o0;->r(Z)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {p0, v1}, Lf1/o0;->k(Lf1/n;)V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    invoke-virtual {p0, v2}, Lf1/o0;->h(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lf1/o0;->Y(I)V

    .line 61
    .line 62
    .line 63
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    iput-wide v2, p0, Lf1/o0;->v:J

    .line 69
    .line 70
    iput-object v1, p0, Lf1/o0;->A:Lf1/c0;

    .line 71
    .line 72
    iput v0, p0, Lf1/o0;->g:I

    .line 73
    .line 74
    return-void
.end method

.method public final f(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->p:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x400

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->p:F

    .line 15
    .line 16
    return-void
.end method

.method public final g(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->l:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x10

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->l:F

    .line 15
    .line 16
    return-void
.end method

.method public final h(I)V
    .locals 2

    .line 1
    iget v0, p0, Lf1/o0;->z:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 7
    .line 8
    const/high16 v1, 0x80000

    .line 9
    .line 10
    or-int/2addr v0, v1

    .line 11
    iput v0, p0, Lf1/o0;->g:I

    .line 12
    .line 13
    iput p1, p0, Lf1/o0;->z:I

    .line 14
    .line 15
    return-void
.end method

.method public final i(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->i:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->i:F

    .line 15
    .line 16
    return-void
.end method

.method public final k(Lf1/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/o0;->y:Lf1/n;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lf1/o0;->g:I

    .line 10
    .line 11
    const/high16 v1, 0x40000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Lf1/o0;->g:I

    .line 15
    .line 16
    iput-object p1, p0, Lf1/o0;->y:Lf1/n;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final l()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->j:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->j:F

    .line 15
    .line 16
    return-void
.end method

.method public final o()V
    .locals 0

    .line 1
    return-void
.end method

.method public final p(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lf1/o0;->n:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lf1/w;->c(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lf1/o0;->g:I

    .line 10
    .line 11
    or-int/lit8 v0, v0, 0x40

    .line 12
    .line 13
    iput v0, p0, Lf1/o0;->g:I

    .line 14
    .line 15
    iput-wide p1, p0, Lf1/o0;->n:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final q(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->h:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->h:F

    .line 15
    .line 16
    return-void
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/o0;->w:Lu2/c;

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

.method public final r(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf1/o0;->t:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lf1/o0;->g:I

    .line 6
    .line 7
    or-int/lit16 v0, v0, 0x4000

    .line 8
    .line 9
    iput v0, p0, Lf1/o0;->g:I

    .line 10
    .line 11
    iput-boolean p1, p0, Lf1/o0;->t:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final s(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->k:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->k:F

    .line 15
    .line 16
    return-void
.end method

.method public final t(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lf1/o0;->o:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lf1/w;->c(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lf1/o0;->g:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    iput v0, p0, Lf1/o0;->g:I

    .line 14
    .line 15
    iput-wide p1, p0, Lf1/o0;->o:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final u(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->q:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lf1/o0;->g:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x800

    .line 11
    .line 12
    iput v0, p0, Lf1/o0;->g:I

    .line 13
    .line 14
    iput p1, p0, Lf1/o0;->q:F

    .line 15
    .line 16
    return-void
.end method

.method public final v()F
    .locals 1

    .line 1
    iget v0, p0, Lf1/o0;->i:F

    .line 2
    .line 3
    return v0
.end method
