.class public abstract L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

.field public static 飘花落叶言子楪世哲苏兰:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

.field public static 飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

.field public static final 飘花落叶言子楪世苏哲兰:Landroid/os/Handler;


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
    sput-object v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    sget-object p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, 0x30

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    move v0, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v2

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-wide v4, -0x36a55505051405a7L    # -2.3788554715767682E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    :goto_1
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    const-wide v4, -0x36a5550d051405a7L    # -2.3788445825410267E45

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :goto_2
    if-eqz v0, :cond_2

    .line 41
    .line 42
    const-wide v4, -0x36a554f5051405a7L    # -2.378877249648251E45

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    :goto_3
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_4

    .line 52
    :cond_2
    const-wide v4, -0x36a554fd051405a7L    # -2.3788663606125096E45

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :goto_4
    new-instance v4, Landroid/widget/LinearLayout;

    .line 59
    .line 60
    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 64
    .line 65
    .line 66
    const/high16 v3, 0x41900000    # 18.0f

    .line 67
    .line 68
    invoke-static {p0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/high16 v5, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-static {p0, v5}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-virtual {v4, v3, v6, v3, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v5}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 86
    .line 87
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {v5, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 95
    .line 96
    .line 97
    int-to-float v1, v3

    .line 98
    invoke-virtual {v5, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    new-instance v1, Landroid/widget/TextView;

    .line 108
    .line 109
    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    .line 118
    .line 119
    const/high16 p0, 0x41680000    # 14.5f

    .line 120
    .line 121
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    const/16 p0, 0x11

    .line 128
    .line 129
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    return-object v4
.end method
