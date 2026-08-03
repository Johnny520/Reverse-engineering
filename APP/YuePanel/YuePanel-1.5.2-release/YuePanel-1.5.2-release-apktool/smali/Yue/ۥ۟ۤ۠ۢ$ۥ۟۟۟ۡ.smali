.class public LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/View;

.field public final ۥ۟:Landroid/graphics/Rect;

.field public final ۥ۟۟:Z

.field public final ۥ۟۟۟:Landroid/graphics/Rect;

.field public final ۥ۟۟۟۟:Z

.field public final ۥ۟۟۟۠:I

.field public final ۥ۟۟۟ۡ:I

.field public final ۥ۟۟۟ۢ:I

.field public final ۥۣ۟۟۟:I

.field public final ۥ۟۟۟ۤ:I

.field public final ۥ۟۟۟ۥ:I

.field public final ۥ۟۟۟ۦ:I

.field public final ۥ۟۟۟ۧ:I

.field public ۥ۟۟۟ۨ:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V
    .locals 0

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    iput-object p2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟:Landroid/graphics/Rect;

    iput-boolean p3, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟:Z

    iput-object p4, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/graphics/Rect;

    iput-boolean p5, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Z

    iput p6, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    iput p7, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:I

    iput p8, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:I

    iput p9, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥۣ۟۟۟:I

    iput p10, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:I

    iput p11, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:I

    iput p12, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:I

    iput p13, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۧ:I

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 3

    .line 2
    iget-boolean p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۨ:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    if-eqz p2, :cond_2

    .line 3
    iget-boolean v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟:Landroid/graphics/Rect;

    goto :goto_0

    .line 4
    :cond_2
    iget-boolean v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Z

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/graphics/Rect;

    .line 5
    :goto_0
    iget-object v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    if-eqz p2, :cond_4

    .line 6
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    iget p2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    iget v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:I

    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:I

    iget v2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥۣ۟۟۟:I

    invoke-static {p1, p2, v0, v1, v2}, LYue/ۥۢۤۨ;->ۥ۟۟۟۟(Landroid/view/View;IIII)V

    goto :goto_1

    .line 7
    :cond_4
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    iget p2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:I

    iget v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:I

    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:I

    iget v2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۧ:I

    invoke-static {p1, p2, v0, v1, v2}, LYue/ۥۢۤۨ;->ۥ۟۟۟۟(Landroid/view/View;IIII)V

    :goto_1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->onAnimationStart(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 4

    .line 2
    iget p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:I

    iget v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    sub-int/2addr p1, v0

    iget v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:I

    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:I

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 3
    iget v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥۣ۟۟۟:I

    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:I

    sub-int/2addr v0, v1

    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۧ:I

    iget v2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz p2, :cond_0

    .line 4
    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:I

    goto :goto_0

    :cond_0
    iget v1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    :goto_0
    if-eqz p2, :cond_1

    .line 5
    iget v2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:I

    goto :goto_1

    :cond_1
    iget v2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:I

    .line 6
    :goto_1
    iget-object v3, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    add-int/2addr p1, v1

    add-int/2addr v0, v2

    invoke-static {v3, v1, v2, p1, v0}, LYue/ۥۢۤۨ;->ۥ۟۟۟۟(Landroid/view/View;IIII)V

    if-eqz p2, :cond_2

    .line 7
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/graphics/Rect;

    goto :goto_2

    :cond_2
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟:Landroid/graphics/Rect;

    .line 8
    :goto_2
    iget-object p2, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onTransitionCancel(LYue/ۥۢۢ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۨ:Z

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

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۠:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-boolean p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/graphics/Rect;

    :goto_0
    iget-object v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onTransitionResume(LYue/ۥۢۢ۟ۧ;)V
    .locals 3
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    sget v0, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۠:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    sget v1, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟۠:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, LYue/ۥ۟ۤ۠ۢ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

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
