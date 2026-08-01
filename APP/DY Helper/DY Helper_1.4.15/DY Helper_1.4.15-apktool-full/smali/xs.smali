.class public final synthetic Lxs;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxs;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxs;->ζ:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lxs;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Lxs;->ζ:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p1, Lbv1;->α:Lbv1;

    .line 10
    .line 11
    const-string p1, "settings_group_link_dismissed"

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p1, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast p1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p1, v0

    .line 29
    :goto_0
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    sput-object v0, Lbv1;->ξ:Landroid/widget/LinearLayout;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    sget-object p1, Lq71;->α:Lq71;

    .line 38
    .line 39
    invoke-static {p0}, Lq71;->μ(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_1
    :pswitch_1
    if-eqz p0, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    instance-of p1, p1, Landroid/app/AlertDialog;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast p0, Landroid/app/AlertDialog;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    instance-of p1, p0, Landroid/view/View;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    check-cast p0, Landroid/view/View;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object p0, v0

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    :goto_2
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
