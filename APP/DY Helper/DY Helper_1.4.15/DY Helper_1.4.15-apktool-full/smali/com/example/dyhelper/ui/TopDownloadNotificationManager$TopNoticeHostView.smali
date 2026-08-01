.class final Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic σ:I


# instance fields
.field public final ε:Lg52;

.field public final ζ:Ltv1;

.field public final η:Landroid/view/animation/PathInterpolator;

.field public final θ:Landroid/view/animation/PathInterpolator;

.field public final ι:Landroid/widget/LinearLayout;

.field public final κ:Ljava/util/LinkedHashMap;

.field public final λ:Ljava/util/LinkedHashMap;

.field public final μ:Landroid/widget/TextView;

.field public ν:Z

.field public ξ:F

.field public ο:Z

.field public π:Landroid/animation/ValueAnimator;

.field public ρ:F


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lg52;Ltv1;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ε:Lg52;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ζ:Ltv1;

    .line 10
    .line 11
    new-instance p2, Landroid/view/animation/PathInterpolator;

    .line 12
    .line 13
    const p3, 0x3e99999a    # 0.3f

    .line 14
    .line 15
    .line 16
    const v0, 0x3e23d70a    # 0.16f

    .line 17
    .line 18
    .line 19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-direct {p2, v0, v1, p3, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->η:Landroid/view/animation/PathInterpolator;

    .line 25
    .line 26
    new-instance p2, Landroid/view/animation/PathInterpolator;

    .line 27
    .line 28
    const p3, 0x3e4ccccd    # 0.2f

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p2, p3, v0, v0, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->θ:Landroid/view/animation/PathInterpolator;

    .line 36
    .line 37
    new-instance p2, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    const/4 p3, 0x1

    .line 43
    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 54
    .line 55
    .line 56
    iput-object p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ι:Landroid/widget/LinearLayout;

    .line 57
    .line 58
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->κ:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->λ:Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    new-instance v2, Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    const/high16 p1, 0x41400000    # 12.0f

    .line 78
    .line 79
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 80
    .line 81
    .line 82
    const p1, -0xa0998d

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    .line 87
    .line 88
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 89
    .line 90
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 91
    .line 92
    .line 93
    const/16 p1, 0x11

    .line 94
    .line 95
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 99
    .line 100
    .line 101
    sget-object p1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 102
    .line 103
    const/16 p1, 0xcd

    .line 104
    .line 105
    const/16 v3, 0xff

    .line 106
    .line 107
    invoke-static {p1, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    const/high16 v4, 0x41600000    # 14.0f

    .line 112
    .line 113
    invoke-virtual {p0, v4}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    int-to-float v4, v4

    .line 118
    const v5, 0x3f333333    # 0.7f

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v5}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 126
    .line 127
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 134
    .line 135
    .line 136
    const/16 p1, 0x1a

    .line 137
    .line 138
    invoke-static {p1, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-virtual {v6, v5, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 146
    .line 147
    .line 148
    const/high16 p1, 0x41000000    # 8.0f

    .line 149
    .line 150
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    int-to-float v3, v3

    .line 155
    invoke-virtual {v2, v3}, Landroid/view/View;->setElevation(F)V

    .line 156
    .line 157
    .line 158
    const/16 v3, 0x8

    .line 159
    .line 160
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 161
    .line 162
    .line 163
    iput-object v2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->μ:Landroid/widget/TextView;

    .line 164
    .line 165
    iput-boolean p3, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 166
    .line 167
    iput v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-virtual {p0, v0, v0, v0, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 180
    .line 181
    .line 182
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 183
    .line 184
    const/4 p3, -0x2

    .line 185
    const/16 v1, 0x30

    .line 186
    .line 187
    const/4 v3, -0x1

    .line 188
    invoke-direct {p1, v3, p3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 192
    .line 193
    .line 194
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 195
    .line 196
    const/high16 p3, 0x43160000    # 150.0f

    .line 197
    .line 198
    invoke-virtual {p0, p3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 199
    .line 200
    .line 201
    move-result p3

    .line 202
    const/high16 v1, 0x41e00000    # 28.0f

    .line 203
    .line 204
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    invoke-direct {p1, p3, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 209
    .line 210
    .line 211
    const/high16 p3, 0x40c00000    # 6.0f

    .line 212
    .line 213
    invoke-virtual {p0, p3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 214
    .line 215
    .line 216
    move-result p3

    .line 217
    iput p3, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 218
    .line 219
    invoke-virtual {p2, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 220
    .line 221
    .line 222
    new-instance p1, Lcom/example/dyhelper/ui/ω;

    .line 223
    .line 224
    invoke-direct {p1, p0, v0}, Lcom/example/dyhelper/ui/ω;-><init>(Landroid/view/View;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 228
    .line 229
    .line 230
    return-void
.end method


# virtual methods
.method public final α(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->π:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    new-array v1, v1, [F

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput v0, v1, v2

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    aput p1, v1, v0

    .line 18
    .line 19
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 24
    .line 25
    cmpl-float v1, p1, v1

    .line 26
    .line 27
    if-lez v1, :cond_1

    .line 28
    .line 29
    const-wide/16 v1, 0x230

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-wide/16 v1, 0x1a4

    .line 33
    .line 34
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 38
    .line 39
    cmpl-float p1, p1, v1

    .line 40
    .line 41
    if-lez p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->η:Landroid/view/animation/PathInterpolator;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    new-instance p1, Landroid/view/animation/PathInterpolator;

    .line 47
    .line 48
    const v1, 0x3ecccccd    # 0.4f

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/high16 v3, 0x3f800000    # 1.0f

    .line 53
    .line 54
    invoke-direct {p1, v1, v2, v3, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lcom/example/dyhelper/ui/δ;

    .line 61
    .line 62
    const/4 v1, 0x3

    .line 63
    invoke-direct {p1, p0, v1}, Lcom/example/dyhelper/ui/δ;-><init>(Landroid/view/View;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->π:Landroid/animation/ValueAnimator;

    .line 73
    .line 74
    return-void
.end method

.method public final β(F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, Lj81;->λ(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 9
    .line 10
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->κ:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p1, Ljava/lang/Iterable;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    add-int/lit8 v2, v0, 0x1

    .line 37
    .line 38
    if-ltz v0, :cond_0

    .line 39
    .line 40
    check-cast v1, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 41
    .line 42
    iget v3, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 43
    .line 44
    invoke-virtual {v1, v0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->α(IF)V

    .line 45
    .line 46
    .line 47
    move v0, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {}, Lyh;->х()V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    throw p0

    .line 54
    :cond_1
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->λ:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast p1, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 80
    .line 81
    iget v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    invoke-virtual {v0, v2, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->α(IF)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    iget p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 89
    .line 90
    iget-object v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->μ:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 93
    .line 94
    .line 95
    const p1, 0x3e19999a    # 0.15f

    .line 96
    .line 97
    .line 98
    iget p0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 99
    .line 100
    mul-float/2addr p0, p1

    .line 101
    const p1, 0x3f59999a    # 0.85f

    .line 102
    .line 103
    .line 104
    add-float/2addr p0, p1

    .line 105
    invoke-virtual {v0, p0}, Landroid/view/View;->setScaleY(F)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final γ(F)I
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final δ(Lp70;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->π:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/high16 v2, 0x41800000    # 16.0f

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-float p0, p0

    .line 24
    neg-float p0, p0

    .line 25
    invoke-virtual {v0, p0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const v0, 0x3f7851ec    # 0.97f

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, Landroid/view/animation/PathInterpolator;

    .line 41
    .line 42
    const v2, 0x3ecccccd    # 0.4f

    .line 43
    .line 44
    .line 45
    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-direct {v0, v2, v1, v3, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-wide/16 v0, 0x104

    .line 55
    .line 56
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v0, Lcom/example/dyhelper/ui/κ;

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    invoke-direct {v0, v1, p1}, Lcom/example/dyhelper/ui/κ;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final ε(I)Landroid/widget/LinearLayout$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/high16 p1, 0x40e00000    # 7.0f

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/high16 p1, 0x40c00000    # 6.0f

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput p0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 20
    .line 21
    return-object v0
.end method

.method public final ζ(Ljava/util/List;IZ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->κ:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 43
    .line 44
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    if-eqz v7, :cond_0

    .line 49
    .line 50
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    int-to-float v7, v7

    .line 55
    invoke-virtual {v5}, Landroid/view/View;->getTranslationY()F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-float/2addr v5, v7

    .line 60
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 69
    .line 70
    const/16 v5, 0xa

    .line 71
    .line 72
    move-object/from16 v6, p1

    .line 73
    .line 74
    invoke-static {v6, v5}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_2

    .line 90
    .line 91
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Le52;

    .line 96
    .line 97
    iget-object v7, v7, Le52;->α:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-static {v4}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast v5, Ljava/lang/Iterable;

    .line 115
    .line 116
    invoke-static {v5}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    new-instance v7, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_4

    .line 134
    .line 135
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    move-object v9, v8

    .line 140
    check-cast v9, Ljava/lang/String;

    .line 141
    .line 142
    invoke-interface {v4, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-nez v9, :cond_3

    .line 147
    .line 148
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    const/4 v7, 0x4

    .line 161
    iget-object v8, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->λ:Ljava/util/LinkedHashMap;

    .line 162
    .line 163
    const/4 v9, 0x1

    .line 164
    const/4 v10, 0x0

    .line 165
    iget-object v11, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ι:Landroid/widget/LinearLayout;

    .line 166
    .line 167
    if-eqz v5, :cond_9

    .line 168
    .line 169
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v3, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    check-cast v12, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 180
    .line 181
    if-eqz v12, :cond_5

    .line 182
    .line 183
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    check-cast v13, Ljava/lang/Float;

    .line 188
    .line 189
    if-eqz v13, :cond_6

    .line 190
    .line 191
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    goto :goto_4

    .line 196
    :cond_6
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    int-to-float v13, v13

    .line 201
    :goto_4
    invoke-virtual {v8, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    check-cast v14, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 206
    .line 207
    if-eqz v14, :cond_7

    .line 208
    .line 209
    invoke-virtual {v11, v14}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    :cond_7
    invoke-interface {v8, v5, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    int-to-float v8, v8

    .line 220
    sub-float/2addr v13, v8

    .line 221
    invoke-virtual {v12, v13}, Landroid/view/View;->setTranslationY(F)V

    .line 222
    .line 223
    .line 224
    new-instance v8, Lcom/example/dyhelper/ui/β;

    .line 225
    .line 226
    invoke-direct {v8, v0, v5, v12, v9}, Lcom/example/dyhelper/ui/β;-><init>(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 227
    .line 228
    .line 229
    iget-object v5, v12, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ξ:Landroid/animation/ValueAnimator;

    .line 230
    .line 231
    if-eqz v5, :cond_8

    .line 232
    .line 233
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 234
    .line 235
    .line 236
    :cond_8
    invoke-virtual {v12}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v5, v10}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-virtual {v12}, Landroid/view/View;->getTranslationY()F

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    const/high16 v11, 0x41000000    # 8.0f

    .line 249
    .line 250
    invoke-virtual {v12, v11}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    int-to-float v11, v11

    .line 255
    sub-float/2addr v9, v11

    .line 256
    invoke-virtual {v5, v9}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    const v9, 0x3f51eb85    # 0.82f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5, v9}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual {v5, v9}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    new-instance v9, Landroid/view/animation/PathInterpolator;

    .line 272
    .line 273
    const v11, 0x3ea3d70a    # 0.32f

    .line 274
    .line 275
    .line 276
    const v12, 0x3f2b851f    # 0.67f

    .line 277
    .line 278
    .line 279
    invoke-direct {v9, v11, v10, v12, v10}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v9}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    const-wide/16 v9, 0x104

    .line 287
    .line 288
    invoke-virtual {v5, v9, v10}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    new-instance v9, Lcom/example/dyhelper/ui/κ;

    .line 293
    .line 294
    invoke-direct {v9, v7, v8}, Lcom/example/dyhelper/ui/κ;-><init>(ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v5, v9}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-virtual {v5}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 302
    .line 303
    .line 304
    goto/16 :goto_3

    .line 305
    .line 306
    :cond_9
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    const/4 v6, 0x0

    .line 311
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    iget-object v13, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->θ:Landroid/view/animation/PathInterpolator;

    .line 316
    .line 317
    if-eqz v12, :cond_18

    .line 318
    .line 319
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    add-int/lit8 v15, v6, 0x1

    .line 324
    .line 325
    const/16 p1, 0x0

    .line 326
    .line 327
    if-ltz v6, :cond_17

    .line 328
    .line 329
    check-cast v12, Le52;

    .line 330
    .line 331
    iget-object v7, v12, Le52;->α:Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v16

    .line 337
    check-cast v16, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 338
    .line 339
    if-nez v16, :cond_a

    .line 340
    .line 341
    new-instance v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 342
    .line 343
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget-object v14, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ε:Lg52;

    .line 351
    .line 352
    iget-object v9, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ζ:Ltv1;

    .line 353
    .line 354
    invoke-direct {v5, v10, v14, v9}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;-><init>(Landroid/content/Context;Lg52;Ltv1;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v3, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_a
    move-object/from16 v5, v16

    .line 362
    .line 363
    :goto_6
    if-nez v6, :cond_b

    .line 364
    .line 365
    const/4 v9, 0x1

    .line 366
    goto :goto_7

    .line 367
    :cond_b
    move/from16 v9, p1

    .line 368
    .line 369
    :goto_7
    iget v10, v12, Le52;->δ:I

    .line 370
    .line 371
    const/4 v14, -0x1

    .line 372
    move-object/from16 v16, v3

    .line 373
    .line 374
    const/16 v3, 0x64

    .line 375
    .line 376
    invoke-static {v10, v14, v3}, Lj81;->μ(III)I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    iput v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->λ:I

    .line 381
    .line 382
    iget-object v3, v12, Le52;->ε:Lf52;

    .line 383
    .line 384
    iput-object v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->μ:Lf52;

    .line 385
    .line 386
    iget-object v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->υ:Landroid/widget/TextView;

    .line 387
    .line 388
    iget-object v10, v12, Le52;->β:Ljava/lang/String;

    .line 389
    .line 390
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    .line 392
    .line 393
    iget-object v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->φ:Landroid/widget/TextView;

    .line 394
    .line 395
    iget-object v10, v12, Le52;->γ:Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    .line 399
    .line 400
    iget-object v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->χ:Landroid/widget/TextView;

    .line 401
    .line 402
    iget-object v10, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->μ:Lf52;

    .line 403
    .line 404
    sget-object v12, Lf52;->ζ:Lf52;

    .line 405
    .line 406
    if-ne v10, v12, :cond_c

    .line 407
    .line 408
    const-string v10, "\u5b8c\u6210"

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_c
    sget-object v12, Lf52;->η:Lf52;

    .line 412
    .line 413
    if-ne v10, v12, :cond_d

    .line 414
    .line 415
    const-string v10, "\u5931\u8d25"

    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_d
    iget v10, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->λ:I

    .line 419
    .line 420
    if-ltz v10, :cond_e

    .line 421
    .line 422
    const-string v12, "%"

    .line 423
    .line 424
    invoke-static {v12, v10}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v10

    .line 428
    goto :goto_8

    .line 429
    :cond_e
    const-string v10, "..."

    .line 430
    .line 431
    :goto_8
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 432
    .line 433
    .line 434
    iget-object v10, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->μ:Lf52;

    .line 435
    .line 436
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    const/4 v12, 0x2

    .line 441
    if-eqz v10, :cond_11

    .line 442
    .line 443
    const/4 v14, 0x1

    .line 444
    if-eq v10, v14, :cond_10

    .line 445
    .line 446
    if-ne v10, v12, :cond_f

    .line 447
    .line 448
    const v10, -0x1ab7b3

    .line 449
    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_f
    invoke-static {}, Lγ;->κ()V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :cond_10
    const v10, -0xe75fa8

    .line 457
    .line 458
    .line 459
    goto :goto_9

    .line 460
    :cond_11
    const v10, -0xe67606

    .line 461
    .line 462
    .line 463
    :goto_9
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 464
    .line 465
    .line 466
    iget-object v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->τ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;

    .line 467
    .line 468
    iget v14, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->λ:I

    .line 469
    .line 470
    iget-object v12, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->μ:Lf52;

    .line 471
    .line 472
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iput v14, v3, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ζ:I

    .line 479
    .line 480
    iput v10, v3, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->η:I

    .line 481
    .line 482
    iput-object v12, v3, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->θ:Lf52;

    .line 483
    .line 484
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 485
    .line 486
    .line 487
    iget-object v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ω:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;

    .line 488
    .line 489
    iget v12, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->λ:I

    .line 490
    .line 491
    iget-object v14, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->μ:Lf52;

    .line 492
    .line 493
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    iput v12, v3, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->ε:I

    .line 500
    .line 501
    iput v10, v3, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->ζ:I

    .line 502
    .line 503
    iput-object v14, v3, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->η:Lf52;

    .line 504
    .line 505
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 506
    .line 507
    .line 508
    if-eqz v9, :cond_12

    .line 509
    .line 510
    const/high16 v3, 0x3f800000    # 1.0f

    .line 511
    .line 512
    :goto_a
    const/high16 v9, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v10, 0x0

    .line 515
    goto :goto_b

    .line 516
    :cond_12
    const/4 v3, 0x0

    .line 517
    goto :goto_a

    .line 518
    :goto_b
    invoke-static {v3, v10, v9}, Lj81;->λ(FFF)F

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    iget v9, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ν:F

    .line 523
    .line 524
    sub-float/2addr v9, v3

    .line 525
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 526
    .line 527
    .line 528
    move-result v9

    .line 529
    const v10, 0x3c23d70a    # 0.01f

    .line 530
    .line 531
    .line 532
    cmpg-float v9, v9, v10

    .line 533
    .line 534
    if-gtz v9, :cond_13

    .line 535
    .line 536
    iput v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ν:F

    .line 537
    .line 538
    const/4 v3, 0x0

    .line 539
    invoke-virtual {v5, v3, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->β(Ljava/lang/Float;Ljava/lang/Integer;)V

    .line 540
    .line 541
    .line 542
    const/4 v10, 0x4

    .line 543
    goto :goto_c

    .line 544
    :cond_13
    iget-object v9, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ξ:Landroid/animation/ValueAnimator;

    .line 545
    .line 546
    if-eqz v9, :cond_14

    .line 547
    .line 548
    invoke-virtual {v9}, Landroid/animation/ValueAnimator;->cancel()V

    .line 549
    .line 550
    .line 551
    :cond_14
    iget v9, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ν:F

    .line 552
    .line 553
    const/4 v10, 0x2

    .line 554
    new-array v10, v10, [F

    .line 555
    .line 556
    aput v9, v10, p1

    .line 557
    .line 558
    const/16 v18, 0x1

    .line 559
    .line 560
    aput v3, v10, v18

    .line 561
    .line 562
    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    const-wide/16 v9, 0x1e0

    .line 567
    .line 568
    invoke-virtual {v3, v9, v10}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 569
    .line 570
    .line 571
    iget-object v9, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ο:Landroid/view/animation/PathInterpolator;

    .line 572
    .line 573
    invoke-virtual {v3, v9}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 574
    .line 575
    .line 576
    new-instance v9, Lcom/example/dyhelper/ui/δ;

    .line 577
    .line 578
    const/4 v10, 0x4

    .line 579
    invoke-direct {v9, v5, v10}, Lcom/example/dyhelper/ui/δ;-><init>(Landroid/view/View;I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v3, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    .line 586
    .line 587
    .line 588
    iput-object v3, v5, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ξ:Landroid/animation/ValueAnimator;

    .line 589
    .line 590
    :goto_c
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    if-nez v3, :cond_15

    .line 595
    .line 596
    invoke-virtual {v8, v7}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ε(I)Landroid/widget/LinearLayout$LayoutParams;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    invoke-virtual {v11, v5, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 604
    .line 605
    .line 606
    const/4 v3, 0x0

    .line 607
    invoke-virtual {v5, v3}, Landroid/view/View;->setAlpha(F)V

    .line 608
    .line 609
    .line 610
    const/high16 v6, 0x41400000    # 12.0f

    .line 611
    .line 612
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->γ(F)I

    .line 613
    .line 614
    .line 615
    move-result v6

    .line 616
    int-to-float v6, v6

    .line 617
    invoke-virtual {v5, v6}, Landroid/view/View;->setTranslationY(F)V

    .line 618
    .line 619
    .line 620
    const v6, 0x3f770a3d    # 0.965f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v5, v6}, Landroid/view/View;->setScaleX(F)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v5, v6}, Landroid/view/View;->setScaleY(F)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 630
    .line 631
    .line 632
    move-result-object v5

    .line 633
    const/high16 v9, 0x3f800000    # 1.0f

    .line 634
    .line 635
    invoke-virtual {v5, v9}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 636
    .line 637
    .line 638
    move-result-object v5

    .line 639
    invoke-virtual {v5, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    invoke-virtual {v5, v9}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    invoke-virtual {v3, v9}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    invoke-virtual {v3, v13}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    const-wide/16 v5, 0x168

    .line 656
    .line 657
    invoke-virtual {v3, v5, v6}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 662
    .line 663
    .line 664
    goto :goto_d

    .line 665
    :cond_15
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    if-eq v3, v6, :cond_16

    .line 670
    .line 671
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ε(I)Landroid/widget/LinearLayout$LayoutParams;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    invoke-virtual {v11, v5, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 679
    .line 680
    .line 681
    goto :goto_d

    .line 682
    :cond_16
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ε(I)Landroid/widget/LinearLayout$LayoutParams;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    invoke-virtual {v5, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 687
    .line 688
    .line 689
    :goto_d
    move v7, v10

    .line 690
    move v6, v15

    .line 691
    move-object/from16 v3, v16

    .line 692
    .line 693
    const/4 v9, 0x1

    .line 694
    const/4 v10, 0x0

    .line 695
    goto/16 :goto_5

    .line 696
    .line 697
    :cond_17
    invoke-static {}, Lyh;->х()V

    .line 698
    .line 699
    .line 700
    const/16 v17, 0x0

    .line 701
    .line 702
    throw v17

    .line 703
    :cond_18
    const/16 p1, 0x0

    .line 704
    .line 705
    new-instance v3, Ljava/lang/StringBuilder;

    .line 706
    .line 707
    const-string v4, "\u8fd8\u6709 "

    .line 708
    .line 709
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 713
    .line 714
    .line 715
    const-string v4, " \u4e2a\u4efb\u52a1"

    .line 716
    .line 717
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    iget-object v4, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->μ:Landroid/widget/TextView;

    .line 725
    .line 726
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 727
    .line 728
    .line 729
    if-lez v1, :cond_19

    .line 730
    .line 731
    const/4 v14, 0x1

    .line 732
    goto :goto_e

    .line 733
    :cond_19
    move/from16 v14, p1

    .line 734
    .line 735
    :goto_e
    const v1, 0x3f59999a    # 0.85f

    .line 736
    .line 737
    .line 738
    if-eqz v14, :cond_1a

    .line 739
    .line 740
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 741
    .line 742
    .line 743
    move-result v3

    .line 744
    if-eqz v3, :cond_1a

    .line 745
    .line 746
    move/from16 v3, p1

    .line 747
    .line 748
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 749
    .line 750
    .line 751
    const/4 v3, 0x0

    .line 752
    invoke-virtual {v4, v3}, Landroid/view/View;->setAlpha(F)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v4, v1}, Landroid/view/View;->setScaleY(F)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    iget v5, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 763
    .line 764
    invoke-virtual {v3, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    const v5, 0x3e19999a    # 0.15f

    .line 769
    .line 770
    .line 771
    iget v6, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 772
    .line 773
    mul-float/2addr v6, v5

    .line 774
    add-float/2addr v6, v1

    .line 775
    invoke-virtual {v3, v6}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    invoke-virtual {v1, v13}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    const-wide/16 v5, 0x140

    .line 784
    .line 785
    invoke-virtual {v1, v5, v6}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 790
    .line 791
    .line 792
    goto :goto_f

    .line 793
    :cond_1a
    if-nez v14, :cond_1b

    .line 794
    .line 795
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    if-nez v3, :cond_1b

    .line 800
    .line 801
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    const/4 v10, 0x0

    .line 806
    invoke-virtual {v3, v10}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    invoke-virtual {v3, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    new-instance v3, Landroid/view/animation/PathInterpolator;

    .line 815
    .line 816
    const v5, 0x3ecccccd    # 0.4f

    .line 817
    .line 818
    .line 819
    const/high16 v9, 0x3f800000    # 1.0f

    .line 820
    .line 821
    invoke-direct {v3, v5, v10, v9, v9}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    const-wide/16 v5, 0xdc

    .line 829
    .line 830
    invoke-virtual {v1, v5, v6}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    new-instance v3, Lcom/example/dyhelper/ui/κ;

    .line 835
    .line 836
    const/4 v5, 0x3

    .line 837
    invoke-direct {v3, v5, v0}, Lcom/example/dyhelper/ui/κ;-><init>(ILjava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 845
    .line 846
    .line 847
    :cond_1b
    :goto_f
    invoke-virtual {v4}, Landroid/view/View;->bringToFront()V

    .line 848
    .line 849
    .line 850
    if-eqz p3, :cond_1c

    .line 851
    .line 852
    const/4 v14, 0x1

    .line 853
    iput-boolean v14, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ν:Z

    .line 854
    .line 855
    const/high16 v9, 0x3f800000    # 1.0f

    .line 856
    .line 857
    invoke-virtual {v0, v9}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->α(F)V

    .line 858
    .line 859
    .line 860
    :cond_1c
    iget v1, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 861
    .line 862
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->β(F)V

    .line 863
    .line 864
    .line 865
    new-instance v1, Lcom/example/dyhelper/ui/ψ;

    .line 866
    .line 867
    invoke-direct {v1, v0, v2}, Lcom/example/dyhelper/ui/ψ;-><init>(Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;Ljava/util/LinkedHashMap;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 871
    .line 872
    .line 873
    return-void
.end method
