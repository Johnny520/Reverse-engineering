.class public final synthetic Lni0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic α:Landroid/view/View;

.field public final synthetic β:Landroid/view/ViewGroup;

.field public final synthetic γ:Landroidx/appcompat/widget/AppCompatImageButton;

.field public final synthetic δ:Lpi0;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/appcompat/widget/AppCompatImageButton;Lpi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lni0;->α:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lni0;->β:Landroid/view/ViewGroup;

    .line 7
    .line 8
    iput-object p3, p0, Lni0;->γ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 9
    .line 10
    iput-object p4, p0, Lni0;->δ:Lpi0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    sget-object p1, Lri0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    iget-object p1, p0, Lni0;->α:Landroid/view/View;

    .line 4
    .line 5
    iget-object p2, p0, Lni0;->β:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lri0;->β(Landroid/view/View;Landroid/view/ViewGroup;)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_4

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    sget-object p2, Lpi0;->θ:Lpi0;

    .line 18
    .line 19
    iget-object p3, p0, Lni0;->δ:Lpi0;

    .line 20
    .line 21
    if-ne p3, p2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object p0, p0, Lni0;->γ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    instance-of p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 31
    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p2, 0x0

    .line 38
    :goto_0
    if-nez p2, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-ne p3, p1, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    :goto_1
    return-void
.end method
