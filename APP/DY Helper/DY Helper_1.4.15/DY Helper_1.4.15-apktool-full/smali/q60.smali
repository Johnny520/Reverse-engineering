.class public final Lq60;
.super Landroid/view/animation/AnimationSet;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ε:Landroid/view/ViewGroup;

.field public ζ:Z

.field public η:Z

.field public θ:Z


# direct methods
.method public constructor <init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lq60;->θ:Z

    .line 7
    .line 8
    iput-object p2, p0, Lq60;->ε:Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final getTransformation(JLandroid/view/animation/Transformation;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq60;->θ:Z

    .line 3
    .line 4
    iget-boolean v1, p0, Lq60;->ζ:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-boolean p0, p0, Lq60;->η:Z

    .line 9
    .line 10
    xor-int/2addr p0, v0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iput-boolean v0, p0, Lq60;->ζ:Z

    .line 19
    .line 20
    iget-object p1, p0, Lq60;->ε:Landroid/view/ViewGroup;

    .line 21
    .line 22
    invoke-static {p1, p0}, Lh51;->α(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return v0
.end method

.method public final getTransformation(JLandroid/view/animation/Transformation;F)Z
    .locals 2

    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lq60;->θ:Z

    .line 27
    iget-boolean v1, p0, Lq60;->ζ:Z

    if-eqz v1, :cond_0

    .line 28
    iget-boolean p0, p0, Lq60;->η:Z

    xor-int/2addr p0, v0

    return p0

    .line 29
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->getTransformation(JLandroid/view/animation/Transformation;F)Z

    move-result p1

    if-nez p1, :cond_1

    .line 30
    iput-boolean v0, p0, Lq60;->ζ:Z

    .line 31
    iget-object p1, p0, Lq60;->ε:Landroid/view/ViewGroup;

    invoke-static {p1, p0}, Lh51;->α(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_1
    return v0
.end method

.method public final run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq60;->ζ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lq60;->ε:Landroid/view/ViewGroup;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lq60;->θ:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lq60;->θ:Z

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lq60;->η:Z

    .line 24
    .line 25
    return-void
.end method
