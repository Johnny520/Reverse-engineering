.class public final synthetic Lla0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Lum1;

.field public final synthetic κ:Lum1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/TextView;Lum1;Lum1;Lum1;Lum1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lla0;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lla0;->ζ:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lla0;->η:Lum1;

    .line 9
    .line 10
    iput-object p4, p0, Lla0;->θ:Lum1;

    .line 11
    .line 12
    iput-object p5, p0, Lla0;->ι:Lum1;

    .line 13
    .line 14
    iput-object p6, p0, Lla0;->κ:Lum1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lla0;->η:Lum1;

    .line 2
    .line 3
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lw90;

    .line 6
    .line 7
    iget-object v1, p0, Lla0;->θ:Lum1;

    .line 8
    .line 9
    iget-object v1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lw90;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lw90;->β(Lw90;Lw90;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lla0;->ι:Lum1;

    .line 20
    .line 21
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v1, p0, Lla0;->κ:Lum1;

    .line 24
    .line 25
    iget-object v1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 37
    :goto_1
    iget-object v1, p0, Lla0;->ζ:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    const/high16 v2, 0x3f800000    # 1.0f

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const v2, 0x3f3851ec    # 0.72f

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 54
    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    const/16 v0, 0x7e

    .line 59
    .line 60
    const/16 v2, 0xeb

    .line 61
    .line 62
    const/16 v3, 0x2c

    .line 63
    .line 64
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const/16 v0, 0x64

    .line 70
    .line 71
    const/16 v2, 0x60

    .line 72
    .line 73
    invoke-static {v2, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    :goto_3
    iget-object p0, p0, Lla0;->ε:Landroid/app/Activity;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 88
    .line 89
    const/high16 v2, 0x41c00000    # 24.0f

    .line 90
    .line 91
    mul-float/2addr v2, p0

    .line 92
    const/high16 p0, 0x3f000000    # 0.5f

    .line 93
    .line 94
    add-float/2addr v2, p0

    .line 95
    float-to-int p0, v2

    .line 96
    invoke-static {v0}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    int-to-float p0, p0

    .line 101
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Ls62;->α:Ls62;

    .line 108
    .line 109
    return-object p0
.end method
