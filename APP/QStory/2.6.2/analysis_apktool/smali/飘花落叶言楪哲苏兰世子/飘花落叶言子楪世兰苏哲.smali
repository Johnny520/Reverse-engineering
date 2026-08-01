.class public final L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世兰苏哲;
.super L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 7
    .line 8
    .line 9
    sget-object v1, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[I

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/lxj/xpopup/enums/PopupAnimation;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    aget p0, v1, p0

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eq p0, v1, :cond_3

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-eq p0, v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-eq p0, v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-eq p0, v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sub-int/2addr p0, v1

    .line 47
    int-to-float p0, p0

    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-float/2addr v1, p0

    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sub-int/2addr p0, v1

    .line 72
    int-to-float p0, p0

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-float/2addr v1, p0

    .line 78
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    neg-int p0, p0

    .line 87
    int-to-float p0, p0

    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-float/2addr v1, p0

    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    neg-int p0, p0

    .line 102
    int-to-float p0, p0

    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    add-float/2addr v1, p0

    .line 108
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 109
    .line 110
    .line 111
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 115
    .line 116
    .line 117
    return-void
.end method
