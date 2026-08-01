.class public final Lo00;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Α:[I

.field public static final ω:[I


# instance fields
.field public final α:I

.field public final β:Landroid/graphics/drawable/StateListDrawable;

.field public final γ:Landroid/graphics/drawable/Drawable;

.field public final δ:I

.field public final ε:I

.field public final ζ:Landroid/graphics/drawable/StateListDrawable;

.field public final η:Landroid/graphics/drawable/Drawable;

.field public final θ:I

.field public final ι:I

.field public κ:F

.field public λ:F

.field public μ:I

.field public ν:I

.field public final ξ:Landroidx/recyclerview/widget/RecyclerView;

.field public final ο:Z

.field public final π:Z

.field public ρ:I

.field public σ:I

.field public final τ:[I

.field public final υ:[I

.field public final φ:Landroid/animation/ValueAnimator;

.field public χ:I

.field public final ψ:Ld1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a7

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lo00;->ω:[I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    sput-object v0, Lo00;->Α:[I

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p7, 0x0

    .line 5
    iput p7, p0, Lo00;->μ:I

    .line 6
    .line 7
    iput p7, p0, Lo00;->ν:I

    .line 8
    .line 9
    iput-boolean p7, p0, Lo00;->ο:Z

    .line 10
    .line 11
    iput-boolean p7, p0, Lo00;->π:Z

    .line 12
    .line 13
    iput p7, p0, Lo00;->ρ:I

    .line 14
    .line 15
    iput p7, p0, Lo00;->σ:I

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    new-array v1, v0, [I

    .line 19
    .line 20
    iput-object v1, p0, Lo00;->τ:[I

    .line 21
    .line 22
    new-array v1, v0, [I

    .line 23
    .line 24
    iput-object v1, p0, Lo00;->υ:[I

    .line 25
    .line 26
    new-array v1, v0, [F

    .line 27
    .line 28
    fill-array-data v1, :array_0

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Lo00;->φ:Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    iput p7, p0, Lo00;->χ:I

    .line 38
    .line 39
    new-instance v2, Ld1;

    .line 40
    .line 41
    const/4 v3, 0x5

    .line 42
    invoke-direct {v2, v3, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lo00;->ψ:Ld1;

    .line 46
    .line 47
    new-instance v3, Ll00;

    .line 48
    .line 49
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Lo00;->β:Landroid/graphics/drawable/StateListDrawable;

    .line 53
    .line 54
    iput-object p3, p0, Lo00;->γ:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    iput-object p4, p0, Lo00;->ζ:Landroid/graphics/drawable/StateListDrawable;

    .line 57
    .line 58
    iput-object p5, p0, Lo00;->η:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-static {p6, v4}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iput v4, p0, Lo00;->δ:I

    .line 69
    .line 70
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-static {p6, v4}, Ljava/lang/Math;->max(II)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    iput v4, p0, Lo00;->ε:I

    .line 79
    .line 80
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    iput p4, p0, Lo00;->θ:I

    .line 89
    .line 90
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    iput p4, p0, Lo00;->ι:I

    .line 99
    .line 100
    iput p8, p0, Lo00;->α:I

    .line 101
    .line 102
    const/16 p4, 0xff

    .line 103
    .line 104
    invoke-virtual {p2, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 108
    .line 109
    .line 110
    new-instance p2, Lm00;

    .line 111
    .line 112
    invoke-direct {p2, p7, p0}, Lm00;-><init>(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 116
    .line 117
    .line 118
    new-instance p2, Ln00;

    .line 119
    .line 120
    invoke-direct {p2, p0}, Ln00;-><init>(Lo00;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 124
    .line 125
    .line 126
    iget-object p2, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    if-ne p2, p1, :cond_0

    .line 129
    .line 130
    return-void

    .line 131
    :cond_0
    if-eqz p2, :cond_6

    .line 132
    .line 133
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 134
    .line 135
    iget-object p4, p2, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 136
    .line 137
    if-eqz p4, :cond_1

    .line 138
    .line 139
    const-string p5, "Cannot remove item decoration during a scroll  or layout"

    .line 140
    .line 141
    invoke-virtual {p4, p5}, Lzl1;->β(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    if-eqz p3, :cond_3

    .line 152
    .line 153
    invoke-virtual {p2}, Landroid/view/View;->getOverScrollMode()I

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    if-ne p3, v0, :cond_2

    .line 158
    .line 159
    const/4 p3, 0x1

    .line 160
    goto :goto_0

    .line 161
    :cond_2
    move p3, p7

    .line 162
    :goto_0
    invoke-virtual {p2, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 163
    .line 164
    .line 165
    :cond_3
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->υ()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 169
    .line 170
    .line 171
    iget-object p2, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 172
    .line 173
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->ρ:Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->σ:Lo00;

    .line 179
    .line 180
    if-ne p3, p0, :cond_4

    .line 181
    .line 182
    const/4 p3, 0x0

    .line 183
    iput-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->σ:Lo00;

    .line 184
    .line 185
    :cond_4
    iget-object p2, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 186
    .line 187
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->е:Ljava/util/ArrayList;

    .line 188
    .line 189
    if-eqz p2, :cond_5

    .line 190
    .line 191
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_5
    iget-object p2, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 195
    .line 196
    invoke-virtual {p2, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 197
    .line 198
    .line 199
    :cond_6
    iput-object p1, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 200
    .line 201
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 202
    .line 203
    iget-object p3, p1, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 204
    .line 205
    if-eqz p3, :cond_7

    .line 206
    .line 207
    const-string p4, "Cannot add item decoration during a scroll  or layout"

    .line 208
    .line 209
    invoke-virtual {p3, p4}, Lzl1;->β(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :cond_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result p3

    .line 216
    if-eqz p3, :cond_8

    .line 217
    .line 218
    invoke-virtual {p1, p7}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 219
    .line 220
    .line 221
    :cond_8
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->υ()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 228
    .line 229
    .line 230
    iget-object p1, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 231
    .line 232
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->ρ:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    iget-object p0, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 238
    .line 239
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->е:Ljava/util/ArrayList;

    .line 240
    .line 241
    if-nez p1, :cond_9

    .line 242
    .line 243
    new-instance p1, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->е:Ljava/util/ArrayList;

    .line 249
    .line 250
    :cond_9
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->е:Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    nop

    .line 257
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static γ(FF[IIII)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    aget v0, p2, v0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aget p2, p2, v1

    .line 6
    .line 7
    sub-int/2addr v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sub-float/2addr p1, p0

    .line 12
    int-to-float p0, v0

    .line 13
    div-float/2addr p1, p0

    .line 14
    sub-int/2addr p3, p5

    .line 15
    int-to-float p0, p3

    .line 16
    mul-float/2addr p1, p0

    .line 17
    float-to-int p0, p1

    .line 18
    add-int/2addr p4, p0

    .line 19
    if-ge p4, p3, :cond_1

    .line 20
    .line 21
    if-ltz p4, :cond_1

    .line 22
    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public final α(FF)Z
    .locals 1

    .line 1
    iget v0, p0, Lo00;->ν:I

    .line 2
    .line 3
    iget p0, p0, Lo00;->θ:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    int-to-float p0, v0

    .line 7
    cmpl-float p0, p2, p0

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    if-ltz p0, :cond_0

    .line 11
    .line 12
    int-to-float p0, p2

    .line 13
    cmpl-float p0, p1, p0

    .line 14
    .line 15
    if-ltz p0, :cond_0

    .line 16
    .line 17
    int-to-float p0, p2

    .line 18
    cmpg-float p0, p1, p0

    .line 19
    .line 20
    if-gtz p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    return p2
.end method

.method public final β(FF)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    iget v2, p0, Lo00;->δ:I

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    .line 13
    int-to-float p0, v2

    .line 14
    cmpg-float p0, p1, p0

    .line 15
    .line 16
    if-gtz p0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget p0, p0, Lo00;->μ:I

    .line 20
    .line 21
    sub-int/2addr p0, v2

    .line 22
    int-to-float p0, p0

    .line 23
    cmpl-float p0, p1, p0

    .line 24
    .line 25
    if-ltz p0, :cond_1

    .line 26
    .line 27
    :goto_0
    int-to-float p0, v1

    .line 28
    cmpl-float p0, p2, p0

    .line 29
    .line 30
    if-ltz p0, :cond_1

    .line 31
    .line 32
    int-to-float p0, v1

    .line 33
    cmpg-float p0, p2, p0

    .line 34
    .line 35
    if-gtz p0, :cond_1

    .line 36
    .line 37
    return v3

    .line 38
    :cond_1
    return v1
.end method

.method public final δ(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo00;->ψ:Ld1;

    .line 2
    .line 3
    iget-object v1, p0, Lo00;->β:Landroid/graphics/drawable/StateListDrawable;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne p1, v2, :cond_0

    .line 7
    .line 8
    iget v3, p0, Lo00;->ρ:I

    .line 9
    .line 10
    if-eq v3, v2, :cond_0

    .line 11
    .line 12
    sget-object v3, Lo00;->ω:[I

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object v3, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Lo00;->ε()V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget v3, p0, Lo00;->ρ:I

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    if-eq p1, v2, :cond_2

    .line 38
    .line 39
    sget-object v2, Lo00;->Α:[I

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    const/16 v2, 0x4b0

    .line 52
    .line 53
    int-to-long v2, v2

    .line 54
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 v1, 0x1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    iget-object v1, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    const/16 v2, 0x5dc

    .line 69
    .line 70
    int-to-long v2, v2

    .line 71
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_1
    iput p1, p0, Lo00;->ρ:I

    .line 75
    .line 76
    return-void
.end method

.method public final ε()V
    .locals 4

    .line 1
    iget v0, p0, Lo00;->χ:I

    .line 2
    .line 3
    iget-object v1, p0, Lo00;->φ:Landroid/animation/ValueAnimator;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 12
    .line 13
    .line 14
    :cond_1
    const/4 v0, 0x1

    .line 15
    iput v0, p0, Lo00;->χ:I

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/4 v2, 0x2

    .line 28
    new-array v2, v2, [F

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    aput p0, v2, v3

    .line 32
    .line 33
    const/high16 p0, 0x3f800000    # 1.0f

    .line 34
    .line 35
    aput p0, v2, v0

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v2, 0x1f4

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 51
    .line 52
    .line 53
    return-void
.end method
