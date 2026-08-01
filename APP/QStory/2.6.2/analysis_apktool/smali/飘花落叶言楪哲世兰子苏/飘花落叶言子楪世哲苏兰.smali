.class public final L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世哲苏兰;
.super Landroid/view/ViewOutlineProvider;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 12

    .line 1
    iget v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/google/android/material/chip/Chip;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/android/material/chip/Chip;->飘花落叶言子楪兰世哲苏:L飘花落叶言楪苏世哲子兰/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p2}, L飘花落叶言楪苏世哲子兰/飘花落叶言子楪世苏兰哲;->getOutline(Landroid/graphics/Outline;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    invoke-virtual {p2, p0}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 32
    .line 33
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 34
    .line 35
    iget v5, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲:F

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    move-object v0, p2

    .line 40
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    move-object v6, p2

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 58
    .line 59
    iget v11, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子世兰哲苏楪:F

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    move-object v6, p2

    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;

    .line 77
    .line 78
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 79
    .line 80
    iget v11, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪兰哲世:F

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_3
    move-object v6, p2

    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    int-to-float p1, p1

    .line 98
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 99
    .line 100
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 101
    .line 102
    iget v11, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰楪苏哲:F

    .line 103
    .line 104
    add-float/2addr p1, v11

    .line 105
    float-to-int v10, p1

    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_4
    move-object v6, p2

    .line 113
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    int-to-float p1, p1

    .line 122
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;

    .line 123
    .line 124
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 125
    .line 126
    iget v11, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪哲世兰:F

    .line 127
    .line 128
    add-float/2addr p1, v11

    .line 129
    float-to-int v10, p1

    .line 130
    const/4 v7, 0x0

    .line 131
    const/4 v8, 0x0

    .line 132
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
