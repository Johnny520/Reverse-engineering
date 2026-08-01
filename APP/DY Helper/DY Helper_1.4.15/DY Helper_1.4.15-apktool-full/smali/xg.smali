.class public final synthetic Lxg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;

.field public final synthetic γ:Ljava/lang/Object;

.field public final synthetic δ:Landroid/view/KeyEvent$Callback;

.field public final synthetic ε:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxg;->α:I

    .line 2
    .line 3
    iput-object p3, p0, Lxg;->β:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Lxg;->γ:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p2, p0, Lxg;->δ:Landroid/view/KeyEvent$Callback;

    .line 8
    .line 9
    iput-object p5, p0, Lxg;->ε:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 1
    iget v0, p0, Lxg;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxg;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    iget-object v1, p0, Lxg;->γ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lid1;

    .line 13
    .line 14
    iget v1, v1, Lid1;->α:I

    .line 15
    .line 16
    iget-object v2, p0, Lxg;->δ:Landroid/view/KeyEvent$Callback;

    .line 17
    .line 18
    check-cast v2, Landroid/app/Activity;

    .line 19
    .line 20
    iget-object p0, p0, Lxg;->ε:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lxx;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast v0, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-static {v2, p0, p2}, Lxd1;->β(Landroid/app/Activity;Lxx;Z)Landroid/graphics/drawable/GradientDrawable;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lxg;->β:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Landroid/widget/SeekBar;

    .line 53
    .line 54
    iget-object v1, p0, Lxg;->γ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Landroid/widget/TextView;

    .line 57
    .line 58
    iget-object v2, p0, Lxg;->δ:Landroid/view/KeyEvent$Callback;

    .line 59
    .line 60
    check-cast v2, Landroid/widget/Switch;

    .line 61
    .line 62
    iget-object p0, p0, Lxg;->ε:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lwa;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 76
    .line 77
    .line 78
    if-eqz p2, :cond_1

    .line 79
    .line 80
    const/high16 p1, 0x3f800000    # 1.0f

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const p1, 0x3ee66666    # 0.45f

    .line 84
    .line 85
    .line 86
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Lwa;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
