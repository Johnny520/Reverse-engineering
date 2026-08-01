.class final Lcom/mr/elaris/InAppSettingsLayoutHelpers;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static backHeader(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/high16 v2, 0x41900000    # 18.0f

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v0, v3, v2, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x18

    .line 23
    .line 24
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->titleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {p0, p1, v2, v4, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    const/16 p1, 0xd

    .line 36
    .line 37
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p0, p2, p1, v1, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/high16 p2, 0x40a00000    # 5.0f

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    const/high16 v1, 0x40000000    # 2.0f

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-virtual {p1, v3, p2, v3, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method

.method public static baseScroll(Lcom/mr/elaris/InAppSettings;)Landroid/widget/ScrollView;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->createGuardedScrollView()Lcom/mr/elaris/InAppSettingsGuardedScrollView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    invoke-virtual {v0, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    .line 28
    .line 29
    .line 30
    const/high16 v2, 0x41a00000    # 20.0f

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v0, v3}, Landroid/view/View;->setFadingEdgeLength(I)V

    .line 37
    .line 38
    .line 39
    new-instance v3, Landroid/widget/LinearLayout;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 42
    .line 43
    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageColor(Lcom/mr/elaris/InAppSettings;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v3, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->safeTopPadding(Lcom/mr/elaris/InAppSettings;)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const/high16 v5, 0x41d00000    # 26.0f

    .line 69
    .line 70
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-virtual {v3, v1, v4, v2, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 75
    .line 76
    .line 77
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 78
    .line 79
    const/4 v1, -0x1

    .line 80
    const/4 v2, -0x2

    .line 81
    invoke-direct {p0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3, p0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public static dialogWidth(Lcom/mr/elaris/InAppSettings;)I
    .locals 3

    .line 1
    const/high16 v0, 0x438c0000    # 280.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 18
    .line 19
    const/high16 v2, 0x42280000    # 42.0f

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sub-int/2addr v1, v2

    .line 26
    const/high16 v2, 0x44020000    # 520.0f

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public static dp(Lcom/mr/elaris/InAppSettings;F)I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    float-to-int p0, p0

    .line 17
    return p0
.end method

.method public static innerBox(Lcom/mr/elaris/InAppSettings;)Landroid/widget/LinearLayout;
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x41900000    # 18.0f

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/high16 v3, 0x40800000    # 4.0f

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v4, 0x40c00000    # 6.0f

    .line 29
    .line 30
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-virtual {v0, v2, v3, v1, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public static rootOf(Landroid/widget/ScrollView;)Landroid/widget/LinearLayout;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Landroid/widget/LinearLayout;

    .line 7
    .line 8
    return-object p0
.end method

.method public static safeTopPadding(Lcom/mr/elaris/InAppSettings;)I
    .locals 3

    .line 1
    const/high16 v0, 0x41400000    # 12.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->statusBarHeight(Lcom/mr/elaris/InAppSettings;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/high16 v2, 0x41000000    # 8.0f

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    sub-int/2addr v1, p0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public static secondaryScroll(Lcom/mr/elaris/InAppSettings;)Landroid/widget/ScrollView;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->createGuardedScrollView()Lcom/mr/elaris/InAppSettingsGuardedScrollView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    invoke-virtual {v0, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    .line 28
    .line 29
    .line 30
    const/high16 v2, 0x41a00000    # 20.0f

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v0, v2}, Landroid/view/View;->setFadingEdgeLength(I)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Landroid/widget/LinearLayout;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 42
    .line 43
    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageColor(Lcom/mr/elaris/InAppSettings;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 54
    .line 55
    .line 56
    const/high16 v1, 0x41900000    # 18.0f

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->secondaryTopPadding(Lcom/mr/elaris/InAppSettings;)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    const/high16 v5, 0x41d00000    # 26.0f

    .line 71
    .line 72
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-virtual {v2, v3, v4, v1, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 77
    .line 78
    .line 79
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 80
    .line 81
    const/4 v1, -0x1

    .line 82
    const/4 v3, -0x2

    .line 83
    invoke-direct {p0, v1, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method public static secondaryTopPadding(Lcom/mr/elaris/InAppSettings;)I
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->safeTopPadding(Lcom/mr/elaris/InAppSettings;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x41800000    # 16.0f

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sub-int/2addr v0, p0

    .line 12
    const/4 p0, 0x0

    .line 13
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static statusBarHeight(Lcom/mr/elaris/InAppSettings;)I
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "status_bar_height"

    .line 8
    .line 9
    const-string v2, "dimen"

    .line 10
    .line 11
    const-string v3, "android"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return p0

    .line 30
    :catchall_0
    :cond_0
    const/high16 v0, 0x41e00000    # 28.0f

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method
