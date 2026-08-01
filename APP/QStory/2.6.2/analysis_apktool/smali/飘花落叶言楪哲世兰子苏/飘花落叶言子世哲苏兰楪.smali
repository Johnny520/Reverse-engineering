.class public final L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

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
    iget v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Float;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪世苏哲兰(F)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :pswitch_0
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 33
    .line 34
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Float;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪世苏哲兰(F)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
