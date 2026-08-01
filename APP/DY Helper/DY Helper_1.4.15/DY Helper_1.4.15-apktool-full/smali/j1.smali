.class public final Lj1;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ll1;


# direct methods
.method public synthetic constructor <init>(Ll1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lj1;->ζ:Ll1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lj1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lbr1;

    .line 7
    .line 8
    iget-object v0, p1, Lbr1;->ζ:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p0, p0, Lj1;->ζ:Ll1;

    .line 18
    .line 19
    iget-object v0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Ll1;->Π:Lj1;

    .line 26
    .line 27
    new-instance v2, Lk1;

    .line 28
    .line 29
    invoke-direct {v2, p1, p0}, Lk1;-><init>(Lbr1;Ll1;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, v0, Ly81;->α:Lkx1;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v1, v2}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p1, Landroid/view/accessibility/AccessibilityEvent;

    .line 41
    .line 42
    iget-object p0, p0, Lj1;->ζ:Ll1;

    .line 43
    .line 44
    iget-object p0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0, p0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
