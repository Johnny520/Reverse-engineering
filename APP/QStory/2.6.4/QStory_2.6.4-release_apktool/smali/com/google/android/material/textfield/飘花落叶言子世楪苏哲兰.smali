.class public final Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;FFI)V
    .locals 0

    .line 9
    iput p4, p0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Float;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    .line 20
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲子世苏兰/飘花落叶言子楪苏兰世哲;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲(F)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    check-cast p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏楪哲兰;

    .line 29
    .line 30
    iget-object p0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;

    .line 31
    .line 32
    iget-object v0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;->飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-boolean p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Landroid/widget/LinearLayout;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

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
    if-eqz p0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/view/View;->setY(F)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    return-void

    .line 71
    :pswitch_1
    check-cast p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏楪哲兰;

    .line 72
    .line 73
    iget-object p0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;

    .line 74
    .line 75
    iget-object v0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;->飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    iget-boolean p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 80
    .line 81
    if-nez p0, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    iget-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Landroid/widget/LinearLayout;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/lang/Float;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p0, :cond_6

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Landroid/view/View;->setY(F)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    :goto_2
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 111
    .line 112
    .line 113
    :cond_6
    :goto_3
    return-void

    .line 114
    :pswitch_2
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Ljava/lang/Float;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    check-cast p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;

    .line 125
    .line 126
    iget-object p0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰世哲苏;

    .line 129
    .line 130
    iget-object v0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 131
    .line 132
    invoke-virtual {v0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪世苏哲兰(F)V

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x3f800000    # 1.0f

    .line 136
    .line 137
    cmpl-float p1, p1, v0

    .line 138
    .line 139
    if-eqz p1, :cond_7

    .line 140
    .line 141
    const/4 p1, 0x1

    .line 142
    goto :goto_4

    .line 143
    :cond_7
    const/4 p1, 0x0

    .line 144
    :goto_4
    iput-boolean p1, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:Z

    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Ljava/lang/Float;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    check-cast p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰世哲苏;

    .line 158
    .line 159
    iget-object p0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子楪世苏哲兰(F)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_4
    check-cast p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;

    .line 166
    .line 167
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Ljava/lang/Float;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰:F

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_5
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, Ljava/lang/Float;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    check-cast p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 194
    .line 195
    sget v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子世楪哲苏兰:I

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    mul-float/2addr p1, v0

    .line 199
    add-float/2addr p1, v0

    .line 200
    float-to-long v0, p1

    .line 201
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲兰苏世;

    .line 202
    .line 203
    if-eqz p0, :cond_8

    .line 204
    .line 205
    long-to-float p1, v0

    .line 206
    invoke-virtual {p0, p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(F)V

    .line 207
    .line 208
    .line 209
    :cond_8
    return-void

    .line 210
    :pswitch_6
    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 211
    .line 212
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子哲苏世楪兰:Lcom/google/android/material/internal/飘花落叶言子楪世兰苏哲;

    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Ljava/lang/Float;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(F)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
