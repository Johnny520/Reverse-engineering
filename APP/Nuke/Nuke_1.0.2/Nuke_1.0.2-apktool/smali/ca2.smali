.class public final Lca2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Le70;


# instance fields
.field public A:Lte;

.field public h:I

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:J

.field public o:J

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:J

.field public u:Leq2;

.field public v:Z

.field public w:J

.field public x:Le70;

.field public y:Ld61;

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
    iput v0, p0, Lca2;->i:F

    .line 7
    .line 8
    iput v0, p0, Lca2;->j:F

    .line 9
    .line 10
    iput v0, p0, Lca2;->k:F

    .line 11
    .line 12
    sget-wide v0, Ltq0;->a:J

    .line 13
    .line 14
    iput-wide v0, p0, Lca2;->n:J

    .line 15
    .line 16
    iput-wide v0, p0, Lca2;->o:J

    .line 17
    .line 18
    const/high16 v0, 0x41000000    # 8.0f

    .line 19
    .line 20
    iput v0, p0, Lca2;->s:F

    .line 21
    .line 22
    sget-wide v0, Lm33;->b:J

    .line 23
    .line 24
    iput-wide v0, p0, Lca2;->t:J

    .line 25
    .line 26
    sget-object v0, Lsp0;->h:Liu0;

    .line 27
    .line 28
    iput-object v0, p0, Lca2;->u:Leq2;

    .line 29
    .line 30
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide v0, p0, Lca2;->w:J

    .line 36
    .line 37
    invoke-static {}, Lup0;->a()Lh70;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lca2;->x:Le70;

    .line 42
    .line 43
    sget-object v0, Ld61;->h:Ld61;

    .line 44
    .line 45
    iput-object v0, p0, Lca2;->y:Ld61;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    iput v0, p0, Lca2;->z:I

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lca2;->k(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lca2;->l(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lca2;->c(F)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lca2;->s(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lca2;->n(F)V

    .line 17
    .line 18
    .line 19
    sget-wide v1, Ltq0;->a:J

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Lca2;->e(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Lca2;->q(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lca2;->h(F)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lca2;->i(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lca2;->j(F)V

    .line 34
    .line 35
    .line 36
    const/high16 v0, 0x41000000    # 8.0f

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lca2;->f(F)V

    .line 39
    .line 40
    .line 41
    sget-wide v0, Lm33;->b:J

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Lca2;->r(J)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lsp0;->h:Liu0;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lca2;->p(Leq2;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-virtual {p0, v0}, Lca2;->g(Z)V

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lca2;->z:I

    .line 56
    .line 57
    const/4 v2, 0x3

    .line 58
    if-ne v1, v2, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget v1, p0, Lca2;->h:I

    .line 62
    .line 63
    const/high16 v3, 0x80000

    .line 64
    .line 65
    or-int/2addr v1, v3

    .line 66
    iput v1, p0, Lca2;->h:I

    .line 67
    .line 68
    iput v2, p0, Lca2;->z:I

    .line 69
    .line 70
    :goto_0
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    iput-wide v1, p0, Lca2;->w:J

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    iput-object v1, p0, Lca2;->A:Lte;

    .line 79
    .line 80
    iput v0, p0, Lca2;->h:I

    .line 81
    .line 82
    return-void
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lca2;->x:Le70;

    .line 2
    .line 3
    invoke-interface {p0}, Le70;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->k:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->k:F

    .line 15
    .line 16
    return-void
.end method

.method public final e(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lca2;->n:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lju;->c(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lca2;->h:I

    .line 10
    .line 11
    or-int/lit8 v0, v0, 0x40

    .line 12
    .line 13
    iput v0, p0, Lca2;->h:I

    .line 14
    .line 15
    iput-wide p1, p0, Lca2;->n:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final f(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->s:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x800

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->s:F

    .line 15
    .line 16
    return-void
.end method

.method public final g(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lca2;->v:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lca2;->h:I

    .line 6
    .line 7
    or-int/lit16 v0, v0, 0x4000

    .line 8
    .line 9
    iput v0, p0, Lca2;->h:I

    .line 10
    .line 11
    iput-boolean p1, p0, Lca2;->v:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final h(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->p:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x100

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->p:F

    .line 15
    .line 16
    return-void
.end method

.method public final i(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->q:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x200

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->q:F

    .line 15
    .line 16
    return-void
.end method

.method public final j(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->r:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit16 v0, v0, 0x400

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->r:F

    .line 15
    .line 16
    return-void
.end method

.method public final k(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->i:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->i:F

    .line 15
    .line 16
    return-void
.end method

.method public final l(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->j:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->j:F

    .line 15
    .line 16
    return-void
.end method

.method public final m()F
    .locals 0

    .line 1
    iget-object p0, p0, Lca2;->x:Le70;

    .line 2
    .line 3
    invoke-interface {p0}, Le70;->m()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final n(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->m:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->m:F

    .line 15
    .line 16
    return-void
.end method

.method public final p(Leq2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lca2;->u:Leq2;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lca2;->h:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x2000

    .line 12
    .line 13
    iput v0, p0, Lca2;->h:I

    .line 14
    .line 15
    iput-object p1, p0, Lca2;->u:Leq2;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final q(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lca2;->o:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lju;->c(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lca2;->h:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    iput v0, p0, Lca2;->h:I

    .line 14
    .line 15
    iput-wide p1, p0, Lca2;->o:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final r(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lca2;->t:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lm33;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lca2;->h:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x1000

    .line 12
    .line 13
    iput v0, p0, Lca2;->h:I

    .line 14
    .line 15
    iput-wide p1, p0, Lca2;->t:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final s(F)V
    .locals 1

    .line 1
    iget v0, p0, Lca2;->l:F

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
    iget v0, p0, Lca2;->h:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x10

    .line 11
    .line 12
    iput v0, p0, Lca2;->h:I

    .line 13
    .line 14
    iput p1, p0, Lca2;->l:F

    .line 15
    .line 16
    return-void
.end method
