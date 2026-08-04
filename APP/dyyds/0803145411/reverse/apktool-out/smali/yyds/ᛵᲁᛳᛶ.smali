.class public final synthetic Lyyds/ᛵᲁᛳᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᲁᲀᲁ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛵᲁᛳᛶ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᲈᲇᲀᛲ;I)V
    .locals 0

    .line 7
    iput p2, p0, Lyyds/ᛵᲁᛳᛶ;->ᛲᲈᲁ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget p0, p0, Lyyds/ᛵᲁᛳᛶ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const v1, 0x1010039

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0x11

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const v0, 0x66070054

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 28
    .line 29
    .line 30
    const v0, 0x66070053

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 45
    .line 46
    const/16 v5, 0x31

    .line 47
    .line 48
    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 49
    .line 50
    const v5, 0x66070052

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v5, Lyyds/ᲁᲀᛷᛶ;

    .line 68
    .line 69
    invoke-direct {v5, v0}, Lyyds/ᲁᲀᛷᛶ;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    .line 75
    const v5, 0x66070051

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    int-to-float v5, v5

    .line 83
    invoke-virtual {p1, v5}, Landroid/view/View;->setElevation(F)V

    .line 84
    .line 85
    .line 86
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 87
    .line 88
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, Lyyds/ᛲᛷᛵᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 105
    .line 106
    .line 107
    const v0, 0x66070057

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    int-to-float p0, p0

    .line 115
    invoke-virtual {p1, v3, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_0
    check-cast p1, Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const v0, 0x6607005a

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 143
    .line 144
    const/16 v5, 0x15

    .line 145
    .line 146
    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 147
    .line 148
    const v5, 0x66070059

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v5, Lyyds/ᛳᛸᲇᛸ;

    .line 166
    .line 167
    const v6, 0x66080058

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v6}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-direct {v5, v6}, Lyyds/ᲈᛸᛶᲁ;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 178
    .line 179
    .line 180
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 181
    .line 182
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v1}, Lyyds/ᛲᛷᛵᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 199
    .line 200
    .line 201
    const v0, 0x6607005b

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    int-to-float p0, p0

    .line 209
    invoke-virtual {p1, v3, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_1
    if-nez p1, :cond_0

    .line 214
    .line 215
    throw v0

    .line 216
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 217
    .line 218
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 219
    .line 220
    .line 221
    throw p0

    .line 222
    :pswitch_2
    if-nez p1, :cond_1

    .line 223
    .line 224
    throw v0

    .line 225
    :cond_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 226
    .line 227
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 228
    .line 229
    .line 230
    throw p0

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
