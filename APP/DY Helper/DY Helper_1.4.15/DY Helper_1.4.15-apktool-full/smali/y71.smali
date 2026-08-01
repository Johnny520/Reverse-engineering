.class public final synthetic Ly71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Ld81;

.field public final synthetic ζ:I

.field public final synthetic η:F


# direct methods
.method public synthetic constructor <init>(Ld81;IF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly71;->ε:Ld81;

    .line 5
    .line 6
    iput p2, p0, Ly71;->ζ:I

    .line 7
    .line 8
    iput p3, p0, Ly71;->η:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly71;->ε:Ld81;

    .line 2
    .line 3
    iget v1, p0, Ly71;->ζ:I

    .line 4
    .line 5
    iput v1, v0, Ld81;->λ:I

    .line 6
    .line 7
    invoke-virtual {v0}, Ld81;->γ()V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Ld81;->β:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    iget p0, p0, Ly71;->η:F

    .line 13
    .line 14
    neg-float p0, p0

    .line 15
    invoke-virtual {v1, p0}, Landroid/view/View;->setTranslationX(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/high16 v1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-wide/16 v1, 0xaa

    .line 34
    .line 35
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v1, Lν;

    .line 40
    .line 41
    const/16 v2, 0x17

    .line 42
    .line 43
    invoke-direct {v1, v2, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 51
    .line 52
    .line 53
    return-void
.end method
