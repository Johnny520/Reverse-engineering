.class public Landroidx/appcompat/widget/θ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lew1;


# instance fields
.field public final Α:Landroid/os/Handler;

.field public final Β:Landroid/graphics/Rect;

.field public Γ:Landroid/graphics/Rect;

.field public Δ:Z

.field public final Ε:Lm5;

.field public final ε:Landroid/content/Context;

.field public ζ:Landroid/widget/ListAdapter;

.field public η:Landroidx/appcompat/widget/DropDownListView;

.field public final θ:I

.field public ι:I

.field public κ:I

.field public λ:I

.field public final μ:I

.field public ν:Z

.field public ξ:Z

.field public ο:Z

.field public π:I

.field public final ρ:I

.field public σ:Lrq;

.field public τ:Landroid/view/View;

.field public υ:Landroid/widget/AdapterView$OnItemClickListener;

.field public final φ:Ld1;

.field public final χ:Lgu0;

.field public final ψ:Lfu0;

.field public final ω:Landroidx/appcompat/widget/ε;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p4, -0x2

    .line 5
    iput p4, p0, Landroidx/appcompat/widget/θ;->θ:I

    .line 6
    .line 7
    iput p4, p0, Landroidx/appcompat/widget/θ;->ι:I

    .line 8
    .line 9
    const/16 p4, 0x3ea

    .line 10
    .line 11
    iput p4, p0, Landroidx/appcompat/widget/θ;->μ:I

    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    iput p4, p0, Landroidx/appcompat/widget/θ;->π:I

    .line 15
    .line 16
    const v0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v0, p0, Landroidx/appcompat/widget/θ;->ρ:I

    .line 20
    .line 21
    new-instance v0, Ld1;

    .line 22
    .line 23
    const/4 v1, 0x7

    .line 24
    invoke-direct {v0, v1, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->φ:Ld1;

    .line 28
    .line 29
    new-instance v0, Lgu0;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lgu0;-><init>(Landroidx/appcompat/widget/θ;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->χ:Lgu0;

    .line 35
    .line 36
    new-instance v0, Lfu0;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lfu0;-><init>(Landroidx/appcompat/widget/θ;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->ψ:Lfu0;

    .line 42
    .line 43
    new-instance v0, Landroidx/appcompat/widget/ε;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v0, v1, p0}, Landroidx/appcompat/widget/ε;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->ω:Landroidx/appcompat/widget/ε;

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->Β:Landroid/graphics/Rect;

    .line 57
    .line 58
    iput-object p1, p0, Landroidx/appcompat/widget/θ;->ε:Landroid/content/Context;

    .line 59
    .line 60
    new-instance v0, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->Α:Landroid/os/Handler;

    .line 70
    .line 71
    sget-object v0, Lkk1;->π:[I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, p4, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iput v2, p0, Landroidx/appcompat/widget/θ;->κ:I

    .line 82
    .line 83
    invoke-virtual {v0, v1, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iput v2, p0, Landroidx/appcompat/widget/θ;->λ:I

    .line 88
    .line 89
    if-eqz v2, :cond_0

    .line 90
    .line 91
    iput-boolean v1, p0, Landroidx/appcompat/widget/θ;->ν:Z

    .line 92
    .line 93
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 94
    .line 95
    .line 96
    new-instance v0, Lm5;

    .line 97
    .line 98
    invoke-direct {v0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 99
    .line 100
    .line 101
    sget-object v2, Lkk1;->υ:[I

    .line 102
    .line 103
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    const/4 p3, 0x2

    .line 108
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_1

    .line 113
    .line 114
    invoke-virtual {p2, p3, p4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    invoke-virtual {v0, p3}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 119
    .line 120
    .line 121
    :cond_1
    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    if-eqz p3, :cond_2

    .line 126
    .line 127
    invoke-virtual {p2, p4, p4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    if-eqz p3, :cond_2

    .line 132
    .line 133
    invoke-static {p1, p3}, Lln0;->Κ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    goto :goto_0

    .line 138
    :cond_2
    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 151
    .line 152
    .line 153
    return-void
.end method


# virtual methods
.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->Α:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->φ:Ld1;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public α(Landroid/content/Context;Z)Landroidx/appcompat/widget/DropDownListView;
    .locals 0

    .line 1
    new-instance p0, Landroidx/appcompat/widget/DropDownListView;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/DropDownListView;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final β()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final γ()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/θ;->κ:I

    .line 2
    .line 3
    return p0
.end method

.method public final δ()V
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/θ;->ε:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Landroidx/appcompat/widget/θ;->Δ:Z

    .line 11
    .line 12
    xor-int/2addr v0, v2

    .line 13
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/θ;->α(Landroid/content/Context;Z)Landroidx/appcompat/widget/DropDownListView;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 18
    .line 19
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->ζ:Landroid/widget/ListAdapter;

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 25
    .line 26
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->υ:Landroid/widget/AdapterView$OnItemClickListener;

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 42
    .line 43
    new-instance v4, Landroidx/appcompat/widget/η;

    .line 44
    .line 45
    invoke-direct {v4, p0}, Landroidx/appcompat/widget/η;-><init>(Landroidx/appcompat/widget/θ;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 52
    .line 53
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->ψ:Lfu0;

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Landroid/view/ViewGroup;

    .line 69
    .line 70
    :goto_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->Β:Landroid/graphics/Rect;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 80
    .line 81
    .line 82
    iget v0, v4, Landroid/graphics/Rect;->top:I

    .line 83
    .line 84
    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    .line 85
    .line 86
    add-int/2addr v6, v0

    .line 87
    iget-boolean v7, p0, Landroidx/appcompat/widget/θ;->ν:Z

    .line 88
    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    neg-int v0, v0

    .line 92
    iput v0, p0, Landroidx/appcompat/widget/θ;->λ:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 96
    .line 97
    .line 98
    move v6, v5

    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v7, 0x2

    .line 104
    if-ne v0, v7, :cond_3

    .line 105
    .line 106
    move v0, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move v0, v5

    .line 109
    :goto_2
    iget-object v8, p0, Landroidx/appcompat/widget/θ;->τ:Landroid/view/View;

    .line 110
    .line 111
    iget v9, p0, Landroidx/appcompat/widget/θ;->λ:I

    .line 112
    .line 113
    invoke-static {v3, v8, v9, v0}, Ldu0;->α(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget v8, p0, Landroidx/appcompat/widget/θ;->θ:I

    .line 118
    .line 119
    const/4 v9, -0x2

    .line 120
    const/4 v10, -0x1

    .line 121
    if-ne v8, v10, :cond_4

    .line 122
    .line 123
    add-int/2addr v0, v6

    .line 124
    goto :goto_5

    .line 125
    :cond_4
    iget v11, p0, Landroidx/appcompat/widget/θ;->ι:I

    .line 126
    .line 127
    if-eq v11, v9, :cond_6

    .line 128
    .line 129
    const/high16 v12, 0x40000000    # 2.0f

    .line 130
    .line 131
    if-eq v11, v10, :cond_5

    .line 132
    .line 133
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    goto :goto_3

    .line 138
    :cond_5
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 147
    .line 148
    iget v11, v4, Landroid/graphics/Rect;->left:I

    .line 149
    .line 150
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 151
    .line 152
    add-int/2addr v11, v4

    .line 153
    sub-int/2addr v1, v11

    .line 154
    invoke-static {v1, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 168
    .line 169
    iget v11, v4, Landroid/graphics/Rect;->left:I

    .line 170
    .line 171
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 172
    .line 173
    add-int/2addr v11, v4

    .line 174
    sub-int/2addr v1, v11

    .line 175
    const/high16 v4, -0x80000000

    .line 176
    .line 177
    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    :goto_3
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 182
    .line 183
    invoke-virtual {v4, v1, v0}, Landroidx/appcompat/widget/DropDownListView;->α(II)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-lez v0, :cond_7

    .line 188
    .line 189
    iget-object v1, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 196
    .line 197
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    add-int/2addr v4, v1

    .line 202
    add-int/2addr v4, v6

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move v4, v5

    .line 205
    :goto_4
    add-int/2addr v0, v4

    .line 206
    :goto_5
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-ne v1, v7, :cond_8

    .line 211
    .line 212
    move v1, v2

    .line 213
    goto :goto_6

    .line 214
    :cond_8
    move v1, v5

    .line 215
    :goto_6
    iget v4, p0, Landroidx/appcompat/widget/θ;->μ:I

    .line 216
    .line 217
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_14

    .line 225
    .line 226
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->τ:Landroid/view/View;

    .line 227
    .line 228
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-nez v4, :cond_9

    .line 233
    .line 234
    goto/16 :goto_e

    .line 235
    .line 236
    :cond_9
    iget v4, p0, Landroidx/appcompat/widget/θ;->ι:I

    .line 237
    .line 238
    if-ne v4, v10, :cond_a

    .line 239
    .line 240
    move v4, v10

    .line 241
    goto :goto_7

    .line 242
    :cond_a
    if-ne v4, v9, :cond_b

    .line 243
    .line 244
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->τ:Landroid/view/View;

    .line 245
    .line 246
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    :cond_b
    :goto_7
    if-ne v8, v10, :cond_10

    .line 251
    .line 252
    if-eqz v1, :cond_c

    .line 253
    .line 254
    move v8, v0

    .line 255
    goto :goto_8

    .line 256
    :cond_c
    move v8, v10

    .line 257
    :goto_8
    iget v0, p0, Landroidx/appcompat/widget/θ;->ι:I

    .line 258
    .line 259
    if-eqz v1, :cond_e

    .line 260
    .line 261
    if-ne v0, v10, :cond_d

    .line 262
    .line 263
    move v0, v10

    .line 264
    goto :goto_9

    .line 265
    :cond_d
    move v0, v5

    .line 266
    :goto_9
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_e
    if-ne v0, v10, :cond_f

    .line 274
    .line 275
    move v5, v10

    .line 276
    :cond_f
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 280
    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_10
    if-ne v8, v9, :cond_11

    .line 284
    .line 285
    move v8, v0

    .line 286
    :cond_11
    :goto_a
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 287
    .line 288
    .line 289
    move v0, v4

    .line 290
    iget-object v4, p0, Landroidx/appcompat/widget/θ;->τ:Landroid/view/View;

    .line 291
    .line 292
    iget v5, p0, Landroidx/appcompat/widget/θ;->κ:I

    .line 293
    .line 294
    iget v6, p0, Landroidx/appcompat/widget/θ;->λ:I

    .line 295
    .line 296
    if-gez v0, :cond_12

    .line 297
    .line 298
    move v7, v10

    .line 299
    goto :goto_b

    .line 300
    :cond_12
    move v7, v0

    .line 301
    :goto_b
    if-gez v8, :cond_13

    .line 302
    .line 303
    move v8, v10

    .line 304
    :cond_13
    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_14
    iget v1, p0, Landroidx/appcompat/widget/θ;->ι:I

    .line 309
    .line 310
    if-ne v1, v10, :cond_15

    .line 311
    .line 312
    move v1, v10

    .line 313
    goto :goto_c

    .line 314
    :cond_15
    if-ne v1, v9, :cond_16

    .line 315
    .line 316
    iget-object v1, p0, Landroidx/appcompat/widget/θ;->τ:Landroid/view/View;

    .line 317
    .line 318
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    :cond_16
    :goto_c
    if-ne v8, v10, :cond_17

    .line 323
    .line 324
    move v8, v10

    .line 325
    goto :goto_d

    .line 326
    :cond_17
    if-ne v8, v9, :cond_18

    .line 327
    .line 328
    move v8, v0

    .line 329
    :cond_18
    :goto_d
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 333
    .line 334
    .line 335
    invoke-static {v3, v2}, Leu0;->β(Landroid/widget/PopupWindow;Z)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 339
    .line 340
    .line 341
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->χ:Lgu0;

    .line 342
    .line 343
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 344
    .line 345
    .line 346
    iget-boolean v0, p0, Landroidx/appcompat/widget/θ;->ο:Z

    .line 347
    .line 348
    if-eqz v0, :cond_19

    .line 349
    .line 350
    iget-boolean v0, p0, Landroidx/appcompat/widget/θ;->ξ:Z

    .line 351
    .line 352
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 353
    .line 354
    .line 355
    :cond_19
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->Γ:Landroid/graphics/Rect;

    .line 356
    .line 357
    invoke-static {v3, v0}, Leu0;->α(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 358
    .line 359
    .line 360
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->τ:Landroid/view/View;

    .line 361
    .line 362
    iget v1, p0, Landroidx/appcompat/widget/θ;->κ:I

    .line 363
    .line 364
    iget v4, p0, Landroidx/appcompat/widget/θ;->λ:I

    .line 365
    .line 366
    iget v5, p0, Landroidx/appcompat/widget/θ;->π:I

    .line 367
    .line 368
    invoke-virtual {v3, v0, v1, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 369
    .line 370
    .line 371
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 372
    .line 373
    invoke-virtual {v0, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 374
    .line 375
    .line 376
    iget-boolean v0, p0, Landroidx/appcompat/widget/θ;->Δ:Z

    .line 377
    .line 378
    if-eqz v0, :cond_1a

    .line 379
    .line 380
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 381
    .line 382
    invoke-virtual {v0}, Landroidx/appcompat/widget/DropDownListView;->isInTouchMode()Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-eqz v0, :cond_1b

    .line 387
    .line 388
    :cond_1a
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 389
    .line 390
    if-eqz v0, :cond_1b

    .line 391
    .line 392
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/DropDownListView;->setListSelectionHidden(Z)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 396
    .line 397
    .line 398
    :cond_1b
    iget-boolean v0, p0, Landroidx/appcompat/widget/θ;->Δ:Z

    .line 399
    .line 400
    if-nez v0, :cond_1c

    .line 401
    .line 402
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->Α:Landroid/os/Handler;

    .line 403
    .line 404
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->ω:Landroidx/appcompat/widget/ε;

    .line 405
    .line 406
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 407
    .line 408
    .line 409
    :cond_1c
    :goto_e
    return-void
.end method

.method public final ε()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final θ()Landroid/widget/ListView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ι(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final λ(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/θ;->λ:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/appcompat/widget/θ;->ν:Z

    .line 5
    .line 6
    return-void
.end method

.method public final ν(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/θ;->κ:I

    .line 2
    .line 3
    return-void
.end method

.method public final ο()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/θ;->ν:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget p0, p0, Landroidx/appcompat/widget/θ;->λ:I

    .line 8
    .line 9
    return p0
.end method

.method public ρ(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->σ:Lrq;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lrq;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Lrq;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/appcompat/widget/θ;->σ:Lrq;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/θ;->ζ:Landroid/widget/ListAdapter;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/appcompat/widget/θ;->ζ:Landroid/widget/ListAdapter;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->σ:Lrq;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/θ;->η:Landroidx/appcompat/widget/DropDownListView;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->ζ:Landroid/widget/ListAdapter;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
.end method

.method public final σ(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/appcompat/widget/θ;->Β:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Landroidx/appcompat/widget/θ;->ι:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/θ;->ι:I

    .line 24
    .line 25
    return-void
.end method
