.class public final LSl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:Landroidx/recyclerview/widget/o;

.field public final f:I

.field public final g:Landroid/animation/ValueAnimator;

.field public h:Z

.field public i:F

.field public j:F

.field public k:Z

.field public l:Z

.field public m:F

.field public final synthetic n:I

.field public final synthetic o:Landroidx/recyclerview/widget/o;

.field public final synthetic p:LWl;


# direct methods
.method public constructor <init>(LWl;Landroidx/recyclerview/widget/o;IFFFFILandroidx/recyclerview/widget/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSl;->p:LWl;

    iput p8, p0, LSl;->n:I

    iput-object p9, p0, LSl;->o:Landroidx/recyclerview/widget/o;

    const/4 p1, 0x0

    iput-boolean p1, p0, LSl;->k:Z

    iput-boolean p1, p0, LSl;->l:Z

    iput p3, p0, LSl;->f:I

    iput-object p2, p0, LSl;->e:Landroidx/recyclerview/widget/o;

    iput p4, p0, LSl;->a:F

    iput p5, p0, LSl;->b:F

    iput p6, p0, LSl;->c:F

    iput p7, p0, LSl;->d:F

    const/4 p1, 0x2

    new-array p3, p1, [F

    fill-array-data p3, :array_0

    invoke-static {p3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p3

    iput-object p3, p0, LSl;->g:Landroid/animation/ValueAnimator;

    new-instance p4, LX5;

    invoke-direct {p4, p1, p0}, LX5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p3, p4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p2, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {p3, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 p1, 0x0

    iput p1, p0, LSl;->m:F

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a(Landroid/animation/Animator;)V
    .locals 1

    iget-boolean p1, p0, LSl;->l:Z

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, LSl;->e:Landroidx/recyclerview/widget/o;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/o;->setIsRecyclable(Z)V

    :cond_0
    iput-boolean v0, p0, LSl;->l:Z

    return-void
.end method

.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, LSl;->m:F

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    invoke-virtual {p0, p1}, LSl;->a(Landroid/animation/Animator;)V

    iget-boolean p1, p0, LSl;->k:Z

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p0, LSl;->n:I

    iget-object v0, p0, LSl;->o:Landroidx/recyclerview/widget/o;

    iget-object v1, p0, LSl;->p:LWl;

    if-gtz p1, :cond_1

    iget-object p1, v1, LWl;->m:LUl;

    iget-object v2, v1, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v2, v0}, LUl;->a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o;)V

    goto :goto_0

    :cond_1
    iget-object v2, v1, LWl;->a:Ljava/util/ArrayList;

    iget-object v3, v0, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    iput-boolean v2, p0, LSl;->h:Z

    if-lez p1, :cond_2

    iget-object v2, v1, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, LB0;

    invoke-direct {v3, v1, p0, p1}, LB0;-><init>(LWl;LSl;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    iget-object p1, v1, LWl;->v:Landroid/view/View;

    iget-object v0, v0, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    if-ne p1, v0, :cond_3

    invoke-virtual {v1, v0}, LWl;->m(Landroid/view/View;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
