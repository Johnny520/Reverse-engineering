.class public Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final ۥ:F

.field public final ۥ۟:F

.field public final ۥ۟۟:F

.field public final ۥ۟۟۟:F

.field public final ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

.field public final ۥ۟۟۟۠:I

.field public final ۥ۟۟۟ۡ:Landroid/animation/ValueAnimator;

.field public final ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:Z

.field public ۥ۟۟۟ۤ:F

.field public ۥ۟۟۟ۥ:F

.field public ۥ۟۟۟ۦ:Z

.field public ۥ۟۟۟ۧ:Z

.field public ۥ۟۟۟ۨ:F


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIFFFF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Z

    iput p3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:I

    iput p2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۢ:I

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    iput p4, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ:F

    iput p5, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟:F

    iput p6, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟:F

    iput p7, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟:F

    const/4 p2, 0x0

    const/4 p3, 0x2

    new-array p3, p3, [F

    fill-array-data p3, :array_0

    invoke-static {p3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p3

    iput-object p3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۡ:Landroid/animation/ValueAnimator;

    new-instance p4, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ$ۥ;

    invoke-direct {p4, p0}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;)V

    invoke-virtual {p3, p4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->itemView:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {p3, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟(F)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟(F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-boolean p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Z

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->setIsRecyclable(Z)V

    :cond_0
    iput-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public ۥ()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۡ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method

.method public ۥ۟(J)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۡ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    return-void
.end method

.method public ۥ۟۟(F)V
    .locals 0

    iput p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:F

    return-void
.end method

.method public ۥ۟۟۟()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->setIsRecyclable(Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۡ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ:F

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟:F

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:F

    goto :goto_0

    :cond_0
    iget v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:F

    sub-float/2addr v1, v0

    mul-float/2addr v2, v1

    add-float/2addr v0, v2

    iput v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:F

    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟:F

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟:F

    cmpl-float v2, v0, v1

    if-nez v2, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ:F

    goto :goto_1

    :cond_1
    iget v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:F

    sub-float/2addr v1, v0

    mul-float/2addr v2, v1

    add-float/2addr v0, v2

    iput v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ:F

    :goto_1
    return-void
.end method
