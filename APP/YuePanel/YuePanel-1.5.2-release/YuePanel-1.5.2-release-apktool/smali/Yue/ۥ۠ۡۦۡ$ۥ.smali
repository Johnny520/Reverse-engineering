.class public LYue/ۥ۠ۡۦۡ$ۥ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۦۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/View;

.field public ۥ۟:Z


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ۟:Z

    iput-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, LYue/ۥۢۤۨ;->ۥ۟۟۟۠(Landroid/view/View;F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۡۦۡ$ۥ;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 2
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    iget-boolean p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ۟:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    if-nez p2, :cond_1

    .line 4
    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, LYue/ۥۢۤۨ;->ۥ۟۟۟۠(Landroid/view/View;F)V

    .line 5
    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    invoke-static {p1}, LYue/ۥۢۤۨ;->ۥ(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->hasOverlappingRendering()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ۟:Z

    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
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
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    invoke-static {p1}, LYue/ۥۢۤۨ;->ۥ۟(Landroid/view/View;)F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۤ:I

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۠ۡۦۡ$ۥ;->ۥ:Landroid/view/View;

    sget v0, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۤ:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

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

.method public ۥ۟۟۟ۤ(LYue/ۥۢۢ۟ۧ;Z)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method
