.class public final synthetic Ld0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:LQ0/k;

.field public final synthetic b:LQ0/j;

.field public final synthetic c:I

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(LQ0/k;LQ0/j;ILandroid/view/View;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/g;->a:LQ0/k;

    iput-object p2, p0, Ld0/g;->b:LQ0/j;

    iput p3, p0, Ld0/g;->c:I

    iput-object p4, p0, Ld0/g;->d:Landroid/view/View;

    iput p5, p0, Ld0/g;->e:F

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    iget-object v0, p0, Ld0/g;->a:LQ0/k;

    const-string v1, "$dragStartX"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ld0/g;->b:LQ0/j;

    const-string v2, "$dragging"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Ld0/g;->d:Landroid/view/View;

    const-string v3, "$dim"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    iget v5, p0, Ld0/g;->c:I

    const v6, 0x3ed70a3d    # 0.42f

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v3, v9, :cond_3

    const/4 v10, 0x2

    if-eq v3, v10, :cond_0

    const/4 p2, 0x3

    if-eq v3, p2, :cond_3

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p2

    iget v0, v0, LQ0/k;->a:F

    sub-float/2addr p2, v0

    iget-boolean v0, v1, LQ0/j;->a:Z

    if-nez v0, :cond_1

    const/16 v0, 0x8

    int-to-float v0, v0

    iget v3, p0, Ld0/g;->e:F

    mul-float/2addr v0, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v0, v3

    float-to-int v0, v0

    neg-int v0, v0

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    iput-boolean v9, v1, LQ0/j;->a:Z

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    iget-boolean v0, v1, LQ0/j;->a:Z

    if-eqz v0, :cond_6

    cmpg-float v0, p2, v8

    if-gez v0, :cond_6

    int-to-float v0, v5

    neg-float v1, v0

    cmpg-float v3, p2, v1

    if-gez v3, :cond_2

    move p2, v1

    :cond_2
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    neg-float p1, p1

    div-float/2addr p1, v0

    invoke-static {p1, v8, v7}, LA0/p;->o(FFF)F

    move-result p1

    sub-float/2addr v7, p1

    mul-float/2addr v7, v6

    invoke-virtual {v2, v7}, Landroid/view/View;->setAlpha(F)V

    goto :goto_2

    :cond_3
    iget-boolean p2, v1, LQ0/j;->a:Z

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p2

    neg-int v0, v5

    int-to-float v0, v0

    const/high16 v3, 0x3e800000    # 0.25f

    mul-float/2addr v0, v3

    cmpg-float p2, p2, v0

    if-gez p2, :cond_4

    invoke-static {v9}, LU/S;->n(Z)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v8}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v10, 0xf0

    invoke-virtual {p1, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance p2, Landroid/view/animation/PathInterpolator;

    const v0, 0x3e6147ae    # 0.22f

    const v3, 0x3eb851ec    # 0.36f

    invoke-direct {p2, v0, v7, v3, v7}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    :goto_0
    iput-boolean v4, v1, LQ0/j;->a:Z

    move v4, v9

    goto :goto_1

    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, v0, LQ0/k;->a:F

    iput-boolean v4, v1, LQ0/j;->a:Z

    :cond_6
    :goto_1
    move v9, v4

    :goto_2
    return v9
.end method
