.class public final Lcom/google/android/material/bottomappbar/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/bottomappbar/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/bottomappbar/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/google/android/material/bottomappbar/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 p4, 0x0

    .line 4
    iget-object p6, p0, Lcom/google/android/material/bottomappbar/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p6, Lcom/lihang/ShadowLayout;

    .line 10
    .line 11
    invoke-virtual {p6, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p6}, Landroid/view/View;->isSelected()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {p6, p0}, Lcom/lihang/ShadowLayout;->setSelected(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 23
    .line 24
    iget-object p0, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 25
    .line 26
    iget-object p1, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 27
    .line 28
    sub-int/2addr p9, p7

    .line 29
    sub-int/2addr p5, p3

    .line 30
    if-eq p9, p5, :cond_2

    .line 31
    .line 32
    iget-boolean p2, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:Z

    .line 33
    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getFitSystemBarUtils()Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-boolean p2, p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 41
    .line 42
    if-nez p2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p6}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getSafeHeight()F

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget-object p3, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世:Landroid/graphics/Rect;

    .line 52
    .line 53
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 54
    .line 55
    int-to-float p3, p3

    .line 56
    sub-float/2addr p2, p3

    .line 57
    iget p3, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰:I

    .line 58
    .line 59
    int-to-float p3, p3

    .line 60
    sub-float/2addr p2, p3

    .line 61
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 66
    .line 67
    int-to-float p1, p1

    .line 68
    sub-float/2addr p2, p1

    .line 69
    const/4 p1, 0x0

    .line 70
    cmpg-float p3, p2, p1

    .line 71
    .line 72
    if-gez p3, :cond_0

    .line 73
    .line 74
    move p2, p1

    .line 75
    :cond_0
    iget p3, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 76
    .line 77
    cmpl-float p3, p2, p3

    .line 78
    .line 79
    if-eqz p3, :cond_1

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    cmpl-float p3, p3, p2

    .line 86
    .line 87
    if-eqz p3, :cond_1

    .line 88
    .line 89
    iget p0, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 90
    .line 91
    iput p2, p6, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 92
    .line 93
    float-to-int p0, p0

    .line 94
    float-to-int p1, p2

    .line 95
    const/4 p2, 0x1

    .line 96
    invoke-virtual {p6, p0, p1, p2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(IIZ)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    cmpl-float p3, p3, p2

    .line 105
    .line 106
    if-eqz p3, :cond_2

    .line 107
    .line 108
    cmpl-float p1, p2, p1

    .line 109
    .line 110
    if-eqz p1, :cond_2

    .line 111
    .line 112
    invoke-virtual {p0, p2}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setY(F)V

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_0
    return-void

    .line 116
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p6, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;

    .line 125
    .line 126
    iget-object p1, p6, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 129
    .line 130
    if-eqz p0, :cond_3

    .line 131
    .line 132
    sget p2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏哲楪兰:I

    .line 133
    .line 134
    invoke-static {p4, p0}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪苏世兰哲(Landroid/view/View;Landroid/view/WindowInsets;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    new-instance p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 139
    .line 140
    iget-object p3, p6, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p3, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 143
    .line 144
    invoke-direct {p2, p3}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, p0, p2}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/core/view/飘花落叶言子哲兰世苏楪;Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    sget p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏哲楪兰:I

    .line 152
    .line 153
    :goto_1
    return-void

    .line 154
    :pswitch_2
    throw p4

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
