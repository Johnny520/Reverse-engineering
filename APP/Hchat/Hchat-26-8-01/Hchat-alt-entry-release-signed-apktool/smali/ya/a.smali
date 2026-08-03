.class public final Lya/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Lya/b;

.field public final c:F

.field public final d:F

.field public final e:Landroid/view/View;

.field public final f:Ljava/lang/Float;

.field public final g:F

.field public final h:F

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lya/b;FF)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lya/a;->a:Landroid/view/ViewGroup;

    .line 5
    .line 6
    iput-object p2, p0, Lya/a;->b:Lya/b;

    .line 7
    .line 8
    iput p3, p0, Lya/a;->c:F

    .line 9
    .line 10
    iput p4, p0, Lya/a;->d:F

    .line 11
    .line 12
    const/4 p3, 0x2

    .line 13
    new-array p3, p3, [I

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 16
    .line 17
    .line 18
    iget p4, p2, Lya/b;->e:I

    .line 19
    .line 20
    iget-object v0, p2, Lya/b;->q:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    iget-object v1, p2, Lya/b;->a:Landroid/view/View;

    .line 23
    .line 24
    iget-object v2, p2, Lya/b;->b:Landroid/view/View;

    .line 25
    .line 26
    iget v3, p2, Lya/b;->f:I

    .line 27
    .line 28
    iget v4, p2, Lya/b;->c:I

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    aget v5, p3, v5

    .line 32
    .line 33
    sub-int/2addr v4, v5

    .line 34
    iget v5, p2, Lya/b;->d:I

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    aget p3, p3, v6

    .line 38
    .line 39
    sub-int/2addr v5, p3

    .line 40
    iget-object p3, p2, Lya/b;->g:Ljava/lang/CharSequence;

    .line 41
    .line 42
    if-eqz p3, :cond_0

    .line 43
    .line 44
    new-instance v7, Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-direct {v7, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    iget p3, p2, Lya/b;->h:I

    .line 57
    .line 58
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 59
    .line 60
    .line 61
    iget p3, p2, Lya/b;->i:F

    .line 62
    .line 63
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    iget v8, v8, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 72
    .line 73
    div-float/2addr p3, v8

    .line 74
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 75
    .line 76
    .line 77
    iget-object p3, p2, Lya/b;->j:Landroid/graphics/Typeface;

    .line 78
    .line 79
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 80
    .line 81
    .line 82
    iget p3, p2, Lya/b;->k:I

    .line 83
    .line 84
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setGravity(I)V

    .line 85
    .line 86
    .line 87
    iget-boolean p3, p2, Lya/b;->l:Z

    .line 88
    .line 89
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 90
    .line 91
    .line 92
    iget p3, p2, Lya/b;->m:I

    .line 93
    .line 94
    iget v8, p2, Lya/b;->n:I

    .line 95
    .line 96
    iget v9, p2, Lya/b;->o:I

    .line 97
    .line 98
    iget p2, p2, Lya/b;->p:I

    .line 99
    .line 100
    invoke-virtual {v7, p3, v8, v9, p2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    new-instance v7, Landroid/view/View;

    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-direct {v7, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    if-eqz v2, :cond_1

    .line 120
    .line 121
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    goto :goto_1

    .line 126
    :cond_1
    const/high16 p2, 0x3f800000    # 1.0f

    .line 127
    .line 128
    :goto_1
    invoke-virtual {v7, p2}, Landroid/view/View;->setAlpha(F)V

    .line 129
    .line 130
    .line 131
    const/high16 p2, 0x40000000    # 2.0f

    .line 132
    .line 133
    invoke-static {p4, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    invoke-static {v3, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    invoke-virtual {v7, p3, p2}, Landroid/view/View;->measure(II)V

    .line 142
    .line 143
    .line 144
    add-int/2addr p4, v4

    .line 145
    add-int/2addr v3, v5

    .line 146
    invoke-virtual {v7, v4, v5, p4, v3}, Landroid/view/View;->layout(IIII)V

    .line 147
    .line 148
    .line 149
    const/4 p2, 0x0

    .line 150
    if-eqz v2, :cond_2

    .line 151
    .line 152
    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    .line 153
    .line 154
    .line 155
    move-result p3

    .line 156
    goto :goto_2

    .line 157
    :cond_2
    move p3, p2

    .line 158
    :goto_2
    invoke-virtual {v7, p3}, Landroid/view/View;->setTranslationX(F)V

    .line 159
    .line 160
    .line 161
    if-eqz v2, :cond_3

    .line 162
    .line 163
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    goto :goto_3

    .line 168
    :cond_3
    move p3, p2

    .line 169
    :goto_3
    invoke-virtual {v7, p3}, Landroid/view/View;->setTranslationY(F)V

    .line 170
    .line 171
    .line 172
    if-eqz v2, :cond_4

    .line 173
    .line 174
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    .line 175
    .line 176
    .line 177
    move-result p3

    .line 178
    goto :goto_4

    .line 179
    :cond_4
    move p3, p2

    .line 180
    :goto_4
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 181
    .line 182
    .line 183
    move-result-object p4

    .line 184
    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 185
    .line 186
    .line 187
    move-result-object p4

    .line 188
    const/high16 v0, 0x41000000    # 8.0f

    .line 189
    .line 190
    invoke-static {v6, v0, p4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 191
    .line 192
    .line 193
    move-result p4

    .line 194
    float-to-int p4, p4

    .line 195
    int-to-float p4, p4

    .line 196
    add-float/2addr p3, p4

    .line 197
    invoke-virtual {v7, p3}, Landroid/view/View;->setElevation(F)V

    .line 198
    .line 199
    .line 200
    iput-object v7, p0, Lya/a;->e:Landroid/view/View;

    .line 201
    .line 202
    if-eqz v2, :cond_5

    .line 203
    .line 204
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 205
    .line 206
    .line 207
    move-result p3

    .line 208
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    goto :goto_5

    .line 213
    :cond_5
    const/4 p3, 0x0

    .line 214
    :goto_5
    iput-object p3, p0, Lya/a;->f:Ljava/lang/Float;

    .line 215
    .line 216
    invoke-virtual {v7}, Landroid/view/View;->getTranslationX()F

    .line 217
    .line 218
    .line 219
    move-result p3

    .line 220
    iput p3, p0, Lya/a;->g:F

    .line 221
    .line 222
    invoke-virtual {v7}, Landroid/view/View;->getTranslationY()F

    .line 223
    .line 224
    .line 225
    move-result p3

    .line 226
    iput p3, p0, Lya/a;->h:F

    .line 227
    .line 228
    if-eqz v2, :cond_6

    .line 229
    .line 230
    invoke-virtual {v2, p2}, Landroid/view/View;->setAlpha(F)V

    .line 231
    .line 232
    .line 233
    :cond_6
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1, v7}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 238
    .line 239
    .line 240
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lya/a;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lya/a;->j:Z

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lya/a;->a:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lya/a;->e:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :catchall_0
    iget-object v0, p0, Lya/a;->f:Ljava/lang/Float;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lya/a;->b:Lya/b;

    .line 25
    .line 26
    iget-object v1, v1, Lya/b;->b:Landroid/view/View;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void
.end method

.method public final b(FF)V
    .locals 1

    .line 1
    iget v0, p0, Lya/a;->c:F

    .line 2
    .line 3
    sub-float/2addr p1, v0

    .line 4
    iget v0, p0, Lya/a;->d:F

    .line 5
    .line 6
    sub-float/2addr p2, v0

    .line 7
    iget v0, p0, Lya/a;->g:F

    .line 8
    .line 9
    add-float/2addr v0, p1

    .line 10
    iget-object p1, p0, Lya/a;->e:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lya/a;->h:F

    .line 16
    .line 17
    add-float/2addr v0, p2

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lya/a;->d()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-boolean p1, p0, Lya/a;->i:Z

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lya/a;->b:Lya/b;

    .line 32
    .line 33
    iget-object p1, p1, Lya/b;->a:Landroid/view/View;

    .line 34
    .line 35
    const/4 p2, 0x4

    .line 36
    invoke-virtual {p1, p2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lya/a;->i:Z

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lya/a;->e:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lya/a;->g:F

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lya/a;->h:F

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-wide/16 v1, 0x78

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lwb/cr;

    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lya/a;->b:Lya/b;

    .line 40
    .line 41
    iget-object v0, v0, Lya/b;->b:Landroid/view/View;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lya/a;->e:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lya/a;->h:F

    .line 8
    .line 9
    sub-float/2addr v1, v2

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v2, p0, Lya/a;->g:F

    .line 15
    .line 16
    sub-float/2addr v0, v2

    .line 17
    iget-object v2, p0, Lya/a;->b:Lya/b;

    .line 18
    .line 19
    iget-object v2, v2, Lya/b;->a:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x1

    .line 30
    const/high16 v4, 0x42280000    # 42.0f

    .line 31
    .line 32
    invoke-static {v3, v4, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    float-to-int v2, v2

    .line 37
    neg-int v2, v2

    .line 38
    int-to-float v2, v2

    .line 39
    cmpg-float v2, v1, v2

    .line 40
    .line 41
    if-gtz v2, :cond_0

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const v2, 0x3ee66666    # 0.45f

    .line 52
    .line 53
    .line 54
    mul-float/2addr v0, v2

    .line 55
    cmpl-float v0, v1, v0

    .line 56
    .line 57
    if-lez v0, :cond_0

    .line 58
    .line 59
    return v3

    .line 60
    :cond_0
    const/4 v0, 0x0

    .line 61
    return v0
.end method
