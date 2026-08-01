.class public final Lkg;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Landroid/view/View;

.field public final synthetic β:F

.field public final synthetic γ:I


# direct methods
.method public constructor <init>(FILandroid/view/View;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lkg;->α:Landroid/view/View;

    .line 2
    .line 3
    iput p1, p0, Lkg;->β:F

    .line 4
    .line 5
    iput p2, p0, Lkg;->γ:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkg;->α:Landroid/view/View;

    .line 5
    .line 6
    const v0, 0x7f0dead2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkg;->α:Landroid/view/View;

    .line 5
    .line 6
    const v1, 0x7f0dead2

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v2, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lug;->α:Ltg;

    .line 21
    .line 22
    iget p1, p0, Lkg;->β:F

    .line 23
    .line 24
    invoke-static {v0, p1}, Ltg;->р(Landroid/view/View;F)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    cmpg-float p1, p1, v1

    .line 29
    .line 30
    if-gtz p1, :cond_1

    .line 31
    .line 32
    iget p0, p0, Lkg;->γ:I

    .line 33
    .line 34
    invoke-static {p0}, Ltg;->с(I)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    const p0, 0x7f0dead9

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    const/16 p0, 0x8

    .line 56
    .line 57
    invoke-static {v0, p0}, Ltg;->Λ(Landroid/view/View;I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    return-void
.end method
