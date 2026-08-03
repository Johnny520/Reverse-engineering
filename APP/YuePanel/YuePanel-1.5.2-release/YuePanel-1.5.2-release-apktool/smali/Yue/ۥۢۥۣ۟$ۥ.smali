.class public LYue/ۥۢۥۣ۟$ۥ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/View;

.field public final ۥ۟:I

.field public final ۥ۟۟:Landroid/view/ViewGroup;

.field public final ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:Z

.field public ۥ۟۟۟۠:Z


# direct methods
.method public constructor <init>(Landroid/view/View;IZ)V
    .locals 1

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۠:Z

    iput-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ:Landroid/view/View;

    iput p2, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟:I

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟:Landroid/view/ViewGroup;

    iput-boolean p3, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟:Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟(Z)V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۠:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LYue/ۥۢۥۣ۟$ۥ;->ۥ()V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p0}, LYue/ۥۢۥۣ۟$ۥ;->ۥ()V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ:Landroid/view/View;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LYue/ۥۢۤۨ;->ۥ۟۟۟ۡ(Landroid/view/View;I)V

    .line 3
    iget-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟:Landroid/view/ViewGroup;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

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

    invoke-virtual {p1, p0}, LYue/ۥۢۢ۟ۧ;->removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    return-void
.end method

.method public onTransitionPause(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟(Z)V

    iget-boolean p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۠:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ:Landroid/view/View;

    iget v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟:I

    invoke-static {p1, v0}, LYue/ۥۢۤۨ;->ۥ۟۟۟ۡ(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟(Z)V

    iget-boolean p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۠:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥۢۤۨ;->ۥ۟۟۟ۡ(Landroid/view/View;I)V

    :cond_0
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
    .locals 2

    iget-boolean v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۠:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ:Landroid/view/View;

    iget v1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟:I

    invoke-static {v0, v1}, LYue/ۥۢۤۨ;->ۥ۟۟۟ۡ(Landroid/view/View;I)V

    iget-object v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟(Z)V

    return-void
.end method

.method public final ۥ۟(Z)V
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۟:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iput-boolean p1, p0, LYue/ۥۢۥۣ۟$ۥ;->ۥ۟۟۟۟:Z

    invoke-static {v0, p1}, LYue/ۥۢۤۥۧ;->ۥ۟۟(Landroid/view/ViewGroup;Z)V

    :cond_0
    return-void
.end method
