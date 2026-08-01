.class public final Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Landroidx/compose/ui/platform/ComposeView;

.field public ζ:Z

.field public η:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroidx/compose/ui/platform/ComposeView;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x6

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->ε:Landroidx/compose/ui/platform/ComposeView;

    .line 16
    .line 17
    const/high16 p1, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput p1, p0, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->η:F

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 34
    .line 35
    const/4 v1, -0x1

    .line 36
    invoke-direct {p1, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_4

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 37
    .line 38
    iget v7, p0, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->η:F

    .line 39
    .line 40
    invoke-static {v6, v7, v4, v5}, Lxb;->Φ(FFII)Ltt0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    iget v5, v4, Ltt0;->α:I

    .line 48
    .line 49
    int-to-float v5, v5

    .line 50
    cmpl-float v5, v0, v5

    .line 51
    .line 52
    if-ltz v5, :cond_2

    .line 53
    .line 54
    iget v5, v4, Ltt0;->γ:I

    .line 55
    .line 56
    int-to-float v5, v5

    .line 57
    cmpg-float v0, v0, v5

    .line 58
    .line 59
    if-gez v0, :cond_2

    .line 60
    .line 61
    iget v0, v4, Ltt0;->β:I

    .line 62
    .line 63
    int-to-float v0, v0

    .line 64
    cmpl-float v0, v3, v0

    .line 65
    .line 66
    if-ltz v0, :cond_2

    .line 67
    .line 68
    iget v0, v4, Ltt0;->δ:I

    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    cmpg-float v0, v3, v0

    .line 72
    .line 73
    if-gez v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    new-instance v9, Landroid/graphics/Rect;

    .line 84
    .line 85
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 97
    .line 98
    const/high16 v5, 0x41200000    # 10.0f

    .line 99
    .line 100
    mul-float/2addr v4, v5

    .line 101
    invoke-static {v4}, Ljx0;->в(F)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-gez v4, :cond_1

    .line 106
    .line 107
    move v8, v2

    .line 108
    goto :goto_0

    .line 109
    :cond_1
    move v8, v4

    .line 110
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Ljx0;->в(F)I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    invoke-static {v3}, Ljx0;->в(F)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    const/high16 v10, 0x3f800000    # 1.0f

    .line 126
    .line 127
    const/4 v11, 0x0

    .line 128
    move-object v4, p0

    .line 129
    invoke-virtual/range {v4 .. v11}, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->α(Landroid/view/View;IIILandroid/graphics/Rect;FI)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-nez p0, :cond_3

    .line 134
    .line 135
    move p0, v1

    .line 136
    goto :goto_2

    .line 137
    :cond_2
    :goto_1
    move-object v4, p0

    .line 138
    :cond_3
    move p0, v2

    .line 139
    :goto_2
    iput-boolean p0, v4, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->ζ:Z

    .line 140
    .line 141
    if-nez p0, :cond_5

    .line 142
    .line 143
    return v2

    .line 144
    :cond_4
    move-object v4, p0

    .line 145
    iget-boolean p0, v4, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->ζ:Z

    .line 146
    .line 147
    if-nez p0, :cond_5

    .line 148
    .line 149
    return v2

    .line 150
    :cond_5
    invoke-super {v4, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eq v0, v1, :cond_8

    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    const/4 v1, 0x3

    .line 165
    if-ne v0, v1, :cond_6

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_7

    .line 173
    .line 174
    if-nez p0, :cond_7

    .line 175
    .line 176
    iput-boolean v2, v4, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->ζ:Z

    .line 177
    .line 178
    :cond_7
    return p0

    .line 179
    :cond_8
    :goto_3
    iput-boolean v2, v4, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->ζ:Z

    .line 180
    .line 181
    return p0
.end method

.method public final getComposeView()Landroidx/compose/ui/platform/ComposeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->ε:Landroidx/compose/ui/platform/ComposeView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final α(Landroid/view/View;IIILandroid/graphics/Rect;FI)Z
    .locals 12

    .line 1
    move-object/from16 v5, p5

    .line 2
    .line 3
    move/from16 v8, p7

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    if-eq p1, p0, :cond_a

    .line 7
    .line 8
    const/16 v0, 0x18

    .line 9
    .line 10
    if-gt v8, v0, :cond_a

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_a

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    mul-float v6, v0, p6

    .line 31
    .line 32
    const v0, 0x3ca3d70a    # 0.02f

    .line 33
    .line 34
    .line 35
    cmpg-float v0, v6, v0

    .line 36
    .line 37
    if-gtz v0, :cond_1

    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v10, 0x1

    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    instance-of v1, p1, Landroid/widget/SeekBar;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-lez v2, :cond_5

    .line 67
    .line 68
    if-gez v3, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {v3, v10}, Ljava/lang/Math;->max(II)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    mul-int/lit8 v3, v3, 0x3

    .line 76
    .line 77
    if-lt v2, v3, :cond_5

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 83
    .line 84
    invoke-static {v1, v0, v1}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "seekbar"

    .line 89
    .line 90
    invoke-static {v0, v1, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    const-string v1, "lineprogressbar"

    .line 97
    .line 98
    invoke-static {v0, v1, v9}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    const-string v1, "progressbar"

    .line 105
    .line 106
    invoke-static {v0, v1, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    :cond_4
    :goto_0
    invoke-virtual {p1, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    move/from16 v4, p4

    .line 119
    .line 120
    neg-int v0, v4

    .line 121
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Rect;->inset(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    :goto_1
    move/from16 v4, p4

    .line 132
    .line 133
    :cond_6
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 134
    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    check-cast p1, Landroid/view/ViewGroup;

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    const/4 p1, 0x0

    .line 141
    :goto_2
    if-nez p1, :cond_8

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    sub-int/2addr v0, v10

    .line 149
    move v11, v0

    .line 150
    :goto_3
    const/4 v0, -0x1

    .line 151
    if-ge v0, v11, :cond_a

    .line 152
    .line 153
    invoke-virtual {p1, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    add-int/lit8 v7, v8, 0x1

    .line 161
    .line 162
    move-object v0, p0

    .line 163
    move v2, p2

    .line 164
    move v3, p3

    .line 165
    invoke-virtual/range {v0 .. v7}, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->α(Landroid/view/View;IIILandroid/graphics/Rect;FI)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_9

    .line 170
    .line 171
    :goto_4
    return v10

    .line 172
    :cond_9
    add-int/lit8 v11, v11, -0x1

    .line 173
    .line 174
    move/from16 v4, p4

    .line 175
    .line 176
    move-object/from16 v5, p5

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_a
    :goto_5
    return v9
.end method
