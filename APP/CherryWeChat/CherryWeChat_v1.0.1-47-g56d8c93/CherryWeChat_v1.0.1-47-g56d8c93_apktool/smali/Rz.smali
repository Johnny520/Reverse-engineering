.class public final LRz;
.super Landroid/view/animation/Animation;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LWz;


# direct methods
.method public synthetic constructor <init>(LWz;I)V
    .locals 0

    iput p2, p0, LRz;->a:I

    iput-object p1, p0, LRz;->b:LWz;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget p2, p0, LRz;->a:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, LRz;->b:LWz;

    invoke-virtual {p2, p1}, LWz;->k(F)V

    return-void

    :pswitch_0
    iget-object p2, p0, LRz;->b:LWz;

    iget v0, p2, LWz;->x:I

    iget v1, p2, LWz;->w:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p2, LWz;->v:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    add-int/2addr v1, v0

    iget-object v0, p2, LWz;->t:Ls9;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    sub-int/2addr v1, v0

    invoke-virtual {p2, v1}, LWz;->setTargetOffsetTopAndBottom(I)V

    iget-object p2, p2, LWz;->z:Lw9;

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    iget-object p1, p2, Lw9;->a:Lv9;

    iget v1, p1, Lv9;->p:F

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_0

    iput v0, p1, Lv9;->p:F

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    :pswitch_1
    const/high16 p2, 0x3f800000    # 1.0f

    sub-float/2addr p2, p1

    iget-object p1, p0, LRz;->b:LWz;

    invoke-virtual {p1, p2}, LWz;->setAnimationProgress(F)V

    return-void

    :pswitch_2
    iget-object p2, p0, LRz;->b:LWz;

    invoke-virtual {p2, p1}, LWz;->setAnimationProgress(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
