.class public final Ld;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Ld;->ζ:Ljava/lang/Object;

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
    iget v0, p0, Ld;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ld;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyz1;

    .line 9
    .line 10
    iget-object v0, p0, Lyz1;->μ:Landroidx/appcompat/widget/ι;

    .line 11
    .line 12
    invoke-virtual {p0}, Lyz1;->β()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-boolean v1, v0, Landroidx/appcompat/widget/θ;->Δ:Z

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lyz1;->ρ:Landroid/view/View;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/θ;->δ()V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lyz1;->dismiss()V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_1
    return-void

    .line 41
    :pswitch_0
    iget-object p0, p0, Ld;->ζ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lie;

    .line 44
    .line 45
    iget-object v0, p0, Lie;->μ:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p0}, Lie;->β()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_5

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lhe;

    .line 65
    .line 66
    iget-object v1, v1, Lhe;->α:Landroidx/appcompat/widget/ι;

    .line 67
    .line 68
    iget-boolean v1, v1, Landroidx/appcompat/widget/θ;->Δ:Z

    .line 69
    .line 70
    if-nez v1, :cond_5

    .line 71
    .line 72
    iget-object v1, p0, Lie;->τ:Landroid/view/View;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lhe;

    .line 98
    .line 99
    iget-object v0, v0, Lhe;->α:Landroidx/appcompat/widget/ι;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/appcompat/widget/θ;->δ()V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    :goto_3
    invoke-virtual {p0}, Lie;->dismiss()V

    .line 106
    .line 107
    .line 108
    :cond_5
    return-void

    .line 109
    :pswitch_1
    iget-object p0, p0, Ld;->ζ:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, Landroidx/appcompat/widget/δ;

    .line 112
    .line 113
    iget-object v0, p0, Landroidx/appcompat/widget/δ;->Κ:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_6

    .line 120
    .line 121
    iget-object v1, p0, Landroidx/appcompat/widget/δ;->Θ:Landroid/graphics/Rect;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    invoke-virtual {p0}, Landroidx/appcompat/widget/δ;->τ()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/appcompat/widget/θ;->δ()V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    invoke-virtual {p0}, Landroidx/appcompat/widget/θ;->dismiss()V

    .line 137
    .line 138
    .line 139
    :goto_4
    return-void

    .line 140
    :pswitch_2
    iget-object v0, p0, Ld;->ζ:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Landroidx/appcompat/widget/AppCompatSpinner;

    .line 143
    .line 144
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner;->getInternalPopup()Lx5;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {v1}, Lx5;->β()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_7

    .line 153
    .line 154
    iget-object v1, v0, Landroidx/appcompat/widget/AppCompatSpinner;->κ:Lx5;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-interface {v1, v2, v3}, Lx5;->ξ(II)V

    .line 165
    .line 166
    .line 167
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eqz v0, :cond_8

    .line 172
    .line 173
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    return-void

    .line 177
    :pswitch_3
    iget-object p0, p0, Ld;->ζ:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, Landroidx/appcompat/widget/ActivityChooserView;

    .line 180
    .line 181
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->β()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_a

    .line 186
    .line 187
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_9

    .line 192
    .line 193
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/θ;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {p0}, Landroidx/appcompat/widget/θ;->dismiss()V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/θ;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Landroidx/appcompat/widget/θ;->δ()V

    .line 206
    .line 207
    .line 208
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->λ:Lｘ;

    .line 209
    .line 210
    if-eqz p0, :cond_a

    .line 211
    .line 212
    iget-object p0, p0, Lｘ;->α:Landroidx/appcompat/widget/γ;

    .line 213
    .line 214
    if-eqz p0, :cond_a

    .line 215
    .line 216
    iget-object v0, p0, Landroidx/appcompat/widget/γ;->ι:Ltz0;

    .line 217
    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    iget-object p0, p0, Landroidx/appcompat/widget/γ;->η:Liz0;

    .line 221
    .line 222
    invoke-interface {v0, p0}, Ltz0;->λ(Liz0;)Z

    .line 223
    .line 224
    .line 225
    :cond_a
    :goto_5
    return-void

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
