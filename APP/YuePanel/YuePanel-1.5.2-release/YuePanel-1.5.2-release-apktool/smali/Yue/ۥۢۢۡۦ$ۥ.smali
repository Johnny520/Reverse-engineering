.class public LYue/ۥۢۢۡۦ$ۥ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۢۡۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/View;

.field public final ۥ۟:Landroid/view/View;

.field public ۥ۟۟:[I

.field public ۥ۟۟۟:F

.field public ۥ۟۟۟۟:F

.field public final ۥ۟۟۟۠:F

.field public final ۥ۟۟۟ۡ:F

.field public ۥ۟۟۟ۢ:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;FF)V
    .locals 0

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iput-object p2, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ:Landroid/view/View;

    iput p3, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟۠:F

    iput p4, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۡ:F

    sget p1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۥ:I

    invoke-virtual {p2, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟:[I

    if-eqz p1, :cond_0

    sget p1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۥ:I

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۢ:Z

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟۠:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۡ:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, LYue/ۥۢۢۡۦ$ۥ;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-nez p2, :cond_0

    .line 1
    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget p2, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟۠:F

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 2
    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget p2, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۡ:F

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    return-void
.end method

.method public onTransitionCancel(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۢ:Z

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟۠:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۡ:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public onTransitionEnd(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۡ(LYue/ۥۢۢ۟ۧ;Z)V

    return-void
.end method

.method public onTransitionPause(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥۢۢۡۦ$ۥ;->ۥ()V

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    iput p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟:F

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    iput p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟۟:F

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟۠:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۡ:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟۟:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

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

    iget-object v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟:[I

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟:[I

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟:Landroid/view/View;

    iget-object v1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۥ:I

    iget-object v2, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟:[I

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۢۢ۟ۧ;Z)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ۟۟۟ۢ:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۢۡۦ$ۥ;->ۥ:Landroid/view/View;

    sget p2, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۥ:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
