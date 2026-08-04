.class public final synthetic Lyyds/ᲀᲀᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:F

.field public final synthetic ᛵᛸᛸᛷ:[I

.field public final synthetic ᲀᛲᛳᲀ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(F[ILandroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᲀᲀᛱᛵ;->ᛲᲈᲁ:F

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᲀᛱᛵ;->ᛵᛸᛸᛷ:[I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲀᲀᛱᛵ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 8

    .line 1
    const-wide v0, -0x278e3e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-wide v0, -0x278ede68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 28
    .line 29
    neg-float v1, p1

    .line 30
    iget v2, p0, Lyyds/ᲀᲀᛱᛵ;->ᛲᲈᲁ:F

    .line 31
    .line 32
    sub-float v3, v2, p1

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    iget-object v5, p0, Lyyds/ᲀᲀᛱᛵ;->ᛵᛸᛸᛷ:[I

    .line 40
    .line 41
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lyyds/ᲀᲀᛱᛵ;->ᲀᛲᛳᲀ:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 54
    .line 55
    .line 56
    return-void
.end method
