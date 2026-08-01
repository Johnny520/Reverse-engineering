.class public final Lxhss/ᛴᲇᲀᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛴᲇᲀᛷ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛴᲇᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

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
    iget v0, p0, Lxhss/ᛴᲇᲀᛷ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛴᲇᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lxhss/ᛵᛲᲇᛴ;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Float;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲀᛷᲁᲀ:F

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    check-cast p0, Lxhss/ᛶᲈᛴᛲ;

    .line 27
    .line 28
    iget-object p0, p0, Lxhss/ᛶᲈᛴᛲ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lxhss/ᛲᛵᛶᲁ;

    .line 31
    .line 32
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Float;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ(F)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    check-cast p0, Lxhss/ᛶᲈᛴᛲ;

    .line 49
    .line 50
    iget-object p0, p0, Lxhss/ᛶᲈᛴᛲ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lxhss/ᛲᛵᛶᲁ;

    .line 53
    .line 54
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/Float;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ(F)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
