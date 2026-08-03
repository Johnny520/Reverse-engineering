.class public LXq;
.super Landroid/graphics/drawable/Drawable;
.source ""

# interfaces
.implements Lcy;


# static fields
.field public static final E:Landroid/graphics/Paint;

.field public static final F:[LWq;


# instance fields
.field public final A:[LOy;

.field public B:[F

.field public C:[F

.field public D:Lrl;

.field public final a:LUq;

.field public b:LVq;

.field public final c:[LZx;

.field public final d:[LZx;

.field public final e:Ljava/util/BitSet;

.field public f:Z

.field public g:Z

.field public final h:Landroid/graphics/Matrix;

.field public final i:Landroid/graphics/Path;

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/RectF;

.field public final l:Landroid/graphics/RectF;

.field public final m:Landroid/graphics/Region;

.field public final n:Landroid/graphics/Region;

.field public final o:Landroid/graphics/Paint;

.field public final p:Landroid/graphics/Paint;

.field public final q:LOx;

.field public final r:LUq;

.field public final s:LSx;

.field public t:Landroid/graphics/PorterDuffColorFilter;

.field public u:Landroid/graphics/PorterDuffColorFilter;

.field public final v:Landroid/graphics/RectF;

.field public final w:Z

.field public x:Z

.field public y:LQx;

.field public z:LPy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, LXq;->E:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/4 v0, 0x4

    new-array v0, v0, [LWq;

    sput-object v0, LXq;->F:[LWq;

    const/4 v0, 0x0

    :goto_0
    sget-object v1, LXq;->F:[LWq;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    new-instance v2, LWq;

    invoke-direct {v2, v0}, LWq;-><init>(I)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LQx;

    invoke-direct {v0}, LQx;-><init>()V

    invoke-direct {p0, v0}, LXq;-><init>(LQx;)V

    return-void
.end method

.method public constructor <init>(LQx;)V
    .locals 1

    .line 3
    new-instance v0, LVq;

    invoke-direct {v0, p1}, LVq;-><init>(LQx;)V

    invoke-direct {p0, v0}, LXq;-><init>(LVq;)V

    return-void
.end method

.method public constructor <init>(LVq;)V
    .locals 6

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 5
    new-instance v0, LUq;

    invoke-direct {v0, p0}, LUq;-><init>(LXq;)V

    iput-object v0, p0, LXq;->a:LUq;

    const/4 v0, 0x4

    .line 6
    new-array v1, v0, [LZx;

    iput-object v1, p0, LXq;->c:[LZx;

    .line 7
    new-array v1, v0, [LZx;

    iput-object v1, p0, LXq;->d:[LZx;

    .line 8
    new-instance v1, Ljava/util/BitSet;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    iput-object v1, p0, LXq;->e:Ljava/util/BitSet;

    .line 9
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, LXq;->h:Landroid/graphics/Matrix;

    .line 10
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LXq;->i:Landroid/graphics/Path;

    .line 11
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LXq;->j:Landroid/graphics/Path;

    .line 12
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, LXq;->k:Landroid/graphics/RectF;

    .line 13
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, LXq;->l:Landroid/graphics/RectF;

    .line 14
    new-instance v1, Landroid/graphics/Region;

    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    iput-object v1, p0, LXq;->m:Landroid/graphics/Region;

    .line 15
    new-instance v1, Landroid/graphics/Region;

    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    iput-object v1, p0, LXq;->n:Landroid/graphics/Region;

    .line 16
    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, LXq;->o:Landroid/graphics/Paint;

    .line 17
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, p0, LXq;->p:Landroid/graphics/Paint;

    .line 18
    new-instance v4, LOx;

    invoke-direct {v4}, LOx;-><init>()V

    iput-object v4, p0, LXq;->q:LOx;

    .line 19
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    if-ne v4, v5, :cond_0

    .line 20
    sget-object v4, LRx;->a:LSx;

    goto :goto_0

    .line 21
    :cond_0
    new-instance v4, LSx;

    invoke-direct {v4}, LSx;-><init>()V

    :goto_0
    iput-object v4, p0, LXq;->s:LSx;

    .line 22
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, LXq;->v:Landroid/graphics/RectF;

    .line 23
    iput-boolean v2, p0, LXq;->w:Z

    .line 24
    iput-boolean v2, p0, LXq;->x:Z

    .line 25
    new-array v0, v0, [LOy;

    iput-object v0, p0, LXq;->A:[LOy;

    .line 26
    iput-object p1, p0, LXq;->b:LVq;

    .line 27
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    invoke-virtual {p0}, LXq;->r()Z

    .line 30
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LXq;->p([I)Z

    .line 31
    new-instance p1, LUq;

    invoke-direct {p1, p0}, LUq;-><init>(LXq;)V

    iput-object p1, p0, LXq;->r:LUq;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 2
    invoke-static {p1, p2, p3, p4}, LQx;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)LPx;

    move-result-object p1

    invoke-virtual {p1}, LPx;->a()LQx;

    move-result-object p1

    invoke-direct {p0, p1}, LXq;-><init>(LQx;)V

    return-void
.end method

.method public static b(Landroid/graphics/RectF;LQx;[F)F
    .locals 3

    if-nez p2, :cond_0

    invoke-virtual {p1, p0}, LQx;->e(Landroid/graphics/RectF;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p1, LQx;->e:LXb;

    invoke-interface {p1, p0}, LXb;->a(Landroid/graphics/RectF;)F

    move-result p0

    return p0

    :cond_0
    array-length p0, p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-gt p0, v1, :cond_1

    goto :goto_1

    :cond_1
    aget p0, p2, v0

    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_3

    aget v2, p2, v1

    cmpl-float v2, v2, p0

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {p1}, LQx;->d()Z

    move-result p0

    if-eqz p0, :cond_4

    aget p0, p2, v0

    return p0

    :cond_4
    :goto_2
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 8

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v2, v0, LVq;->a:LQx;

    iget-object v3, p0, LXq;->B:[F

    iget v4, v0, LVq;->j:F

    iget-object v6, p0, LXq;->r:LUq;

    iget-object v1, p0, LXq;->s:LSx;

    move-object v5, p1

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, LSx;->a(LQx;[FFLandroid/graphics/RectF;LUq;Landroid/graphics/Path;)V

    iget-object p1, p0, LXq;->b:LVq;

    iget p1, p1, LVq;->i:F

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p1, p1, p2

    if-eqz p1, :cond_0

    iget-object p1, p0, LXq;->h:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    iget-object p2, p0, LXq;->b:LVq;

    iget p2, p2, LVq;->i:F

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v1

    invoke-virtual {p1, p2, p2, v0, v2}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {v7, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    :cond_0
    iget-object p1, p0, LXq;->v:Landroid/graphics/RectF;

    const/4 p2, 0x1

    invoke-virtual {v7, p1, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    return-void
.end method

.method public final c(I)I
    .locals 6

    iget-object v0, p0, LXq;->b:LVq;

    iget v1, v0, LVq;->n:F

    const/4 v2, 0x0

    add-float/2addr v1, v2

    iget v3, v0, LVq;->m:F

    add-float/2addr v1, v3

    iget-object v0, v0, LVq;->c:Ljf;

    if-eqz v0, :cond_3

    iget-boolean v3, v0, Ljf;->a:Z

    if-eqz v3, :cond_3

    const/16 v3, 0xff

    invoke-static {p1, v3}, Lza;->e(II)I

    move-result v4

    iget v5, v0, Ljf;->d:I

    if-ne v4, v5, :cond_3

    iget v4, v0, Ljf;->e:F

    cmpg-float v5, v4, v2

    if-lez v5, :cond_1

    cmpg-float v5, v1, v2

    if-gtz v5, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr v1, v4

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->log1p(D)D

    move-result-wide v4

    double-to-float v1, v4

    const/high16 v4, 0x40900000    # 4.5f

    mul-float/2addr v1, v4

    const/high16 v4, 0x40000000    # 2.0f

    add-float/2addr v1, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v1, v4

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v2

    :goto_1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    invoke-static {p1, v3}, Lza;->e(II)I

    move-result p1

    iget v3, v0, Ljf;->b:I

    invoke-static {p1, v3, v1}, LGu;->v(IIF)I

    move-result p1

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    iget v0, v0, Ljf;->c:I

    if-eqz v0, :cond_2

    sget v1, Ljf;->f:I

    invoke-static {v0, v1}, Lza;->e(II)I

    move-result v0

    invoke-static {v0, p1}, Lza;->c(II)I

    move-result p1

    :cond_2
    invoke-static {p1, v4}, Lza;->e(II)I

    move-result p1

    :cond_3
    return p1
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 8

    iget-object v0, p0, LXq;->e:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    iget-object v0, p0, LXq;->b:LVq;

    iget v0, v0, LVq;->p:I

    iget-object v1, p0, LXq;->i:Landroid/graphics/Path;

    iget-object v2, p0, LXq;->q:LOx;

    if-eqz v0, :cond_0

    iget-object v0, v2, LOx;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    const/4 v4, 0x4

    if-ge v3, v4, :cond_1

    iget-object v4, p0, LXq;->c:[LZx;

    aget-object v4, v4, v3

    iget-object v5, p0, LXq;->b:LVq;

    iget v5, v5, LVq;->o:I

    sget-object v6, LZx;->b:Landroid/graphics/Matrix;

    invoke-virtual {v4, v6, v2, v5, p1}, LZx;->a(Landroid/graphics/Matrix;LOx;ILandroid/graphics/Canvas;)V

    iget-object v4, p0, LXq;->d:[LZx;

    aget-object v4, v4, v3

    iget-object v5, p0, LXq;->b:LVq;

    iget v5, v5, LVq;->o:I

    invoke-virtual {v4, v6, v2, v5, p1}, LZx;->a(Landroid/graphics/Matrix;LOx;ILandroid/graphics/Canvas;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, LXq;->w:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, LXq;->b:LVq;

    iget v2, v2, LVq;->p:I

    int-to-double v2, v2

    int-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    double-to-int v0, v6

    iget-object v2, p0, LXq;->b:LVq;

    iget v2, v2, LVq;->p:I

    int-to-double v2, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v4, v2

    double-to-int v2, v4

    neg-int v3, v0

    int-to-float v3, v3

    neg-int v4, v2

    int-to-float v4, v4

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    sget-object v3, LXq;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    int-to-float v0, v0

    int-to-float v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_2
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LXq;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v3, v0, LXq;->o:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getAlpha()I

    move-result v7

    iget-object v2, v0, LXq;->b:LVq;

    iget v2, v2, LVq;->l:I

    ushr-int/lit8 v4, v2, 0x7

    add-int/2addr v2, v4

    mul-int/2addr v2, v7

    ushr-int/lit8 v2, v2, 0x8

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v2, v0, LXq;->u:Landroid/graphics/PorterDuffColorFilter;

    iget-object v8, v0, LXq;->p:Landroid/graphics/Paint;

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v2, v0, LXq;->b:LVq;

    iget v2, v2, LVq;->k:F

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    move-result v9

    iget-object v2, v0, LXq;->b:LVq;

    iget v2, v2, LVq;->l:I

    ushr-int/lit8 v4, v2, 0x7

    add-int/2addr v2, v4

    mul-int/2addr v2, v9

    ushr-int/lit8 v2, v2, 0x8

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v2, v0, LXq;->b:LVq;

    iget-object v2, v2, LVq;->q:Landroid/graphics/Paint$Style;

    sget-object v4, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eq v2, v4, :cond_1

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v3

    goto/16 :goto_5

    :cond_1
    :goto_0
    iget-boolean v2, v0, LXq;->f:Z

    move v4, v2

    move-object v2, v3

    iget-object v3, v0, LXq;->i:Landroid/graphics/Path;

    if-eqz v4, :cond_2

    invoke-virtual {v0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, LXq;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iput-boolean v11, v0, LXq;->f:Z

    :cond_2
    iget-object v4, v0, LXq;->b:LVq;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v4, LVq;->o:I

    if-lez v5, :cond_9

    iget-object v4, v4, LVq;->a:LQx;

    invoke-virtual {v0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v5

    invoke-virtual {v4, v5}, LQx;->e(Landroid/graphics/RectF;)Z

    move-result v4

    if-nez v4, :cond_9

    iget-object v4, v0, LXq;->B:[F

    if-eqz v4, :cond_6

    array-length v5, v4

    const/4 v6, 0x1

    if-gt v5, v6, :cond_3

    goto :goto_2

    :cond_3
    aget v5, v4, v11

    :goto_1
    array-length v12, v4

    if-ge v6, v12, :cond_5

    aget v12, v4, v6

    cmpl-float v12, v12, v5

    if-eqz v12, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    iget-object v4, v0, LXq;->b:LVq;

    iget-object v4, v4, LVq;->a:LQx;

    invoke-virtual {v4}, LQx;->d()Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_3
    invoke-virtual {v3}, Landroid/graphics/Path;->isConvex()Z

    move-result v4

    if-nez v4, :cond_9

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-ge v4, v5, :cond_9

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    iget-object v4, v0, LXq;->b:LVq;

    iget v4, v4, LVq;->p:I

    int-to-double v4, v4

    int-to-double v12, v11

    invoke-static {v12, v13}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    mul-double/2addr v14, v4

    double-to-int v4, v14

    iget-object v5, v0, LXq;->b:LVq;

    iget v5, v5, LVq;->p:I

    int-to-double v5, v5

    invoke-static {v12, v13}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    mul-double/2addr v12, v5

    double-to-int v5, v12

    int-to-float v4, v4

    int-to-float v5, v5

    invoke-virtual {v1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-boolean v4, v0, LXq;->w:Z

    if-nez v4, :cond_7

    invoke-virtual/range {p0 .. p1}, LXq;->d(Landroid/graphics/Canvas;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_4

    :cond_7
    iget-object v4, v0, LXq;->v:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v6

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v12

    invoke-virtual {v12}, Landroid/graphics/Rect;->height()I

    move-result v12

    int-to-float v12, v12

    sub-float/2addr v6, v12

    float-to-int v6, v6

    if-ltz v5, :cond_8

    if-ltz v6, :cond_8

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v12

    float-to-int v12, v12

    iget-object v13, v0, LXq;->b:LVq;

    iget v13, v13, LVq;->o:I

    mul-int/lit8 v13, v13, 0x2

    add-int/2addr v13, v12

    add-int/2addr v13, v5

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    float-to-int v4, v4

    iget-object v12, v0, LXq;->b:LVq;

    iget v12, v12, LVq;->o:I

    mul-int/lit8 v12, v12, 0x2

    add-int/2addr v12, v4

    add-int/2addr v12, v6

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v13, v12, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    new-instance v12, Landroid/graphics/Canvas;

    invoke-direct {v12, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v13

    iget v13, v13, Landroid/graphics/Rect;->left:I

    iget-object v14, v0, LXq;->b:LVq;

    iget v14, v14, LVq;->o:I

    sub-int/2addr v13, v14

    sub-int/2addr v13, v5

    int-to-float v5, v13

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v13

    iget v13, v13, Landroid/graphics/Rect;->top:I

    iget-object v14, v0, LXq;->b:LVq;

    iget v14, v14, LVq;->o:I

    sub-int/2addr v13, v14

    sub-int/2addr v13, v6

    int-to-float v6, v13

    neg-float v13, v5

    neg-float v14, v6

    invoke-virtual {v12, v13, v14}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v0, v12}, LXq;->d(Landroid/graphics/Canvas;)V

    invoke-virtual {v1, v4, v5, v6, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_4

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid shadow bounds. Check that the treatments result in a valid path."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_4
    iget-object v4, v0, LXq;->b:LVq;

    iget-object v4, v4, LVq;->a:LQx;

    iget-object v5, v0, LXq;->B:[F

    invoke-virtual {v0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, LXq;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LQx;[FLandroid/graphics/RectF;)V

    :goto_5
    invoke-virtual {v0}, LXq;->j()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-boolean v1, v0, LXq;->g:Z

    if-eqz v1, :cond_d

    iget-object v1, v0, LXq;->b:LVq;

    iget-object v1, v1, LVq;->a:LQx;

    invoke-virtual {v1}, LQx;->f()LPx;

    move-result-object v3

    iget-object v4, v1, LQx;->e:LXb;

    iget-object v5, v0, LXq;->a:LUq;

    invoke-virtual {v5, v4}, LUq;->a(LXb;)LXb;

    move-result-object v4

    iput-object v4, v3, LPx;->e:LXb;

    iget-object v4, v1, LQx;->f:LXb;

    invoke-virtual {v5, v4}, LUq;->a(LXb;)LXb;

    move-result-object v4

    iput-object v4, v3, LPx;->f:LXb;

    iget-object v4, v1, LQx;->h:LXb;

    invoke-virtual {v5, v4}, LUq;->a(LXb;)LXb;

    move-result-object v4

    iput-object v4, v3, LPx;->h:LXb;

    iget-object v1, v1, LQx;->g:LXb;

    invoke-virtual {v5, v1}, LUq;->a(LXb;)LXb;

    move-result-object v1

    iput-object v1, v3, LPx;->g:LXb;

    invoke-virtual {v3}, LPx;->a()LQx;

    move-result-object v1

    iput-object v1, v0, LXq;->y:LQx;

    iget-object v1, v0, LXq;->B:[F

    if-nez v1, :cond_a

    iput-object v10, v0, LXq;->C:[F

    goto :goto_7

    :cond_a
    iget-object v3, v0, LXq;->C:[F

    if-nez v3, :cond_b

    array-length v1, v1

    new-array v1, v1, [F

    iput-object v1, v0, LXq;->C:[F

    :cond_b
    invoke-virtual {v0}, LXq;->i()F

    move-result v1

    move v3, v11

    :goto_6
    iget-object v4, v0, LXq;->B:[F

    array-length v5, v4

    if-ge v3, v5, :cond_c

    iget-object v5, v0, LXq;->C:[F

    aget v4, v4, v3

    sub-float/2addr v4, v1

    const/4 v6, 0x0

    invoke-static {v6, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    aput v4, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_c
    :goto_7
    iget-object v13, v0, LXq;->y:LQx;

    iget-object v14, v0, LXq;->C:[F

    iget-object v1, v0, LXq;->b:LVq;

    iget v15, v1, LVq;->j:F

    invoke-virtual {v0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v1

    iget-object v3, v0, LXq;->l:Landroid/graphics/RectF;

    invoke-virtual {v3, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual {v0}, LXq;->i()F

    move-result v1

    invoke-virtual {v3, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    const/16 v17, 0x0

    iget-object v1, v0, LXq;->j:Landroid/graphics/Path;

    iget-object v12, v0, LXq;->s:LSx;

    move-object/from16 v18, v1

    move-object/from16 v16, v3

    invoke-virtual/range {v12 .. v18}, LSx;->a(LQx;[FFLandroid/graphics/RectF;LUq;Landroid/graphics/Path;)V

    iput-boolean v11, v0, LXq;->g:Z

    :cond_d
    invoke-virtual/range {p0 .. p1}, LXq;->f(Landroid/graphics/Canvas;)V

    :cond_e
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LQx;[FLandroid/graphics/RectF;)V
    .locals 0

    invoke-static {p6, p4, p5}, LXq;->b(Landroid/graphics/RectF;LQx;[F)F

    move-result p4

    const/4 p5, 0x0

    cmpl-float p5, p4, p5

    if-ltz p5, :cond_0

    iget-object p3, p0, LXq;->b:LVq;

    iget p3, p3, LVq;->j:F

    mul-float/2addr p4, p3

    invoke-virtual {p1, p6, p4, p4, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void

    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v4, p0, LXq;->y:LQx;

    iget-object v5, p0, LXq;->C:[F

    invoke-virtual {p0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v6, p0, LXq;->l:Landroid/graphics/RectF;

    invoke-virtual {v6, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, LXq;->i()F

    move-result v0

    invoke-virtual {v6, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v2, p0, LXq;->p:Landroid/graphics/Paint;

    iget-object v3, p0, LXq;->j:Landroid/graphics/Path;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, LXq;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LQx;[FLandroid/graphics/RectF;)V

    return-void
.end method

.method public final g()Landroid/graphics/RectF;
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, LXq;->k:Landroid/graphics/RectF;

    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    return-object v1
.end method

.method public getAlpha()I
    .locals 1

    iget-object v0, p0, LXq;->b:LVq;

    iget v0, v0, LVq;->l:I

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, LXq;->b:LVq;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 3

    iget-object v0, p0, LXq;->b:LVq;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LXq;->b:LVq;

    iget-object v1, v1, LVq;->a:LQx;

    iget-object v2, p0, LXq;->B:[F

    invoke-static {v0, v1, v2}, LXq;->b(Landroid/graphics/RectF;LQx;[F)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v2, p0, LXq;->b:LVq;

    iget v2, v2, LVq;->j:F

    mul-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    return-void

    :cond_1
    iget-boolean v1, p0, LXq;->f:Z

    iget-object v2, p0, LXq;->i:Landroid/graphics/Path;

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0, v2}, LXq;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LXq;->f:Z

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    invoke-static {p1, v2}, LBe;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void

    :cond_3
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_4

    :try_start_0
    invoke-static {p1, v2}, LAe;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :cond_4
    invoke-virtual {v2}, Landroid/graphics/Path;->isConvex()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1, v2}, LAe;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->h:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, LXq;->m:Landroid/graphics/Region;

    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    invoke-virtual {p0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v2, p0, LXq;->i:Landroid/graphics/Path;

    invoke-virtual {p0, v0, v2}, LXq;->a(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iget-object v0, p0, LXq;->n:Landroid/graphics/Region;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v1
.end method

.method public final h()F
    .locals 5

    iget-object v0, p0, LXq;->B:[F

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    const/4 v2, 0x3

    aget v2, v0, v2

    const/4 v3, 0x2

    aget v3, v0, v3

    add-float/2addr v2, v3

    const/4 v3, 0x1

    aget v3, v0, v3

    sub-float/2addr v2, v3

    const/4 v3, 0x0

    aget v0, v0, v3

    sub-float/2addr v2, v0

    div-float/2addr v2, v1

    return v2

    :cond_0
    invoke-virtual {p0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v2, p0, LXq;->b:LVq;

    iget-object v2, v2, LVq;->a:LQx;

    iget-object v3, p0, LXq;->s:LSx;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, LQx;->e:LXb;

    invoke-interface {v2, v0}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v2

    iget-object v4, p0, LXq;->b:LVq;

    iget-object v4, v4, LVq;->a:LQx;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v4, LQx;->h:LXb;

    invoke-interface {v4, v0}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v4

    add-float/2addr v4, v2

    iget-object v2, p0, LXq;->b:LVq;

    iget-object v2, v2, LVq;->a:LQx;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, LQx;->g:LXb;

    invoke-interface {v2, v0}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v2

    sub-float/2addr v4, v2

    iget-object v2, p0, LXq;->b:LVq;

    iget-object v2, v2, LVq;->a:LQx;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, LQx;->f:LXb;

    invoke-interface {v2, v0}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v0

    sub-float/2addr v4, v0

    div-float/2addr v4, v1

    return v4
.end method

.method public final i()F
    .locals 2

    invoke-virtual {p0}, LXq;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LXq;->p:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final invalidateSelf()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LXq;->f:Z

    iput-boolean v0, p0, LXq;->g:Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public isStateful()Z
    .locals 1

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->f:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    iget-object v0, p0, LXq;->b:LVq;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->e:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_1
    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->d:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->b:Lcz;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcz;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    return v0

    :cond_4
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final j()Z
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->q:Landroid/graphics/Paint$Style;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-eq v0, v1, :cond_0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, LXq;->p:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final k(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    new-instance v1, Ljf;

    invoke-direct {v1, p1}, Ljf;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, LVq;->c:Ljf;

    invoke-virtual {p0}, LXq;->s()V

    return-void
.end method

.method public final l(LPy;)V
    .locals 8

    iget-object v0, p0, LXq;->z:LPy;

    if-eq v0, p1, :cond_4

    iput-object p1, p0, LXq;->z:LPy;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LXq;->A:[LOy;

    array-length v3, v2

    if-ge v1, v3, :cond_3

    aget-object v3, v2, v1

    if-nez v3, :cond_0

    new-instance v3, LOy;

    sget-object v4, LXq;->F:[LWq;

    aget-object v4, v4, v1

    invoke-direct {v3, p0, v4}, LOy;-><init>(Lcy;LPj;)V

    aput-object v3, v2, v1

    :cond_0
    aget-object v2, v2, v1

    new-instance v3, LPy;

    invoke-direct {v3}, LPy;-><init>()V

    iget-wide v4, p1, LPy;->b:D

    double-to-float v4, v4

    const/4 v5, 0x0

    cmpg-float v6, v4, v5

    if-ltz v6, :cond_2

    float-to-double v6, v4

    iput-wide v6, v3, LPy;->b:D

    iput-boolean v0, v3, LPy;->c:Z

    iget-wide v6, p1, LPy;->a:D

    mul-double/2addr v6, v6

    double-to-float v4, v6

    cmpg-float v5, v4, v5

    if-lez v5, :cond_1

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    iput-wide v4, v3, LPy;->a:D

    iput-boolean v0, v3, LPy;->c:Z

    iput-object v3, v2, LOy;->j:LPy;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Spring stiffness constant must be positive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Damping ratio must be non-negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LXq;->q([IZ)V

    invoke-virtual {p0}, LXq;->invalidateSelf()V

    :cond_4
    return-void
.end method

.method public final m(F)V
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    iget v1, v0, LVq;->n:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, LVq;->n:F

    invoke-virtual {p0}, LXq;->s()V

    :cond_0
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, LVq;

    iget-object v1, p0, LXq;->b:LVq;

    invoke-direct {v0, v1}, LVq;-><init>(LVq;)V

    iput-object v0, p0, LXq;->b:LVq;

    return-object p0
.end method

.method public final n(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v1, v0, LVq;->d:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, LVq;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LXq;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public final o(Lcz;)V
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v1, v0, LVq;->b:Lcz;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, LVq;->b:Lcz;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LXq;->q([IZ)V

    invoke-virtual {p0}, LXq;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LXq;->f:Z

    iput-boolean v0, p0, LXq;->g:Z

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->b:Lcz;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    iget-boolean v1, p0, LXq;->x:Z

    invoke-virtual {p0, v0, v1}, LXq;->q([IZ)V

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    iput-boolean p1, p0, LXq;->x:Z

    return-void
.end method

.method public onStateChange([I)Z
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->b:Lcz;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v1}, LXq;->q([IZ)V

    :cond_0
    invoke-virtual {p0, p1}, LXq;->p([I)Z

    move-result p1

    invoke-virtual {p0}, LXq;->r()Z

    move-result v0

    if-nez p1, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0}, LXq;->invalidateSelf()V

    :cond_3
    return v1
.end method

.method public final p([I)Z
    .locals 5

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v0, v0, LVq;->d:Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LXq;->o:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    iget-object v3, p0, LXq;->b:LVq;

    iget-object v3, v3, LVq;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, LXq;->b:LVq;

    iget-object v2, v2, LVq;->e:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_1

    iget-object v2, p0, LXq;->p:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    move-result v3

    iget-object v4, p0, LXq;->b:LVq;

    iget-object v4, v4, LVq;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {v4, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    if-eq v3, p1, :cond_1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    return v1

    :cond_1
    return v0
.end method

.method public final q([IZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0}, LXq;->g()Landroid/graphics/RectF;

    move-result-object v2

    iget-object v3, v0, LXq;->b:LVq;

    iget-object v3, v3, LVq;->b:Lcz;

    if-eqz v3, :cond_13

    invoke-virtual {v2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v3, v0, LXq;->z:LPy;

    const/4 v5, 0x1

    if-nez v3, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    or-int v3, p2, v3

    iget-object v6, v0, LXq;->B:[F

    const/4 v7, 0x4

    if-nez v6, :cond_2

    new-array v6, v7, [F

    iput-object v6, v0, LXq;->B:[F

    :cond_2
    iget-object v6, v0, LXq;->b:LVq;

    iget-object v6, v6, LVq;->b:Lcz;

    iget-object v8, v6, Lcz;->d:[LQx;

    iget v9, v6, Lcz;->a:I

    iget-object v10, v6, Lcz;->c:[[I

    iget-object v11, v6, Lcz;->h:Laz;

    iget-object v12, v6, Lcz;->g:Laz;

    iget-object v13, v6, Lcz;->f:Laz;

    iget-object v6, v6, Lcz;->e:Laz;

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v9, :cond_4

    aget-object v4, v10, v14

    invoke-static {v4, v1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_4
    const/4 v14, -0x1

    :goto_2
    if-gez v14, :cond_7

    sget-object v4, Landroid/util/StateSet;->WILD_CARD:[I

    const/4 v14, 0x0

    :goto_3
    if-ge v14, v9, :cond_6

    aget-object v15, v10, v14

    invoke-static {v15, v4}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v15

    if-eqz v15, :cond_5

    move v15, v14

    goto :goto_4

    :cond_5
    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_6
    const/4 v15, -0x1

    :goto_4
    move v14, v15

    :cond_7
    if-nez v6, :cond_8

    if-nez v13, :cond_8

    if-nez v12, :cond_8

    if-nez v11, :cond_8

    aget-object v1, v8, v14

    goto :goto_5

    :cond_8
    aget-object v4, v8, v14

    invoke-virtual {v4}, LQx;->f()LPx;

    move-result-object v4

    if-eqz v6, :cond_9

    invoke-virtual {v6, v1}, Laz;->c([I)LXb;

    move-result-object v6

    iput-object v6, v4, LPx;->e:LXb;

    :cond_9
    if-eqz v13, :cond_a

    invoke-virtual {v13, v1}, Laz;->c([I)LXb;

    move-result-object v6

    iput-object v6, v4, LPx;->f:LXb;

    :cond_a
    if-eqz v12, :cond_b

    invoke-virtual {v12, v1}, Laz;->c([I)LXb;

    move-result-object v6

    iput-object v6, v4, LPx;->h:LXb;

    :cond_b
    if-eqz v11, :cond_c

    invoke-virtual {v11, v1}, Laz;->c([I)LXb;

    move-result-object v1

    iput-object v1, v4, LPx;->g:LXb;

    :cond_c
    invoke-virtual {v4}, LPx;->a()LQx;

    move-result-object v1

    :goto_5
    const/4 v4, 0x0

    :goto_6
    if-ge v4, v7, :cond_12

    iget-object v6, v0, LXq;->s:LSx;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v4, v5, :cond_f

    const/4 v6, 0x2

    if-eq v4, v6, :cond_e

    const/4 v6, 0x3

    if-eq v4, v6, :cond_d

    iget-object v6, v1, LQx;->f:LXb;

    goto :goto_7

    :cond_d
    iget-object v6, v1, LQx;->e:LXb;

    goto :goto_7

    :cond_e
    iget-object v6, v1, LQx;->h:LXb;

    goto :goto_7

    :cond_f
    iget-object v6, v1, LQx;->g:LXb;

    :goto_7
    invoke-interface {v6, v2}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v6

    if-eqz v3, :cond_10

    iget-object v8, v0, LXq;->B:[F

    aput v6, v8, v4

    :cond_10
    iget-object v8, v0, LXq;->A:[LOy;

    aget-object v9, v8, v4

    if-eqz v9, :cond_11

    invoke-virtual {v9, v6}, LOy;->a(F)V

    if-eqz v3, :cond_11

    aget-object v6, v8, v4

    invoke-virtual {v6}, LOy;->d()V

    :cond_11
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_12
    if-eqz v3, :cond_13

    invoke-virtual {v0}, LXq;->invalidateSelf()V

    :cond_13
    :goto_8
    return-void
.end method

.method public final r()Z
    .locals 7

    iget-object v0, p0, LXq;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v1, p0, LXq;->u:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, LXq;->b:LVq;

    iget-object v3, v2, LVq;->f:Landroid/content/res/ColorStateList;

    iget-object v2, v2, LVq;->g:Landroid/graphics/PorterDuff$Mode;

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    invoke-virtual {p0, v3}, LXq;->c(I)I

    move-result v3

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v5, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v2, p0, LXq;->o:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    invoke-virtual {p0, v2}, LXq;->c(I)I

    move-result v3

    if-eq v3, v2, :cond_2

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    iput-object v5, p0, LXq;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, LXq;->b:LVq;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    iput-object v2, p0, LXq;->u:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, LXq;->b:LVq;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, LXq;->t:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LXq;->u:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    return v0

    :cond_4
    :goto_2
    return v4
.end method

.method public final s()V
    .locals 4

    iget-object v0, p0, LXq;->b:LVq;

    iget v1, v0, LVq;->n:F

    const/4 v2, 0x0

    add-float/2addr v1, v2

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float/2addr v2, v1

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, v0, LVq;->o:I

    iget-object v0, p0, LXq;->b:LVq;

    const/high16 v2, 0x3e800000    # 0.25f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, v0, LVq;->p:I

    invoke-virtual {p0}, LXq;->r()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setAlpha(I)V
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    iget v1, v0, LVq;->l:I

    if-eq v1, p1, :cond_0

    iput p1, v0, LVq;->l:I

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    iget-object p1, p0, LXq;->b:LVq;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setShapeAppearanceModel(LQx;)V
    .locals 1

    iget-object v0, p0, LXq;->b:LVq;

    iput-object p1, v0, LVq;->a:LQx;

    const/4 p1, 0x0

    iput-object p1, v0, LVq;->b:Lcz;

    iput-object p1, p0, LXq;->B:[F

    iput-object p1, p0, LXq;->C:[F

    invoke-virtual {p0}, LXq;->invalidateSelf()V

    return-void
.end method

.method public final setTint(I)V
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, LXq;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LXq;->b:LVq;

    iput-object p1, v0, LVq;->f:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, LXq;->r()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, LXq;->b:LVq;

    iget-object v1, v0, LVq;->g:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, LVq;->g:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, LXq;->r()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method
