.class public final LU/d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LU/g;LU/O;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LU/d;->a:I

    .line 2
    iput-object p1, p0, LU/d;->d:Ljava/lang/Object;

    iput-object p3, p0, LU/d;->b:Landroid/view/View;

    iput-object p4, p0, LU/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LU/g;Ljava/lang/Object;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p5, p0, LU/d;->a:I

    iput-object p1, p0, LU/d;->d:Ljava/lang/Object;

    iput-object p3, p0, LU/d;->c:Ljava/lang/Object;

    iput-object p4, p0, LU/d;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LU/d;->a:I

    iput-object p3, p0, LU/d;->b:Landroid/view/View;

    iput-object p2, p0, LU/d;->c:Ljava/lang/Object;

    iput-object p1, p0, LU/d;->d:Ljava/lang/Object;

    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, LU/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, LU/d;->b:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget v0, p0, LU/d;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "animation"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LU/d;->b:Landroid/view/View;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object v0, p0, LU/d;->d:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    check-cast p1, Landroid/widget/LinearLayout;

    iget-object v1, p0, LU/d;->c:Ljava/lang/Object;

    check-cast v1, Landroid/widget/FrameLayout;

    invoke-static {v0, v1, p1}, LU/S;->o(Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;)V

    return-void

    :pswitch_0
    iget-object p1, p0, LU/d;->c:Ljava/lang/Object;

    check-cast p1, Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    const/high16 p1, 0x3f800000    # 1.0f

    iget-object v0, p0, LU/d;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object p1, p0, LU/d;->c:Ljava/lang/Object;

    check-cast p1, Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    const/high16 p1, 0x3f800000    # 1.0f

    iget-object v0, p0, LU/d;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    const/4 p1, 0x0

    throw p1

    :pswitch_2
    iget-object p1, p0, LU/d;->c:Ljava/lang/Object;

    check-cast p1, Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, LU/d;->d:Ljava/lang/Object;

    check-cast p1, LU/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU/z;->b(LU/O;)V

    iget-object v1, p1, LU/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, LU/g;->g()V

    return-void

    :pswitch_3
    iget-object p1, p0, LU/d;->c:Ljava/lang/Object;

    check-cast p1, Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, LU/d;->b:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, LU/d;->d:Ljava/lang/Object;

    check-cast p1, LU/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU/z;->b(LU/O;)V

    iget-object v1, p1, LU/g;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, LU/g;->g()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, LU/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    const/4 p1, 0x0

    throw p1

    :pswitch_1
    const/4 p1, 0x0

    throw p1

    :pswitch_2
    iget-object p1, p0, LU/d;->d:Ljava/lang/Object;

    check-cast p1, LU/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_3
    iget-object p1, p0, LU/d;->d:Ljava/lang/Object;

    check-cast p1, LU/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
