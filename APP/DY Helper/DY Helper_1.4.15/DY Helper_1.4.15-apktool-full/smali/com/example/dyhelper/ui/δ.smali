.class public final synthetic Lcom/example/dyhelper/ui/δ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/example/dyhelper/ui/δ;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/example/dyhelper/ui/δ;->β:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/example/dyhelper/ui/δ;->α:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/example/dyhelper/ui/δ;->β:Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 9
    .line 10
    sget v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Γ:I

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast p1, Ljava/lang/Float;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ν:F

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->β(Ljava/lang/Float;Ljava/lang/Integer;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    check-cast p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 36
    .line 37
    sget v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->σ:I

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast p1, Ljava/lang/Float;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->β(F)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    check-cast p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;

    .line 60
    .line 61
    sget v0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->χ:I

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast p1, Ljava/lang/Float;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->υ:F

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_2
    check-cast p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;

    .line 86
    .line 87
    sget v0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->π:I

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    check-cast p1, Ljava/lang/Float;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ξ:F

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_3
    check-cast p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;

    .line 112
    .line 113
    sget v0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->φ:I

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast p1, Ljava/lang/Float;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->τ:F

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
