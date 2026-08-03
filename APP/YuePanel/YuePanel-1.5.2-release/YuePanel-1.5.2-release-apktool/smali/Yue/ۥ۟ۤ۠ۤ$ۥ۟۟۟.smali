.class public LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/ImageView;

.field public final ۥ۟:Landroid/graphics/Matrix;

.field public final ۥ۟۟:Landroid/graphics/Matrix;

.field public ۥ۟۟۟:Z


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V
    .locals 1

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟۟:Z

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ:Landroid/widget/ImageView;

    iput-object p2, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟:Landroid/graphics/Matrix;

    iput-object p3, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟۟:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    iput-boolean p2, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟۟:Z

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .locals 0

    check-cast p1, Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟۟:Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟۟:Z

    return-void
.end method

.method public onTransitionCancel(LYue/ۥۢۢ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public onTransitionEnd(LYue/ۥۢۢ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public onTransitionPause(LYue/ۥۢۢ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean p1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟۟:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ()V

    return-void
.end method

.method public onTransitionStart(LYue/ۥۢۢ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public final ۥ()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ:Landroid/widget/ImageView;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۢ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ:Landroid/widget/ImageView;

    invoke-static {v1, v0}, LYue/ۥ۠ۥۡ;->ۥ(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ:Landroid/widget/ImageView;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۢ:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final ۥ۟(Landroid/graphics/Matrix;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ:Landroid/widget/ImageView;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۢ:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ:Landroid/widget/ImageView;

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;->ۥ۟۟:Landroid/graphics/Matrix;

    invoke-static {p1, v0}, LYue/ۥ۠ۥۡ;->ۥ(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    return-void
.end method
