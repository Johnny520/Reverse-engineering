.class public final synthetic LLA;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:LOA;

.field public final synthetic d:F

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(FFLOA;FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LLA;->a:F

    iput p2, p0, LLA;->b:F

    iput-object p3, p0, LLA;->c:LOA;

    iput p4, p0, LLA;->d:F

    iput p5, p0, LLA;->e:F

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    const-wide v0, -0x1be05fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-wide v0, -0x1be08fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget v0, p0, LLA;->b:F

    iget v1, p0, LLA;->a:F

    sub-float/2addr v0, v1

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    iget-object p1, p0, LLA;->c:LOA;

    iget v1, p1, LOA;->e:F

    div-float v1, v0, v1

    iget-object v2, p1, LOA;->a:Landroid/graphics/Matrix;

    iget v3, p0, LLA;->d:F

    iget v4, p0, LLA;->e:F

    invoke-virtual {v2, v1, v1, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    iput v0, p1, LOA;->e:F

    invoke-virtual {p1}, LOA;->b()V

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method
