.class public final Lxhss/ᛶᛷᛳᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛶᲈᛴᛲ;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛶᲈᛴᛲ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛶᛷᛳᛸ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛶᛷᛳᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛶᲈᛴᛲ;

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
    iget v0, p0, Lxhss/ᛶᛷᛳᛸ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛶᛷᛳᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛶᲈᛴᛲ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxhss/ᛶᲈᛴᛲ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lxhss/ᲁᛳᛵᛷ;

    .line 11
    .line 12
    iget-object p0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Float;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ(F)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p0, p0, Lxhss/ᛶᲈᛴᛲ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lxhss/ᲁᛳᛵᛷ;

    .line 31
    .line 32
    iget-object p0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

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
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
