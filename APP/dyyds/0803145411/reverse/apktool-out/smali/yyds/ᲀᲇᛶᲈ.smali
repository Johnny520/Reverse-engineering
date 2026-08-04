.class public final Lyyds/ᲀᲇᛶᲈ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lyyds/ᲀᲇᛶᲈ;->ᛲᲈᲁ:I

    iput-object p2, p0, Lyyds/ᲀᲇᛶᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyyds/ᛸᛷᛸᛳ;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    iput p2, p0, Lyyds/ᲀᲇᛶᲈ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᲇᛶᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲀᲇᛶᲈ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲀᲇᛶᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_1
    check-cast v1, Lyyds/ᛸᛷᛸᛳ;

    .line 13
    .line 14
    invoke-interface {v1}, Lyyds/ᛸᛷᛸᛳ;->ᛵᛸᛸᛷ()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    iput-object p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲈᲀᛲᲀ:Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    iput-boolean p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛲᲈᲈ:Z

    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᲀᲇᛶᲈ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lyyds/ᲀᲇᛶᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lyyds/ᛸᛷᛸᛳ;

    .line 10
    .line 11
    invoke-interface {p0}, Lyyds/ᛸᛷᛸᛳ;->ᛲᲈᲁ()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const-wide v2, -0x2e580e68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    check-cast p0, Lyyds/ᛷᛵᛵᲇ;

    .line 24
    .line 25
    iget-object v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛳᛸᛴᛶ:Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    if-ne v0, p1, :cond_0

    .line 28
    .line 29
    iput-object v1, p0, Lyyds/ᛷᛵᛵᲇ;->ᛳᛸᛴᛶ:Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput p1, p0, Lyyds/ᛷᛵᛵᲇ;->ᛵᛶᛲᲀ:F

    .line 33
    .line 34
    const/high16 p1, 0x3f800000    # 1.0f

    .line 35
    .line 36
    iput p1, p0, Lyyds/ᛷᛵᛵᲇ;->ᲀᛲᛲᲇ:F

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_1
    check-cast p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 43
    .line 44
    iput-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲈᲀᛲᲀ:Landroid/view/ViewPropertyAnimator;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛲᲈᲈ:Z

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᲇᛶᲈ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲀᲇᛶᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyyds/ᛸᛷᛸᛳ;

    .line 13
    .line 14
    invoke-interface {p0}, Lyyds/ᛸᛷᛸᛳ;->ᲀᛲᛳᲀ()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
