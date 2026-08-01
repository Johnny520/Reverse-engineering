.class public final Landroidx/recyclerview/widget/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

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
    const/high16 v0, 0x437f0000    # 255.0f

    .line 28
    .line 29
    mul-float/2addr p1, v0

    .line 30
    float-to-int p1, p1

    .line 31
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Landroid/graphics/drawable/StateListDrawable;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
