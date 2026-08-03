.class public La/Ta;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements La/Zd;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Ta$b;
    }
.end annotation


# static fields
.field public static final x:Landroid/graphics/Paint;


# instance fields
.field public a:La/Ta$b;

.field public final b:[La/Yd$f;

.field public final c:[La/Yd$f;

.field public final d:Ljava/util/BitSet;

.field public e:Z

.field public final f:Landroid/graphics/Matrix;

.field public final g:Landroid/graphics/Path;

.field public final h:Landroid/graphics/Path;

.field public final i:Landroid/graphics/RectF;

.field public final j:Landroid/graphics/RectF;

.field public final k:Landroid/graphics/Region;

.field public final l:Landroid/graphics/Region;

.field public m:La/Vd;

.field public final n:Landroid/graphics/Paint;

.field public final o:Landroid/graphics/Paint;

.field public final p:La/Ud;

.field public final q:La/Ta$a;

.field public final r:La/Wd;

.field public s:Landroid/graphics/PorterDuffColorFilter;

.field public t:Landroid/graphics/PorterDuffColorFilter;

.field public u:I

.field public final v:Landroid/graphics/RectF;

.field public final w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, La/Ta;->x:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, La/Vd;

    invoke-direct {v0}, La/Vd;-><init>()V

    invoke-direct {p0, v0}, La/Ta;-><init>(La/Vd;)V

    return-void
.end method

.method public constructor <init>(La/Ta$b;)V
    .locals 5

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [La/Yd$f;

    iput-object v1, p0, La/Ta;->b:[La/Yd$f;

    .line 6
    new-array v0, v0, [La/Yd$f;

    iput-object v0, p0, La/Ta;->c:[La/Yd$f;

    .line 7
    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, La/Ta;->d:Ljava/util/BitSet;

    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, La/Ta;->f:Landroid/graphics/Matrix;

    .line 9
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, La/Ta;->g:Landroid/graphics/Path;

    .line 10
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, La/Ta;->h:Landroid/graphics/Path;

    .line 11
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, La/Ta;->i:Landroid/graphics/RectF;

    .line 12
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, La/Ta;->j:Landroid/graphics/RectF;

    .line 13
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, La/Ta;->k:Landroid/graphics/Region;

    .line 14
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, La/Ta;->l:Landroid/graphics/Region;

    .line 15
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, La/Ta;->n:Landroid/graphics/Paint;

    .line 16
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, La/Ta;->o:Landroid/graphics/Paint;

    .line 17
    new-instance v3, La/Ud;

    invoke-direct {v3}, La/Ud;-><init>()V

    iput-object v3, p0, La/Ta;->p:La/Ud;

    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v3, v4, :cond_0

    .line 19
    sget-object v3, La/Wd$a;->a:La/Wd;

    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, La/Wd;

    invoke-direct {v3}, La/Wd;-><init>()V

    :goto_0
    iput-object v3, p0, La/Ta;->r:La/Wd;

    .line 21
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, La/Ta;->v:Landroid/graphics/RectF;

    .line 22
    iput-boolean v1, p0, La/Ta;->w:Z

    .line 23
    iput-object p1, p0, La/Ta;->a:La/Ta$b;

    .line 24
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    invoke-virtual {p0}, La/Ta;->m()Z

    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, La/Ta;->l([I)Z

    .line 28
    new-instance p1, La/Ta$a;

    invoke-direct {p1, p0}, La/Ta$a;-><init>(La/Ta;)V

    iput-object p1, p0, La/Ta;->q:La/Ta$a;

    return-void
.end method

.method public constructor <init>(La/Vd;)V
    .locals 1

    .line 3
    new-instance v0, La/Ta$b;

    invoke-direct {v0, p1}, La/Ta$b;-><init>(La/Vd;)V

    invoke-direct {p0, v0}, La/Ta;-><init>(La/Ta$b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 2
    invoke-static {p1, p2, p3, p4}, La/Vd;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)La/Vd$a;

    move-result-object p1

    invoke-virtual {p1}, La/Vd$a;->a()La/Vd;

    move-result-object p1

    invoke-direct {p0, p1}, La/Ta;-><init>(La/Vd;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 7

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v2, v0, La/Ta$b;->a:La/Vd;

    iget v3, v0, La/Ta$b;->i:F

    iget-object v5, p0, La/Ta;->q:La/Ta$a;

    iget-object v1, p0, La/Ta;->r:La/Wd;

    move-object v4, p1

    move-object v6, p2

    invoke-virtual/range {v1 .. v6}, La/Wd;->a(La/Vd;FLandroid/graphics/RectF;La/Ta$a;Landroid/graphics/Path;)V

    iget-object p1, p0, La/Ta;->a:La/Ta$b;

    iget p1, p1, La/Ta$b;->h:F

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p1, p1, p2

    if-eqz p1, :cond_0

    iget-object p1, p0, La/Ta;->f:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    iget-object p2, p0, La/Ta;->a:La/Ta$b;

    iget p2, p2, La/Ta$b;->h:F

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v1

    invoke-virtual {p1, p2, p2, v0, v2}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {v6, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    :cond_0
    iget-object p1, p0, La/Ta;->v:Landroid/graphics/RectF;

    const/4 p2, 0x1

    invoke-virtual {v6, p1, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    return-void
.end method

.method public final c(I)I
    .locals 6

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget v1, v0, La/Ta$b;->m:F

    const/4 v2, 0x0

    add-float/2addr v1, v2

    iget v3, v0, La/Ta$b;->l:F

    add-float/2addr v1, v3

    iget-object v0, v0, La/Ta$b;->b:La/J5;

    if-eqz v0, :cond_3

    iget-boolean v3, v0, La/J5;->a:Z

    if-eqz v3, :cond_3

    const/16 v3, 0xff

    invoke-static {p1, v3}, La/v3;->d(II)I

    move-result v4

    iget v5, v0, La/J5;->d:I

    if-ne v4, v5, :cond_3

    iget v4, v0, La/J5;->e:F

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

    invoke-static {p1, v3}, La/v3;->d(II)I

    move-result p1

    iget v3, v0, La/J5;->b:I

    invoke-static {p1, v3, v1}, La/Na;->d(IIF)I

    move-result p1

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    iget v0, v0, La/J5;->c:I

    if-eqz v0, :cond_2

    sget v1, La/J5;->f:I

    invoke-static {v0, v1}, La/v3;->d(II)I

    move-result v0

    invoke-static {v0, p1}, La/v3;->b(II)I

    move-result p1

    :cond_2
    invoke-static {p1, v4}, La/v3;->d(II)I

    move-result p1

    :cond_3
    return p1
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 8

    iget-object v0, p0, La/Ta;->d:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Ta"

    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget v0, v0, La/Ta$b;->o:I

    iget-object v1, p0, La/Ta;->g:Landroid/graphics/Path;

    iget-object v2, p0, La/Ta;->p:La/Ud;

    if-eqz v0, :cond_1

    iget-object v0, v2, La/Ud;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_1
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    const/4 v4, 0x4

    if-ge v3, v4, :cond_2

    iget-object v4, p0, La/Ta;->b:[La/Yd$f;

    aget-object v4, v4, v3

    iget-object v5, p0, La/Ta;->a:La/Ta$b;

    iget v5, v5, La/Ta$b;->n:I

    sget-object v6, La/Yd$f;->b:Landroid/graphics/Matrix;

    invoke-virtual {v4, v6, v2, v5, p1}, La/Yd$f;->a(Landroid/graphics/Matrix;La/Ud;ILandroid/graphics/Canvas;)V

    iget-object v4, p0, La/Ta;->c:[La/Yd$f;

    aget-object v4, v4, v3

    iget-object v5, p0, La/Ta;->a:La/Ta$b;

    iget v5, v5, La/Ta$b;->n:I

    invoke-virtual {v4, v6, v2, v5, p1}, La/Yd$f;->a(Landroid/graphics/Matrix;La/Ud;ILandroid/graphics/Canvas;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-boolean v2, p0, La/Ta;->w:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, La/Ta;->a:La/Ta$b;

    iget v2, v2, La/Ta$b;->o:I

    int-to-double v2, v2

    int-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    double-to-int v0, v6

    iget-object v2, p0, La/Ta;->a:La/Ta$b;

    iget v2, v2, La/Ta$b;->o:I

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

    sget-object v3, La/Ta;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    int-to-float v0, v0

    int-to-float v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_3
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, La/Ta;->n:Landroid/graphics/Paint;

    iget-object v3, v0, La/Ta;->s:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getAlpha()I

    move-result v6

    iget-object v3, v0, La/Ta;->a:La/Ta$b;

    iget v3, v3, La/Ta$b;->k:I

    ushr-int/lit8 v4, v3, 0x7

    add-int/2addr v3, v4

    mul-int/2addr v3, v6

    ushr-int/lit8 v3, v3, 0x8

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v7, v0, La/Ta;->o:Landroid/graphics/Paint;

    iget-object v3, v0, La/Ta;->t:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v3, v0, La/Ta;->a:La/Ta$b;

    iget v3, v3, La/Ta$b;->j:F

    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v7}, Landroid/graphics/Paint;->getAlpha()I

    move-result v8

    iget-object v3, v0, La/Ta;->a:La/Ta$b;

    iget v3, v3, La/Ta$b;->k:I

    ushr-int/lit8 v4, v3, 0x7

    add-int/2addr v3, v4

    mul-int/2addr v3, v8

    ushr-int/lit8 v3, v3, 0x8

    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-boolean v3, v0, La/Ta;->e:Z

    move v4, v3

    iget-object v3, v0, La/Ta;->g:Landroid/graphics/Path;

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    invoke-virtual {v0}, La/Ta;->h()Z

    move-result v4

    const/4 v9, 0x0

    const/high16 v10, 0x40000000    # 2.0f

    if-eqz v4, :cond_0

    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v4

    div-float/2addr v4, v10

    goto :goto_0

    :cond_0
    move v4, v9

    :goto_0
    neg-float v4, v4

    iget-object v11, v0, La/Ta;->a:La/Ta$b;

    iget-object v11, v11, La/Ta$b;->a:La/Vd;

    invoke-virtual {v11}, La/Vd;->e()La/Vd$a;

    move-result-object v12

    iget-object v13, v11, La/Vd;->e:La/w4;

    instance-of v14, v13, La/Xc;

    if-eqz v14, :cond_1

    goto :goto_1

    :cond_1
    new-instance v14, La/n0;

    invoke-direct {v14, v4, v13}, La/n0;-><init>(FLa/w4;)V

    move-object v13, v14

    :goto_1
    iput-object v13, v12, La/Vd$a;->e:La/w4;

    iget-object v13, v11, La/Vd;->f:La/w4;

    instance-of v14, v13, La/Xc;

    if-eqz v14, :cond_2

    goto :goto_2

    :cond_2
    new-instance v14, La/n0;

    invoke-direct {v14, v4, v13}, La/n0;-><init>(FLa/w4;)V

    move-object v13, v14

    :goto_2
    iput-object v13, v12, La/Vd$a;->f:La/w4;

    iget-object v13, v11, La/Vd;->h:La/w4;

    instance-of v14, v13, La/Xc;

    if-eqz v14, :cond_3

    goto :goto_3

    :cond_3
    new-instance v14, La/n0;

    invoke-direct {v14, v4, v13}, La/n0;-><init>(FLa/w4;)V

    move-object v13, v14

    :goto_3
    iput-object v13, v12, La/Vd$a;->h:La/w4;

    iget-object v11, v11, La/Vd;->g:La/w4;

    instance-of v13, v11, La/Xc;

    if-eqz v13, :cond_4

    goto :goto_4

    :cond_4
    new-instance v13, La/n0;

    invoke-direct {v13, v4, v11}, La/n0;-><init>(FLa/w4;)V

    move-object v11, v13

    :goto_4
    iput-object v11, v12, La/Vd$a;->g:La/w4;

    invoke-virtual {v12}, La/Vd$a;->a()La/Vd;

    move-result-object v14

    iput-object v14, v0, La/Ta;->m:La/Vd;

    iget-object v4, v0, La/Ta;->a:La/Ta$b;

    iget v15, v4, La/Ta$b;->i:F

    iget-object v4, v0, La/Ta;->j:Landroid/graphics/RectF;

    invoke-virtual {v0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v11

    invoke-virtual {v4, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual {v0}, La/Ta;->h()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v9

    div-float/2addr v9, v10

    :cond_5
    invoke-virtual {v4, v9, v9}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v9, v0, La/Ta;->h:Landroid/graphics/Path;

    const/16 v17, 0x0

    iget-object v13, v0, La/Ta;->r:La/Wd;

    move-object/from16 v16, v4

    move-object/from16 v18, v9

    invoke-virtual/range {v13 .. v18}, La/Wd;->a(La/Vd;FLandroid/graphics/RectF;La/Ta$a;Landroid/graphics/Path;)V

    invoke-virtual {v0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, La/Ta;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iput-boolean v5, v0, La/Ta;->e:Z

    :cond_6
    iget-object v4, v0, La/Ta;->a:La/Ta$b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v4, La/Ta$b;->n:I

    if-lez v4, :cond_9

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v9, v0, La/Ta;->a:La/Ta$b;

    iget-object v9, v9, La/Ta$b;->a:La/Vd;

    invoke-virtual {v0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v10

    invoke-virtual {v9, v10}, La/Vd;->d(Landroid/graphics/RectF;)Z

    move-result v9

    if-nez v9, :cond_9

    invoke-virtual {v3}, Landroid/graphics/Path;->isConvex()Z

    move-result v9

    if-nez v9, :cond_9

    const/16 v9, 0x1d

    if-ge v4, v9, :cond_9

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    iget-object v4, v0, La/Ta;->a:La/Ta$b;

    iget v4, v4, La/Ta$b;->o:I

    int-to-double v9, v4

    int-to-double v4, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    mul-double/2addr v11, v9

    double-to-int v9, v11

    iget-object v10, v0, La/Ta;->a:La/Ta$b;

    iget v10, v10, La/Ta$b;->o:I

    int-to-double v10, v10

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v4, v10

    double-to-int v4, v4

    int-to-float v5, v9

    int-to-float v4, v4

    invoke-virtual {v1, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    iget-boolean v4, v0, La/Ta;->w:Z

    if-nez v4, :cond_7

    invoke-virtual/range {p0 .. p1}, La/Ta;->d(Landroid/graphics/Canvas;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_5

    :cond_7
    iget-object v4, v0, La/Ta;->v:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v9

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    int-to-float v9, v9

    sub-float/2addr v5, v9

    float-to-int v5, v5

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v10

    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v9, v10

    float-to-int v9, v9

    if-ltz v5, :cond_8

    if-ltz v9, :cond_8

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v10

    float-to-int v10, v10

    iget-object v11, v0, La/Ta;->a:La/Ta$b;

    iget v11, v11, La/Ta$b;->n:I

    mul-int/lit8 v11, v11, 0x2

    add-int/2addr v11, v10

    add-int/2addr v11, v5

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    float-to-int v4, v4

    iget-object v10, v0, La/Ta;->a:La/Ta$b;

    iget v10, v10, La/Ta$b;->n:I

    mul-int/lit8 v10, v10, 0x2

    add-int/2addr v10, v4

    add-int/2addr v10, v9

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v11, v10, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    new-instance v10, Landroid/graphics/Canvas;

    invoke-direct {v10, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v11

    iget v11, v11, Landroid/graphics/Rect;->left:I

    iget-object v12, v0, La/Ta;->a:La/Ta$b;

    iget v12, v12, La/Ta$b;->n:I

    sub-int/2addr v11, v12

    sub-int/2addr v11, v5

    int-to-float v5, v11

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v11

    iget v11, v11, Landroid/graphics/Rect;->top:I

    iget-object v12, v0, La/Ta;->a:La/Ta$b;

    iget v12, v12, La/Ta$b;->n:I

    sub-int/2addr v11, v12

    sub-int/2addr v11, v9

    int-to-float v9, v11

    neg-float v11, v5

    neg-float v12, v9

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v0, v10}, La/Ta;->d(Landroid/graphics/Canvas;)V

    const/4 v10, 0x0

    invoke-virtual {v1, v4, v5, v9, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_5

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid shadow bounds. Check that the treatments result in a valid path."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_5
    iget-object v4, v0, La/Ta;->a:La/Ta$b;

    iget-object v5, v4, La/Ta$b;->p:Landroid/graphics/Paint$Style;

    sget-object v9, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-eq v5, v9, :cond_a

    sget-object v9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    if-ne v5, v9, :cond_b

    :cond_a
    iget-object v4, v4, La/Ta$b;->a:La/Vd;

    invoke-virtual {v0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, La/Ta;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;La/Vd;Landroid/graphics/RectF;)V

    :cond_b
    invoke-virtual/range {p0 .. p0}, La/Ta;->h()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p1}, La/Ta;->f(Landroid/graphics/Canvas;)V

    :cond_c
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;La/Vd;Landroid/graphics/RectF;)V
    .locals 1

    invoke-virtual {p4, p5}, La/Vd;->d(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p3, p4, La/Vd;->f:La/w4;

    invoke-interface {p3, p5}, La/w4;->a(Landroid/graphics/RectF;)F

    move-result p3

    iget-object p4, p0, La/Ta;->a:La/Ta$b;

    iget p4, p4, La/Ta$b;->i:F

    mul-float/2addr p3, p4

    invoke-virtual {p1, p5, p3, p3, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void

    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v2, p0, La/Ta;->o:Landroid/graphics/Paint;

    iget-object v3, p0, La/Ta;->h:Landroid/graphics/Path;

    iget-object v4, p0, La/Ta;->m:La/Vd;

    iget-object v5, p0, La/Ta;->j:Landroid/graphics/RectF;

    invoke-virtual {p0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, La/Ta;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v5, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, La/Ta;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;La/Vd;Landroid/graphics/RectF;)V

    return-void
.end method

.method public final g()Landroid/graphics/RectF;
    .locals 2

    iget-object v0, p0, La/Ta;->i:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    return-object v0
.end method

.method public getAlpha()I
    .locals 1

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget v0, v0, La/Ta$b;->k:I

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->a:La/Vd;

    invoke-virtual {p0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, La/Vd;->d(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->a:La/Vd;

    iget-object v0, v0, La/Vd;->e:La/w4;

    invoke-virtual {p0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, La/w4;->a(Landroid/graphics/RectF;)F

    move-result v0

    iget-object v1, p0, La/Ta;->a:La/Ta$b;

    iget v1, v1, La/Ta$b;->i:F

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    return-void

    :cond_0
    invoke-virtual {p0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, La/Ta;->g:Landroid/graphics/Path;

    invoke-virtual {p0, v0, v1}, La/Ta;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    invoke-static {p1, v1}, La/y5$b;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void

    :cond_1
    const/16 v2, 0x1d

    if-lt v0, v2, :cond_2

    :try_start_0
    invoke-static {p1, v1}, La/y5$a;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Path;->isConvex()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1, v1}, La/y5$a;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    :catch_0
    :cond_3
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->g:Landroid/graphics/Rect;

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

    iget-object v1, p0, La/Ta;->k:Landroid/graphics/Region;

    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    invoke-virtual {p0}, La/Ta;->g()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v2, p0, La/Ta;->g:Landroid/graphics/Path;

    invoke-virtual {p0, v0, v2}, La/Ta;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iget-object v0, p0, La/Ta;->l:Landroid/graphics/Region;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    return-object v1
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->p:Landroid/graphics/Paint$Style;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-eq v0, v1, :cond_0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, La/Ta;->o:Landroid/graphics/Paint;

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

.method public final i(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    new-instance v1, La/J5;

    invoke-direct {v1, p1}, La/J5;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, La/Ta$b;->b:La/J5;

    invoke-virtual {p0}, La/Ta;->n()V

    return-void
.end method

.method public final invalidateSelf()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/Ta;->e:Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public isStateful()Z
    .locals 1

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->e:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->d:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->c:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final j(F)V
    .locals 2

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget v1, v0, La/Ta$b;->m:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, La/Ta$b;->m:F

    invoke-virtual {p0}, La/Ta;->n()V

    :cond_0
    return-void
.end method

.method public final k(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v1, v0, La/Ta$b;->c:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, La/Ta$b;->c:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, La/Ta;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public final l([I)Z
    .locals 5

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v0, v0, La/Ta$b;->c:Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, La/Ta;->n:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    iget-object v3, p0, La/Ta;->a:La/Ta$b;

    iget-object v3, v3, La/Ta$b;->c:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, La/Ta;->a:La/Ta$b;

    iget-object v2, v2, La/Ta$b;->d:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_1

    iget-object v2, p0, La/Ta;->o:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    move-result v3

    iget-object v4, p0, La/Ta;->a:La/Ta$b;

    iget-object v4, v4, La/Ta$b;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {v4, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    if-eq v3, p1, :cond_1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    return v1

    :cond_1
    return v0
.end method

.method public final m()Z
    .locals 7

    iget-object v0, p0, La/Ta;->s:Landroid/graphics/PorterDuffColorFilter;

    iget-object v1, p0, La/Ta;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, La/Ta;->a:La/Ta$b;

    iget-object v3, v2, La/Ta$b;->e:Landroid/content/res/ColorStateList;

    iget-object v2, v2, La/Ta$b;->f:Landroid/graphics/PorterDuff$Mode;

    iget-object v4, p0, La/Ta;->n:Landroid/graphics/Paint;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    invoke-virtual {p0, v3}, La/Ta;->c(I)I

    move-result v3

    iput v3, p0, La/Ta;->u:I

    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v4, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v4}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    invoke-virtual {p0, v2}, La/Ta;->c(I)I

    move-result v3

    iput v3, p0, La/Ta;->u:I

    if-eq v3, v2, :cond_2

    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    iput-object v4, p0, La/Ta;->s:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, La/Ta;->a:La/Ta$b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    iput-object v2, p0, La/Ta;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, La/Ta;->a:La/Ta$b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, La/Ta;->s:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, La/Ta;->t:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    return v0

    :cond_4
    :goto_2
    return v5
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, La/Ta$b;

    iget-object v1, p0, La/Ta;->a:La/Ta$b;

    invoke-direct {v0, v1}, La/Ta$b;-><init>(La/Ta$b;)V

    iput-object v0, p0, La/Ta;->a:La/Ta$b;

    return-object p0
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget v1, v0, La/Ta$b;->m:F

    const/4 v2, 0x0

    add-float/2addr v1, v2

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float/2addr v2, v1

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, v0, La/Ta$b;->n:I

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    const/high16 v2, 0x3e800000    # 0.25f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, v0, La/Ta$b;->o:I

    invoke-virtual {p0}, La/Ta;->m()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/Ta;->e:Z

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onStateChange([I)Z
    .locals 1

    invoke-virtual {p0, p1}, La/Ta;->l([I)Z

    move-result p1

    invoke-virtual {p0}, La/Ta;->m()Z

    move-result v0

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, La/Ta;->invalidateSelf()V

    :cond_2
    return p1
.end method

.method public setAlpha(I)V
    .locals 2

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget v1, v0, La/Ta$b;->k:I

    if-eq v1, p1, :cond_0

    iput p1, v0, La/Ta$b;->k:I

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    iget-object p1, p0, La/Ta;->a:La/Ta$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setShapeAppearanceModel(La/Vd;)V
    .locals 1

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iput-object p1, v0, La/Ta$b;->a:La/Vd;

    invoke-virtual {p0}, La/Ta;->invalidateSelf()V

    return-void
.end method

.method public final setTint(I)V
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, La/Ta;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iput-object p1, v0, La/Ta$b;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, La/Ta;->m()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, La/Ta;->a:La/Ta$b;

    iget-object v1, v0, La/Ta$b;->f:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, La/Ta$b;->f:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, La/Ta;->m()Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method
