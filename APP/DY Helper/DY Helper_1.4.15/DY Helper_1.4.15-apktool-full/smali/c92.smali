.class public final Lc92;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroidx/compose/ui/platform/AbstractComposeView;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AbstractComposeView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc92;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lc92;->ζ:Landroidx/compose/ui/platform/AbstractComposeView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final α(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final β(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p0, p0, Lc92;->ε:I

    .line 2
    .line 3
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lc92;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lc92;->ζ:Landroidx/compose/ui/platform/AbstractComposeView;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lk92;->ε:Lk92;

    .line 13
    .line 14
    invoke-static {p1, v0}, Lus1;->χ(Ljava/lang/Object;La80;)Lss1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/view/ViewParent;

    .line 34
    .line 35
    instance-of v2, v0, Landroid/view/View;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    check-cast v0, Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const v2, 0x7f0901fc

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    check-cast v0, Ljava/lang/Boolean;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v0, 0x0

    .line 59
    :goto_0
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    :cond_2
    if-eqz v1, :cond_0

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    :cond_3
    if-nez v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->δ()V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void

    .line 74
    :pswitch_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->δ()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
