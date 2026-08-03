.class public final Li1/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li1/d;


# instance fields
.field public final b:Lf1/v;

.field public final c:Lh1/b;

.field public final d:Landroid/graphics/RenderNode;

.field public e:J

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Matrix;

.field public h:Z

.field public i:F

.field public j:I

.field public k:Lf1/n;

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:J

.field public r:J

.field public s:F

.field public t:F

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Lf1/n0;

.field public y:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, Lf1/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lf1/v;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lh1/b;

    .line 7
    .line 8
    invoke-direct {v1}, Lh1/b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Li1/g;->b:Lf1/v;

    .line 15
    .line 16
    iput-object v1, p0, Li1/g;->c:Lh1/b;

    .line 17
    .line 18
    invoke-static {}, Li1/f;->a()Landroid/graphics/RenderNode;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    iput-wide v1, p0, Li1/g;->e:J

    .line 27
    .line 28
    invoke-static {v0}, Li1/f;->y(Landroid/graphics/RenderNode;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {p0, v0, v1}, Li1/g;->Q(Landroid/graphics/RenderNode;I)V

    .line 33
    .line 34
    .line 35
    const/high16 v0, 0x3f800000    # 1.0f

    .line 36
    .line 37
    iput v0, p0, Li1/g;->i:F

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    iput v2, p0, Li1/g;->j:I

    .line 41
    .line 42
    iput v0, p0, Li1/g;->l:F

    .line 43
    .line 44
    iput v0, p0, Li1/g;->m:F

    .line 45
    .line 46
    sget-wide v2, Lf1/w;->b:J

    .line 47
    .line 48
    iput-wide v2, p0, Li1/g;->q:J

    .line 49
    .line 50
    iput-wide v2, p0, Li1/g;->r:J

    .line 51
    .line 52
    const/high16 v0, 0x41000000    # 8.0f

    .line 53
    .line 54
    iput v0, p0, Li1/g;->t:F

    .line 55
    .line 56
    iput v1, p0, Li1/g;->y:I

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {v0}, Li1/f;->n(Landroid/graphics/RenderNode;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final B()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public final C(J)V
    .locals 4

    .line 1
    const-wide v0, 0x7fffffff7fffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr v0, p1

    .line 7
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    iget-object v1, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Li1/f;->w(Landroid/graphics/RenderNode;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/16 v0, 0x20

    .line 23
    .line 24
    shr-long v2, p1, v0

    .line 25
    .line 26
    long-to-int v0, v2

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v1, v0}, Li1/f;->v(Landroid/graphics/RenderNode;F)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 35
    .line 36
    const-wide v1, 0xffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr p1, v1

    .line 42
    long-to-int p1, p1

    .line 43
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {v0, p1}, Li1/f;->x(Landroid/graphics/RenderNode;F)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final D()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li1/g;->q:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final E()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->o:F

    .line 2
    .line 3
    return v0
.end method

.method public final F()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li1/g;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final G()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->t:F

    .line 2
    .line 3
    return v0
.end method

.method public final H()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->n:F

    .line 2
    .line 3
    return v0
.end method

.method public final I()F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final J(I)V
    .locals 0

    .line 1
    iput p1, p0, Li1/g;->y:I

    .line 2
    .line 3
    invoke-virtual {p0}, Li1/g;->R()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K()Landroid/graphics/Matrix;
    .locals 2

    .line 1
    iget-object v0, p0, Li1/g;->g:Landroid/graphics/Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Li1/g;->g:Landroid/graphics/Matrix;

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 13
    .line 14
    invoke-static {v1, v0}, Li1/f;->j(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final L(Lf1/n0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Li1/g;->x:Lf1/n0;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lf1/n0;->f()Landroid/graphics/RenderEffect;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    invoke-static {v0, p1}, La1/c;->x(Landroid/graphics/RenderNode;Landroid/graphics/RenderEffect;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final M()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->p:F

    .line 2
    .line 3
    return v0
.end method

.method public final N(Lf1/u;)V
    .locals 1

    .line 1
    sget-object v0, Lf1/c;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    check-cast p1, Lf1/b;

    .line 4
    .line 5
    iget-object p1, p1, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 6
    .line 7
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lj2/b;->k(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final O()I
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final P()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Li1/g;->u:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v3, p0, Li1/g;->h:Z

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    move v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, Li1/g;->h:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_1
    iget-boolean v0, p0, Li1/g;->v:Z

    .line 22
    .line 23
    if-eq v3, v0, :cond_2

    .line 24
    .line 25
    iput-boolean v3, p0, Li1/g;->v:Z

    .line 26
    .line 27
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 28
    .line 29
    invoke-static {v0, v3}, Li1/f;->m(Landroid/graphics/RenderNode;Z)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-boolean v0, p0, Li1/g;->w:Z

    .line 33
    .line 34
    if-eq v1, v0, :cond_3

    .line 35
    .line 36
    iput-boolean v1, p0, Li1/g;->w:Z

    .line 37
    .line 38
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lf1/a;->n(Landroid/graphics/RenderNode;Z)V

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void
.end method

.method public final Q(Landroid/graphics/RenderNode;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Li1/g;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne p2, v1, :cond_0

    .line 5
    .line 6
    invoke-static {p1, v0}, Li1/f;->l(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Li1/f;->o(Landroid/graphics/RenderNode;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v1, 0x2

    .line 14
    if-ne p2, v1, :cond_1

    .line 15
    .line 16
    invoke-static {p1, v0}, Li1/f;->r(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Li1/f;->s(Landroid/graphics/RenderNode;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {p1, v0}, Li1/f;->r(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Li1/f;->o(Landroid/graphics/RenderNode;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final R()V
    .locals 4

    .line 1
    iget v0, p0, Li1/g;->y:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget v2, p0, Li1/g;->j:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-ne v2, v3, :cond_3

    .line 11
    .line 12
    iget-object v2, p0, Li1/g;->k:Lf1/n;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v2, p0, Li1/g;->x:Lf1/n0;

    .line 18
    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v1, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 23
    .line 24
    invoke-virtual {p0, v1, v0}, Li1/g;->Q(Landroid/graphics/RenderNode;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_3
    :goto_0
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Li1/g;->Q(Landroid/graphics/RenderNode;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final c(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->p:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Li1/f;->t(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d()Lf1/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Li1/g;->x:Lf1/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Landroid/graphics/Outline;J)V
    .locals 0

    .line 1
    iget-object p2, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {p2, p1}, Li1/f;->k(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, Li1/g;->h:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Li1/g;->P()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->s:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Li1/f;->C(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->o:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Li1/f;->D(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final h(I)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->j:I

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->f:Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Li1/g;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Lf1/c0;->s(I)Landroid/graphics/BlendMode;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lf1/a;->l(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Li1/g;->R()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final i(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->m:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lf1/a;->m(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {v0}, Li1/f;->f(Landroid/graphics/RenderNode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(Lf1/n;)V
    .locals 1

    .line 1
    iput-object p1, p0, Li1/g;->k:Lf1/n;

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->f:Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Li1/g;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p1, Lf1/n;->a:Landroid/graphics/ColorFilter;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Li1/g;->R()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {v0}, Li1/f;->u(Landroid/graphics/RenderNode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m(Lu2/c;Lu2/m;Li1/b;Lb1/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Li1/g;->c:Lh1/b;

    .line 2
    .line 3
    iget-object v1, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v1}, Lj2/b;->e(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :try_start_0
    iget-object v2, p0, Li1/g;->b:Lf1/v;

    .line 10
    .line 11
    iget-object v3, v2, Lf1/v;->a:Lf1/b;

    .line 12
    .line 13
    iget-object v4, v3, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 14
    .line 15
    iput-object v1, v3, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 16
    .line 17
    iget-object v1, v0, Lh1/b;->h:Lb5/c;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lb5/c;->R(Lu2/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p2}, Lb5/c;->S(Lu2/m;)V

    .line 23
    .line 24
    .line 25
    iput-object p3, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    iget-wide p1, p0, Li1/g;->e:J

    .line 28
    .line 29
    invoke-virtual {v1, p1, p2}, Lb5/c;->U(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v3}, Lb5/c;->P(Lf1/u;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p4, v0}, Lb1/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object p1, v2, Lf1/v;->a:Lf1/b;

    .line 39
    .line 40
    iput-object v4, p1, Lf1/b;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    iget-object p1, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 43
    .line 44
    invoke-static {p1}, Lj2/b;->m(Landroid/graphics/RenderNode;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    iget-object p2, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 50
    .line 51
    invoke-static {p2}, Lj2/b;->m(Landroid/graphics/RenderNode;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final n(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->i:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Li1/f;->g(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {v0}, Li1/f;->A(Landroid/graphics/RenderNode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p(J)V
    .locals 1

    .line 1
    iput-wide p1, p0, Li1/g;->q:J

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lf1/c0;->w(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {v0, p1}, Li1/f;->h(Landroid/graphics/RenderNode;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final q(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->l:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Li1/f;->p(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Li1/g;->u:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Li1/g;->P()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->n:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Li1/f;->B(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final t(J)V
    .locals 1

    .line 1
    iput-wide p1, p0, Li1/g;->r:J

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lf1/c0;->w(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {v0, p1}, Li1/f;->q(Landroid/graphics/RenderNode;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final u(F)V
    .locals 1

    .line 1
    iput p1, p0, Li1/g;->t:F

    .line 2
    .line 3
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v0, p1}, Li1/f;->z(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final v()F
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->m:F

    .line 2
    .line 3
    return v0
.end method

.method public final w()I
    .locals 1

    .line 1
    iget v0, p0, Li1/g;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final x()Lf1/n;
    .locals 1

    .line 1
    iget-object v0, p0, Li1/g;->k:Lf1/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y(IIJ)V
    .locals 4

    .line 1
    iget-object v0, p0, Li1/g;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    shr-long v1, p3, v1

    .line 6
    .line 7
    long-to-int v1, v1

    .line 8
    add-int/2addr v1, p1

    .line 9
    const-wide v2, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr v2, p3

    .line 15
    long-to-int v2, v2

    .line 16
    add-int/2addr v2, p2

    .line 17
    invoke-static {v0, p1, p2, v1, v2}, Li1/f;->i(Landroid/graphics/RenderNode;IIII)V

    .line 18
    .line 19
    .line 20
    invoke-static {p3, p4}, Lr9/e0;->q0(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    iput-wide p1, p0, Li1/g;->e:J

    .line 25
    .line 26
    return-void
.end method

.method public final z()F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
