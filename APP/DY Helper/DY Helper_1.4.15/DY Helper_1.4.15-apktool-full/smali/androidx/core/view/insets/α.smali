.class public final Landroidx/core/view/insets/α;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/view/View;

.field public final β:Ljava/util/ArrayList;

.field public γ:Lnm0;

.field public δ:Lnm0;

.field public ε:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/core/view/insets/α;->β:Ljava/util/ArrayList;

    .line 10
    .line 11
    sget-object v0, Lnm0;->ε:Lnm0;

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/core/view/insets/α;->γ:Lnm0;

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/core/view/insets/α;->δ:Lnm0;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, Landroid/graphics/drawable/ColorDrawable;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v2

    .line 34
    :goto_0
    iput v0, p0, Landroidx/core/view/insets/α;->ε:I

    .line 35
    .line 36
    new-instance v0, Landroidx/core/view/insets/SystemBarStateMonitor$1;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, p0, v1, p1}, Landroidx/core/view/insets/SystemBarStateMonitor$1;-><init>(Landroidx/core/view/insets/α;Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Landroidx/core/view/insets/α;->α:Landroid/view/View;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lhi0;

    .line 52
    .line 53
    invoke-direct {v1, p0}, Lhi0;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v3, Lb92;->α:Ljava/util/WeakHashMap;

    .line 57
    .line 58
    invoke-static {v0, v1}, Lu82;->θ(Landroid/view/View;Lv41;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Li22;

    .line 62
    .line 63
    invoke-direct {v1, p0}, Li22;-><init>(Landroidx/core/view/insets/α;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Lxb2;

    .line 67
    .line 68
    invoke-direct {p0, v1}, Lxb2;-><init>(Lwb2;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p0}, Landroid/view/View;->setWindowInsetsAnimationCallback(Landroid/view/WindowInsetsAnimation$Callback;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
