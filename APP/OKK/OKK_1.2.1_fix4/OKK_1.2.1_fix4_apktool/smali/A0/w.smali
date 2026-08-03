.class public final LA0/w;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA0/y;ILandroid/widget/TextView;ILandroid/widget/TextView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA0/w;->a:I

    .line 1
    iput-object p1, p0, LA0/w;->f:Ljava/lang/Object;

    iput p2, p0, LA0/w;->b:I

    iput-object p3, p0, LA0/w;->d:Landroid/view/View;

    iput p4, p0, LA0/w;->c:I

    iput-object p5, p0, LA0/w;->e:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(LU/g;LU/O;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LA0/w;->a:I

    .line 2
    iput-object p1, p0, LA0/w;->f:Ljava/lang/Object;

    iput p3, p0, LA0/w;->b:I

    iput-object p4, p0, LA0/w;->d:Landroid/view/View;

    iput p5, p0, LA0/w;->c:I

    iput-object p6, p0, LA0/w;->e:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    iget v0, p0, LA0/w;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget p1, p0, LA0/w;->b:I

    const/4 v0, 0x0

    iget-object v1, p0, LA0/w;->d:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationX(F)V

    :cond_0
    iget p1, p0, LA0/w;->c:I

    if-eqz p1, :cond_1

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget p1, p0, LA0/w;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LA0/w;->e:Ljava/lang/Object;

    check-cast p1, Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, LA0/w;->f:Ljava/lang/Object;

    check-cast p1, LU/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU/z;->b(LU/O;)V

    iget-object v1, p1, LU/g;->p:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, LU/g;->g()V

    return-void

    :pswitch_0
    iget p1, p0, LA0/w;->b:I

    iget-object v0, p0, LA0/w;->f:Ljava/lang/Object;

    check-cast v0, LA0/y;

    iput p1, v0, LA0/y;->n:I

    const/4 p1, 0x0

    iput-object p1, v0, LA0/y;->l:Landroid/animation/Animator;

    iget-object v1, p0, LA0/w;->d:Landroid/view/View;

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget v1, p0, LA0/w;->c:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v0, v0, LA0/y;->r:Lg/K;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object p1, p0, LA0/w;->e:Ljava/lang/Object;

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget p1, p0, LA0/w;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LA0/w;->f:Ljava/lang/Object;

    check-cast p1, LU/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_0
    iget-object p1, p0, LA0/w;->e:Ljava/lang/Object;

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
