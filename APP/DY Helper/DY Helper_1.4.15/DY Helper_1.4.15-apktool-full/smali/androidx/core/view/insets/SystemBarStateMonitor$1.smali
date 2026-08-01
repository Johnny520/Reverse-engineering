.class final Landroidx/core/view/insets/SystemBarStateMonitor$1;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:Landroid/view/ViewGroup;

.field public final synthetic ζ:Landroidx/core/view/insets/α;


# direct methods
.method public constructor <init>(Landroidx/core/view/insets/α;Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/view/insets/SystemBarStateMonitor$1;->ζ:Landroidx/core/view/insets/α;

    .line 2
    .line 3
    iput-object p3, p0, Landroidx/core/view/insets/SystemBarStateMonitor$1;->ε:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/core/view/insets/SystemBarStateMonitor$1;->ζ:Landroidx/core/view/insets/α;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/core/view/insets/α;->β:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/core/view/insets/SystemBarStateMonitor$1;->ε:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v1, p0, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p0, Landroid/graphics/drawable/ColorDrawable;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    iget v1, p1, Landroidx/core/view/insets/α;->ε:I

    .line 24
    .line 25
    if-eq v1, p0, :cond_2

    .line 26
    .line 27
    iput p0, p1, Landroidx/core/view/insets/α;->ε:I

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/lit8 p0, p0, -0x1

    .line 34
    .line 35
    :goto_1
    if-ltz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lyj1;

    .line 42
    .line 43
    iget-object p1, p1, Lyj1;->α:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    if-gez v1, :cond_1

    .line 52
    .line 53
    add-int/lit8 p0, p0, -0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v1, p1}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    throw p0

    .line 61
    :cond_2
    return-void
.end method
