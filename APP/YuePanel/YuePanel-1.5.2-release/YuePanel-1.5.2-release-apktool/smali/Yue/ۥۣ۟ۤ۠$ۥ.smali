.class public LYue/ۥۣ۟ۤ۠$ۥ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۤ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/graphics/Rect;

.field public final ۥ۟:Landroid/graphics/Rect;

.field public final ۥ۟۟:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    iput-object p2, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ:Landroid/graphics/Rect;

    iput-object p3, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, LYue/ۥۣ۟ۤ۠$ۥ;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0

    if-nez p2, :cond_0

    .line 2
    iget-object p1, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    iget-object p2, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    iget-object p2, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    :goto_0
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

    iget-object p1, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LYue/ۥۣ۟ۤ۠;->ۥ۟۟۠ۦ:Landroid/graphics/Rect;

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۠:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    iget-object v0, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    sget v0, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۠:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    iget-object v0, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    iget-object p1, p0, LYue/ۥۣ۟ۤ۠$ۥ;->ۥ۟۟:Landroid/view/View;

    sget v0, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۠:I

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
