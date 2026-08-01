.class public final synthetic Lwu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/Switch;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/Switch;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwu;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lwu;->ζ:Landroid/widget/Switch;

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
    .locals 1

    .line 1
    iget v0, p0, Lwu;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lwu;->ζ:Landroid/widget/Switch;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    xor-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Lwu;->ζ:Landroid/widget/Switch;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    xor-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object p0, p0, Lwu;->ζ:Landroid/widget/Switch;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    xor-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    iget-object p0, p0, Lwu;->ζ:Landroid/widget/Switch;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    xor-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_3
    const/4 v0, 0x3

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lwu;->ζ:Landroid/widget/Switch;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    xor-int/lit8 p1, p1, 0x1

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_4
    const/4 v0, 0x3

    .line 71
    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lwu;->ζ:Landroid/widget/Switch;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    xor-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
