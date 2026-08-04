.class public final Lyyds/ᲁᲈᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᲁᛳᲀᛸ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲁᛳᲀᛸ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲁᲈᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᲈᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᲀᛸ;

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
    iget v0, p0, Lyyds/ᲁᲈᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᲈᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᲀᛸ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲁᛳᲀᛸ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lyyds/ᲁᛷᲇᛸ;

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᲁᛷᲇᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 13
    .line 14
    check-cast p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

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
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ(F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲁᛳᲀᛸ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lyyds/ᲁᛷᲇᛸ;

    .line 33
    .line 34
    iget-object p0, p0, Lyyds/ᲁᛷᲇᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 35
    .line 36
    check-cast p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ljava/lang/Float;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ(F)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
