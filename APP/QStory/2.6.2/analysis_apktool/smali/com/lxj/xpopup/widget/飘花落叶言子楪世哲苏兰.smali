.class public final Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;
.super Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:[I


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x1010214

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Rect;

    .line 10
    .line 11
    sget-object v0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:[I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const-string v0, "DividerItem"

    .line 27
    .line 28
    const-string v1, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()"

    .line 29
    .line 30
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput p1, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p3, p3, p3, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    const/4 p4, 0x1

    .line 13
    if-ne p0, p4, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-virtual {p1, p3, p3, p3, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {p1, p3, p3, p0, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    iget v2, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 16
    .line 17
    iget-object v3, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Rect;

    .line 18
    .line 19
    if-ne v2, v1, :cond_4

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getClipToPadding()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/view/View;->getPaddingStart()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p2}, Landroid/view/View;->getPaddingEnd()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    sub-int/2addr v2, v4

    .line 43
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    sub-int/2addr v5, v6

    .line 56
    invoke-virtual {p1, v1, v4, v2, v5}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    move v1, v0

    .line 65
    :goto_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    :goto_1
    if-ge v0, v4, :cond_3

    .line 70
    .line 71
    add-int/lit8 v5, v4, -0x1

    .line 72
    .line 73
    if-ne v0, v5, :cond_2

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰苏楪(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    iget v6, v3, Landroid/graphics/Rect;->bottom:I

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/view/View;->getTranslationY()F

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    add-int/2addr v5, v6

    .line 94
    iget-object v6, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 95
    .line 96
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    sub-int v6, v5, v6

    .line 101
    .line 102
    iget-object v7, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 103
    .line 104
    invoke-virtual {v7, v1, v6, v2, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 105
    .line 106
    .line 107
    iget-object v5, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 108
    .line 109
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v0, v0, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getClipToPadding()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    sub-int/2addr v2, v4

    .line 141
    invoke-virtual {p2}, Landroid/view/View;->getPaddingStart()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-virtual {p2}, Landroid/view/View;->getPaddingEnd()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    sub-int/2addr v5, v6

    .line 154
    invoke-virtual {p1, v4, v1, v5, v2}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    move v1, v0

    .line 163
    :goto_3
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    :goto_4
    if-ge v0, v4, :cond_7

    .line 168
    .line 169
    add-int/lit8 v5, v4, -0x1

    .line 170
    .line 171
    if-ne v0, v5, :cond_6

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_6
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-virtual {v6, v3, v5}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世哲楪兰苏(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 183
    .line 184
    .line 185
    iget v6, v3, Landroid/graphics/Rect;->right:I

    .line 186
    .line 187
    invoke-virtual {v5}, Landroid/view/View;->getTranslationX()F

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    add-int/2addr v5, v6

    .line 196
    iget-object v6, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 197
    .line 198
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    sub-int v6, v5, v6

    .line 203
    .line 204
    iget-object v7, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 205
    .line 206
    invoke-virtual {v7, v6, v1, v5, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 207
    .line 208
    .line 209
    iget-object v5, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 210
    .line 211
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 212
    .line 213
    .line 214
    add-int/lit8 v0, v0, 0x1

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_7
    :goto_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 218
    .line 219
    .line 220
    :cond_8
    :goto_6
    return-void
.end method
