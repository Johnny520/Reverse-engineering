.class public abstract Ldl0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ldl0;->α:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public static α(Landroid/app/Activity;Lf9;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)Landroid/widget/TextView;
    .locals 3

    .line 1
    const/high16 v0, 0x41600000    # 14.0f

    .line 2
    .line 3
    invoke-static {p0, p2, v0}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    const/4 p3, 0x1

    .line 16
    invoke-virtual {p0, p2, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 17
    .line 18
    .line 19
    const/16 p2, 0x11

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 22
    .line 23
    .line 24
    const/16 p2, 0x14

    .line 25
    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v1, 0xc

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {p1, p2}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p1, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p0, v0, v2, p2, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 77
    .line 78
    .line 79
    new-instance p2, Landroid/graphics/drawable/GradientDrawable;

    .line 80
    .line 81
    invoke-direct {p2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-static {p4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    invoke-virtual {p2, p4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 89
    .line 90
    .line 91
    const/16 p4, 0xa

    .line 92
    .line 93
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p4

    .line 97
    invoke-virtual {p1, p4}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    int-to-float p1, p1

    .line 108
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p3}, Landroid/view/View;->setClickable(Z)V

    .line 115
    .line 116
    .line 117
    new-instance p1, Lb9;

    .line 118
    .line 119
    const/4 p2, 0x5

    .line 120
    invoke-direct {p1, p2, p5}, Lb9;-><init>(ILp70;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    .line 125
    .line 126
    return-object p0
.end method
