.class public final LNA;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source ""


# instance fields
.field public final synthetic a:LOA;


# direct methods
.method public constructor <init>(LOA;)V
    .locals 0

    iput-object p1, p0, LNA;->a:LOA;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 6

    const-wide v0, -0x1be66fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    iget-object v1, p0, LNA;->a:LOA;

    iget v2, v1, LOA;->e:F

    mul-float v3, v2, v0

    iget v4, v1, LOA;->f:F

    cmpg-float v5, v3, v4

    if-gez v5, :cond_0

    div-float v0, v4, v2

    iput v4, v1, LOA;->e:F

    goto :goto_0

    :cond_0
    iget v4, v1, LOA;->g:F

    cmpl-float v5, v3, v4

    if-lez v5, :cond_1

    div-float v0, v4, v2

    iput v4, v1, LOA;->e:F

    goto :goto_0

    :cond_1
    iput v3, v1, LOA;->e:F

    :goto_0
    iget-object v2, v1, LOA;->a:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result p1

    invoke-virtual {v2, v0, v0, v3, p1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    invoke-virtual {v1}, LOA;->b()V

    iget-object p1, v1, LOA;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    const/4 p1, 0x1

    return p1
.end method
