.class public final synthetic L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:I

.field public final synthetic 飘花落叶言子楪世苏哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 12
    .line 13
    iget-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 14
    .line 15
    int-to-float v3, v0

    .line 16
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setY(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏()V

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getSafeHeight()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰:I

    .line 29
    .line 30
    int-to-float v3, v3

    .line 31
    sub-float/2addr v2, v3

    .line 32
    const/4 v3, 0x0

    .line 33
    cmpg-float v4, v2, v3

    .line 34
    .line 35
    if-gez v4, :cond_0

    .line 36
    .line 37
    move v2, v3

    .line 38
    :cond_0
    iget v3, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 39
    .line 40
    cmpl-float v3, v2, v3

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iput v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 47
    .line 48
    .line 49
    float-to-int p0, v2

    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-virtual {v1, v0, p0, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(IIZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 56
    .line 57
    if-lt v0, p0, :cond_2

    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    iput-boolean p0, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:Z

    .line 61
    .line 62
    :cond_2
    return-void
.end method
