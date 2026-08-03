.class public Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;
.super Landroid/view/animation/AnimationSet;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟۟۟۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Landroid/view/ViewGroup;

.field public final ۥ۟۟۠ۤ:Landroid/view/View;

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Z


# direct methods
.method public constructor <init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/animation/Animation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۧ:Z

    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۤ:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public getTransformation(JLandroid/view/animation/Transformation;)Z
    .locals 2
    .param p3    # Landroid/view/animation/Transformation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۧ:Z

    .line 2
    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۥ:Z

    if-eqz v1, :cond_0

    .line 3
    iget-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۦ:Z

    xor-int/2addr p1, v0

    return p1

    .line 4
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۥ:Z

    .line 6
    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    invoke-static {p1, p0}, LYue/ۥۣۣۡ۟;->ۥ(Landroid/view/View;Ljava/lang/Runnable;)LYue/ۥۣۣۡ۟;

    :cond_1
    return v0
.end method

.method public getTransformation(JLandroid/view/animation/Transformation;F)Z
    .locals 2
    .param p3    # Landroid/view/animation/Transformation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۧ:Z

    .line 8
    iget-boolean v1, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۥ:Z

    if-eqz v1, :cond_0

    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۦ:Z

    xor-int/2addr p1, v0

    return p1

    .line 10
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->getTransformation(JLandroid/view/animation/Transformation;F)Z

    move-result p1

    if-nez p1, :cond_1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۥ:Z

    .line 12
    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    invoke-static {p1, p0}, LYue/ۥۣۣۡ۟;->ۥ(Landroid/view/View;Ljava/lang/Runnable;)LYue/ۥۣۣۡ۟;

    :cond_1
    return v0
.end method

.method public run()V
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۥ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۧ:Z

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:Landroid/view/ViewGroup;

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۤ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۟۠$ۥ۟;->ۥ۟۟۠ۦ:Z

    :goto_0
    return-void
.end method
