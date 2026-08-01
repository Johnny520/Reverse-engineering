.class public final synthetic L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世兰苏哲:Landroid/widget/TextView;

.field public final synthetic 飘花落叶言子楪世哲兰苏:Landroid/graphics/drawable/GradientDrawable;

.field public final synthetic 飘花落叶言子楪世哲苏兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroid/animation/ArgbEvaluator;


# direct methods
.method public synthetic constructor <init>(Landroid/animation/ArgbEvaluator;L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;Landroid/graphics/drawable/GradientDrawable;L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏世兰哲;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/animation/ArgbEvaluator;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroid/graphics/drawable/GradientDrawable;

    .line 11
    .line 12
    iput-object p6, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/TextView;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 7

    .line 1
    const/16 v0, 0xa9f

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object v0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    iget v1, v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    iget v3, v2, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 24
    .line 25
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/animation/ArgbEvaluator;

    .line 30
    .line 31
    invoke-virtual {v4, p1, v1, v3}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/16 v3, 0x74a

    .line 36
    .line 37
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget v5, v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 50
    .line 51
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget v6, v2, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 56
    .line 57
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v4, p1, v5, v6}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v5, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    iget v0, v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 78
    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget v2, v2, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 84
    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v4, p1, v0, v2}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    check-cast p1, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iget-object v0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroid/graphics/drawable/GradientDrawable;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/TextView;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    const/16 v2, 0x51d

    .line 117
    .line 118
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 133
    .line 134
    const/high16 v2, 0x3f800000    # 1.0f

    .line 135
    .line 136
    mul-float/2addr v2, v1

    .line 137
    float-to-int v1, v2

    .line 138
    const/4 v2, 0x1

    .line 139
    if-ge v1, v2, :cond_0

    .line 140
    .line 141
    move v1, v2

    .line 142
    :cond_0
    invoke-virtual {v0, v1, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 146
    .line 147
    .line 148
    return-void
.end method
