.class public final Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;

    .line 9
    .line 10
    iget-object p0, v1, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰哲苏世:Landroidx/appcompat/widget/飘花落叶言子哲兰世苏楪;

    .line 11
    .line 12
    invoke-virtual {v1}, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-boolean v0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲苏兰楪:Z

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, v1, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪兰苏哲:Landroid/view/View;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->show()V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    invoke-virtual {v1}, L飘花落叶言子楪苏兰世哲/飘花落叶言子世楪哲苏兰;->dismiss()V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_1
    return-void

    .line 41
    :pswitch_0
    check-cast v1, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;

    .line 42
    .line 43
    iget-object p0, v1, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲苏世:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v1}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-lez v0, :cond_5

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲苏兰;

    .line 63
    .line 64
    iget-object v0, v0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲兰世苏楪;

    .line 65
    .line 66
    iget-boolean v0, v0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲苏兰楪:Z

    .line 67
    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    iget-object v0, v1, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏楪哲兰:Landroid/view/View;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲苏兰;

    .line 96
    .line 97
    iget-object v0, v0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲兰世苏楪;

    .line 98
    .line 99
    invoke-virtual {v0}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->show()V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    :goto_3
    invoke-virtual {v1}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪世哲兰苏;->dismiss()V

    .line 104
    .line 105
    .line 106
    :cond_5
    return-void

    .line 107
    :pswitch_1
    check-cast v1, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;

    .line 108
    .line 109
    iget-object p0, v1, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子世兰哲苏楪:Landroidx/appcompat/widget/飘花落叶言子苏楪世兰哲;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget-object v0, v1, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子世兰苏哲楪:Landroid/graphics/Rect;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_6

    .line 124
    .line 125
    invoke-virtual {v1}, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->show()V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_6
    invoke-virtual {v1}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->dismiss()V

    .line 133
    .line 134
    .line 135
    :goto_4
    return-void

    .line 136
    :pswitch_2
    check-cast v1, Landroidx/appcompat/widget/飘花落叶言子苏楪世兰哲;

    .line 137
    .line 138
    invoke-virtual {v1}, Landroidx/appcompat/widget/飘花落叶言子苏楪世兰哲;->getInternalPopup()Landroidx/appcompat/widget/飘花落叶言子苏楪世哲兰;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {v0}, Landroidx/appcompat/widget/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_7

    .line 147
    .line 148
    iget-object v0, v1, Landroidx/appcompat/widget/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/widget/飘花落叶言子苏楪世哲兰;

    .line 149
    .line 150
    invoke-virtual {v1}, Landroid/view/View;->getTextDirection()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {v1}, Landroid/view/View;->getTextAlignment()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    invoke-interface {v0, v2, v3}, Landroidx/appcompat/widget/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰世哲(II)V

    .line 159
    .line 160
    .line 161
    :cond_7
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 168
    .line 169
    .line 170
    :cond_8
    return-void

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
