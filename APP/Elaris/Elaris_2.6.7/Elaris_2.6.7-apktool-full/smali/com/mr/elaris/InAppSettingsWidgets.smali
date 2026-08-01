.class final Lcom/mr/elaris/InAppSettingsWidgets;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;,
        Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;
    }
.end annotation


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

.method public static actionRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 7

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
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    const/high16 v3, 0x41900000    # 18.0f

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/high16 v5, 0x40c00000    # 6.0f

    .line 24
    .line 25
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v0, v4, v6, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 38
    .line 39
    .line 40
    const/high16 v3, 0x42740000    # 61.0f

    .line 41
    .line 42
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v0, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    new-instance v4, Landroid/widget/LinearLayout;

    .line 64
    .line 65
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 66
    .line 67
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 74
    .line 75
    .line 76
    const/16 v2, 0xf

    .line 77
    .line 78
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->titleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {p0, p1, v2, v5, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    if-eqz p2, :cond_0

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-lez p1, :cond_0

    .line 96
    .line 97
    const/16 p1, 0xc

    .line 98
    .line 99
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-virtual {p0, p2, p1, v2, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/4 p2, 0x2

    .line 108
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 109
    .line 110
    .line 111
    const/high16 p2, 0x40800000    # 4.0f

    .line 112
    .line 113
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    invoke-virtual {p1, v1, p0, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    :cond_0
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 124
    .line 125
    const/4 p1, -0x2

    .line 126
    const/high16 p2, 0x3f800000    # 1.0f

    .line 127
    .line 128
    invoke-direct {p0, v1, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v4, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    .line 136
    .line 137
    return-object v0
.end method

.method public static addToggleSlot(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Lcom/mr/elaris/InAppSettings$ToggleView;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    .line 23
    const/high16 v2, 0x42200000    # 40.0f

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/high16 v4, 0x41b00000    # 22.0f

    .line 30
    .line 31
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-direct {v1, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 36
    .line 37
    .line 38
    const/16 v3, 0x11

    .line 39
    .line 40
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 41
    .line 42
    invoke-virtual {v0, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-direct {p2, v1, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static button(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->BUTTON_TEXT_COLOR:I

    .line 11
    .line 12
    :goto_0
    const/4 v1, 0x0

    .line 13
    const/16 v2, 0xe

    .line 14
    .line 15
    invoke-virtual {p0, p1, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/16 v0, 0x11

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 31
    .line 32
    .line 33
    const/high16 v1, 0x42100000    # 36.0f

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsWidgets;->buttonStateBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/StateListDrawable;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    invoke-virtual {p1, p0}, Landroid/view/View;->setElevation(F)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationZ(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 57
    .line 58
    .line 59
    return-object p1
.end method

.method private static buttonStateBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/StateListDrawable;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x10100a7

    .line 7
    .line 8
    .line 9
    filled-new-array {v1}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsWidgets;->pressedButtonBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    new-array v1, v1, [I

    .line 22
    .line 23
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->buttonBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0, v1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static card(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;
    .locals 6

    .line 1
    new-instance p1, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    const/4 v4, -0x2

    .line 23
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 24
    .line 25
    .line 26
    const/high16 v5, 0x41200000    # 10.0f

    .line 27
    .line 28
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 40
    .line 41
    invoke-direct {v2, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->cardBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 71
    .line 72
    const/high16 v0, 0x3f800000    # 1.0f

    .line 73
    .line 74
    mul-float/2addr p0, v0

    .line 75
    invoke-virtual {v2, p0}, Landroid/view/View;->setElevation(F)V

    .line 76
    .line 77
    .line 78
    sget p0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CARD_AMBIENT_SHADOW_COLOR:I

    .line 79
    .line 80
    invoke-virtual {v2, p0}, Landroid/view/View;->setOutlineAmbientShadowColor(I)V

    .line 81
    .line 82
    .line 83
    sget p0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CARD_SPOT_SHADOW_COLOR:I

    .line 84
    .line 85
    invoke-virtual {v2, p0}, Landroid/view/View;->setOutlineSpotShadowColor(I)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    invoke-virtual {v2, p0}, Landroid/view/View;->setTranslationZ(F)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 93
    .line 94
    .line 95
    array-length p0, p2

    .line 96
    :goto_0
    if-ge v1, p0, :cond_0

    .line 97
    .line 98
    aget-object v0, p2, v1

    .line 99
    .line 100
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 107
    .line 108
    invoke-direct {p0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    .line 113
    .line 114
    return-object p1
.end method

.method public static categoryHeader(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/view/View;
    .locals 6

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
    const/4 v2, 0x3

    .line 13
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 14
    .line 15
    .line 16
    const/high16 v2, 0x41900000    # 18.0f

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/high16 v3, 0x40a00000    # 5.0f

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-virtual {v0, v4, v2, v4, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->titleOf(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/16 v3, 0x18

    .line 37
    .line 38
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->titleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {p0, v2, v3, v5, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->summaryOf(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/16 v2, 0xd

    .line 51
    .line 52
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {p0, p1, v2, v3, v4}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/high16 v2, 0x40800000    # 4.0f

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-virtual {p1, v4, p0, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 70
    .line 71
    const/4 v2, -0x1

    .line 72
    const/4 v3, -0x2

    .line 73
    invoke-direct {p0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    .line 78
    .line 79
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 80
    .line 81
    invoke-direct {p0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public static checkCircleDrawable(Lcom/mr/elaris/InAppSettings;Z)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 4
    .line 5
    const v1, 0x3f6147ae    # 0.88f

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget v0, Lcom/mr/elaris/InAppSettings;->CARD_SOFT:I

    .line 14
    .line 15
    :goto_0
    const/high16 v1, 0x41600000    # 14.0f

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    sget p1, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 24
    .line 25
    const v2, 0x3ee66666    # 0.45f

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, v2}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    sget p1, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 34
    .line 35
    :goto_1
    const/4 v2, 0x1

    .line 36
    invoke-virtual {p0, v0, v1, p1, v2}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method private static clickableRowCount([Landroid/view/View;)I
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v1, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p0, v1

    .line 7
    .line 8
    invoke-static {v3}, Lcom/mr/elaris/InAppSettingsWidgets;->isClickableRow(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v2
.end method

.method private static createSettingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFF)Landroid/view/View;
    .locals 11

    .line 1
    const/high16 v9, 0x42740000    # 61.0f

    .line 2
    .line 3
    const/high16 v10, 0x42900000    # 72.0f

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move/from16 v5, p5

    .line 11
    .line 12
    move/from16 v6, p6

    .line 13
    .line 14
    move/from16 v7, p7

    .line 15
    .line 16
    move/from16 v8, p8

    .line 17
    .line 18
    invoke-static/range {v0 .. v10}, Lcom/mr/elaris/InAppSettingsWidgets;->createSettingItemSized(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFFFF)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static createSettingItemSized(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFFFF)Landroid/view/View;
    .locals 8

    .line 1
    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    .line 2
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x10

    .line 3
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 4
    invoke-virtual {p0, p7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v3

    const/high16 v4, 0x40c00000    # 6.0f

    .line 5
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v5

    .line 6
    invoke-virtual {p0, p7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v0

    .line 7
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v4

    .line 8
    invoke-virtual {v1, v3, v5, v0, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 9
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 10
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    move/from16 v5, p9

    .line 11
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    const/4 v0, 0x1

    .line 12
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 13
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 14
    new-instance v7, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v7, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 15
    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 16
    invoke-virtual {v7, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 17
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 18
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 19
    invoke-virtual {v7, v6}, Landroid/view/View;->setMinimumWidth(I)V

    move/from16 v2, p8

    .line 20
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v2

    invoke-virtual {v7, v6, v6, v2, v6}, Landroid/view/View;->setPadding(IIII)V

    const/16 v2, 0xf

    .line 21
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->titleColor(Lcom/mr/elaris/InAppSettings;)I

    move-result v3

    .line 22
    invoke-virtual {p0, p1, v2, v3, v0}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object p1

    .line 23
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 24
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 25
    invoke-virtual {v7, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    .line 26
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    float-to-int p1, p6

    .line 27
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    move-result p6

    .line 28
    invoke-virtual {p0, p2, p1, p6, v6}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v3

    .line 29
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 p1, 0x2

    .line 30
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 31
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    const/high16 p1, 0x40800000    # 4.0f

    .line 32
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result p1

    invoke-virtual {v3, v6, p1, v6, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 33
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz p5, :cond_0

    .line 34
    iput-object v3, p0, Lcom/mr/elaris/InAppSettings;->repeaterModeSummaryView:Landroid/widget/TextView;

    .line 35
    :cond_0
    new-instance v0, Lcom/mr/elaris/InAppSettingsWidgets$6;

    move-object v2, p0

    move/from16 v4, p10

    invoke-direct/range {v0 .. v5}, Lcom/mr/elaris/InAppSettingsWidgets$6;-><init>(Landroid/widget/LinearLayout;Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;FF)V

    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 36
    :cond_1
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p2, -0x2

    const/high16 p5, 0x3f800000    # 1.0f

    invoke-direct {p1, v6, p2, p5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v7, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    new-instance p1, Lcom/mr/elaris/InAppSettings$ToggleView;

    iget-object p2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {p1, p0, p2}, Lcom/mr/elaris/InAppSettings$ToggleView;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/content/Context;)V

    .line 38
    invoke-virtual {p1, p3}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 39
    invoke-static {p0, v1, p1}, Lcom/mr/elaris/InAppSettingsWidgets;->addToggleSlot(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Lcom/mr/elaris/InAppSettings$ToggleView;)V

    .line 40
    new-instance p0, Lcom/mr/elaris/InAppSettingsWidgets$7;

    invoke-direct {p0, p4, p1}, Lcom/mr/elaris/InAppSettingsWidgets$7;-><init>(Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;Lcom/mr/elaris/InAppSettings$ToggleView;)V

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v1
.end method

.method public static dialogButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Z)Landroid/widget/TextView;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsDialogWidgets;->button(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static dialogPanel(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsDialogWidgets;->panel(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static divider(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->dividerColor(Lcom/mr/elaris/InAppSettings;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    const/high16 v2, 0x41900000    # 18.0f

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput p0, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method private static isClickableRow(Landroid/view/View;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static moduleListCard(Lcom/mr/elaris/InAppSettings;[Landroid/view/View;)Landroid/view/View;
    .locals 9

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
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->menuSoftPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    const/high16 v1, 0x41000000    # 8.0f

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/high16 v3, 0x41200000    # 10.0f

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0, v2, v4, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 53
    .line 54
    const/high16 v3, 0x3f800000    # 1.0f

    .line 55
    .line 56
    mul-float/2addr v2, v3

    .line 57
    invoke-virtual {v0, v2}, Landroid/view/View;->setElevation(F)V

    .line 58
    .line 59
    .line 60
    sget v2, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CARD_AMBIENT_SHADOW_COLOR:I

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->setOutlineAmbientShadowColor(I)V

    .line 63
    .line 64
    .line 65
    sget v2, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CARD_SPOT_SHADOW_COLOR:I

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/view/View;->setOutlineSpotShadowColor(I)V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationZ(F)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsWidgets;->clickableRowCount([Landroid/view/View;)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    array-length v3, p1

    .line 79
    const/4 v4, 0x0

    .line 80
    move v5, v4

    .line 81
    :goto_0
    if-ge v4, v3, :cond_2

    .line 82
    .line 83
    aget-object v6, p1, v4

    .line 84
    .line 85
    invoke-static {v6}, Lcom/mr/elaris/InAppSettingsWidgets;->isClickableRow(Landroid/view/View;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_0

    .line 90
    .line 91
    invoke-virtual {p0, v5, v2}, Lcom/mr/elaris/InAppSettings;->moduleListRowBackground(II)Landroid/graphics/drawable/StateListDrawable;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    :cond_0
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    if-eqz v7, :cond_1

    .line 104
    .line 105
    if-ge v5, v2, :cond_1

    .line 106
    .line 107
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsWidgets;->moduleMenuDivider(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 118
    .line 119
    const/4 v2, -0x1

    .line 120
    const/4 v3, -0x2

    .line 121
    invoke-direct {p1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    iput p0, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    .line 133
    return-object v0
.end method

.method private static moduleMenuDivider(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->dividerColor(Lcom/mr/elaris/InAppSettings;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const v1, 0x3f3851ec    # 0.72f

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const v1, 0x3f0ccccd    # 0.55f

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 36
    .line 37
    .line 38
    const/high16 v2, 0x41f00000    # 30.0f

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 45
    .line 46
    const/high16 v2, 0x41900000    # 18.0f

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    iput p0, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public static moduleRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 6

    .line 1
    new-instance p3, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-virtual {p3, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    const/high16 v1, 0x41600000    # 14.0f

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/high16 v2, 0x41000000    # 8.0f

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/high16 v4, 0x41200000    # 10.0f

    .line 30
    .line 31
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {p3, v1, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    const/high16 v1, 0x42880000    # 68.0f

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p3, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {p3, v1}, Landroid/view/View;->setClickable(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, p5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 62
    .line 63
    .line 64
    move-result-object p5

    .line 65
    invoke-virtual {p3, p5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p4}, Lcom/mr/elaris/InAppSettings;->accentStrip(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    new-instance p5, Landroid/widget/LinearLayout$LayoutParams;

    .line 73
    .line 74
    const/high16 v3, 0x40400000    # 3.0f

    .line 75
    .line 76
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    const/high16 v4, 0x42100000    # 36.0f

    .line 81
    .line 82
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-direct {p5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, p4, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    new-instance p4, Landroid/widget/LinearLayout;

    .line 93
    .line 94
    iget-object p5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 95
    .line 96
    invoke-direct {p4, p5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p4, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 100
    .line 101
    .line 102
    const/high16 p5, 0x41500000    # 13.0f

    .line 103
    .line 104
    invoke-virtual {p0, p5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 105
    .line 106
    .line 107
    move-result p5

    .line 108
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-virtual {p4, p5, v0, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 113
    .line 114
    .line 115
    const/16 p5, 0xf

    .line 116
    .line 117
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->titleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {p0, p1, p5, v2, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    if-eqz p2, :cond_0

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-lez p1, :cond_0

    .line 135
    .line 136
    const/16 p1, 0xc

    .line 137
    .line 138
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 139
    .line 140
    .line 141
    move-result p5

    .line 142
    invoke-virtual {p0, p2, p1, p5, v0}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const/high16 p2, 0x40800000    # 4.0f

    .line 147
    .line 148
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    invoke-virtual {p1, v0, p2, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    .line 157
    .line 158
    :cond_0
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 159
    .line 160
    const/4 p2, -0x2

    .line 161
    const/high16 p5, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-direct {p1, v0, p2, p5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3, p4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 167
    .line 168
    .line 169
    new-instance p1, Landroid/widget/FrameLayout;

    .line 170
    .line 171
    iget-object p2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 172
    .line 173
    invoke-direct {p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 174
    .line 175
    .line 176
    const p2, 0x3f0ccccd    # 0.55f

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 180
    .line 181
    .line 182
    new-instance p2, Lcom/mr/elaris/InAppSettingsChevronRightView;

    .line 183
    .line 184
    invoke-direct {p2, p0}, Lcom/mr/elaris/InAppSettingsChevronRightView;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 185
    .line 186
    .line 187
    new-instance p4, Landroid/widget/FrameLayout$LayoutParams;

    .line 188
    .line 189
    const/high16 p5, 0x41a00000    # 20.0f

    .line 190
    .line 191
    invoke-virtual {p0, p5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    invoke-virtual {p0, p5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 196
    .line 197
    .line 198
    move-result p5

    .line 199
    invoke-direct {p4, v0, p5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 200
    .line 201
    .line 202
    const/16 p5, 0x11

    .line 203
    .line 204
    iput p5, p4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 205
    .line 206
    invoke-virtual {p1, p2, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 207
    .line 208
    .line 209
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 210
    .line 211
    const/high16 p4, 0x41b00000    # 22.0f

    .line 212
    .line 213
    invoke-virtual {p0, p4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    const/4 p4, -0x1

    .line 218
    invoke-direct {p2, p0, p4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 222
    .line 223
    .line 224
    return-object p3
.end method

.method private static pressedButtonBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 8
    .line 9
    const v1, 0x3f4ccccd    # 0.8f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v0, 0xf2

    .line 18
    .line 19
    const/16 v1, 0xff

    .line 20
    .line 21
    const/16 v2, 0xe8

    .line 22
    .line 23
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    sget v1, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 34
    .line 35
    const v2, 0x3f1eb852    # 0.62f

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1, v2}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    sget v1, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CONTROL_STROKE_COLOR:I

    .line 44
    .line 45
    :goto_1
    const/high16 v2, 0x41400000    # 12.0f

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {v0, p0}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-virtual {p0, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 57
    .line 58
    .line 59
    return-object p0
.end method

.method public static pressedRowColor(Lcom/mr/elaris/InAppSettings;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x2f

    .line 8
    .line 9
    const/16 v0, 0x38

    .line 10
    .line 11
    const/16 v1, 0x2b

    .line 12
    .line 13
    :goto_0
    invoke-static {v1, p0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/16 p0, 0xf1

    .line 19
    .line 20
    const/16 v0, 0xf5

    .line 21
    .line 22
    const/16 v1, 0xef

    .line 23
    .line 24
    goto :goto_0
.end method

.method public static settingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;)Landroid/view/View;
    .locals 9

    .line 1
    new-instance v4, Lcom/mr/elaris/InAppSettingsWidgets$5;

    .line 2
    .line 3
    invoke-direct {v4, p4}, Lcom/mr/elaris/InAppSettingsWidgets$5;-><init>(Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;)V

    .line 4
    .line 5
    .line 6
    const/high16 v7, 0x41900000    # 18.0f

    .line 7
    .line 8
    const/high16 v8, 0x41000000    # 8.0f

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/high16 v6, 0x41400000    # 12.0f

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move v3, p3

    .line 17
    invoke-static/range {v0 .. v8}, Lcom/mr/elaris/InAppSettingsWidgets;->createSettingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFF)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static statPill(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;I)Landroid/widget/TextView;
    .locals 4

    .line 1
    sget v0, Lcom/mr/elaris/InAppSettings;->GREEN:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    if-eqz v0, :cond_2

    .line 18
    .line 19
    sget p2, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_GREEN_TEXT_COLOR:I

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    sget p2, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->BUTTON_TEXT_COLOR:I

    .line 23
    .line 24
    :goto_1
    const/16 v3, 0xe

    .line 25
    .line 26
    invoke-virtual {p0, p1, v3, p2, v2}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/16 p2, 0x11

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 36
    .line 37
    .line 38
    sget-object p2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 41
    .line 42
    .line 43
    const/high16 p2, 0x42100000    # 36.0f

    .line 44
    .line 45
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 50
    .line 51
    .line 52
    const/high16 p2, 0x41200000    # 10.0f

    .line 53
    .line 54
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-virtual {p1, v1, v2, p2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->statusBackground(Lcom/mr/elaris/InAppSettings;Z)Landroid/graphics/drawable/GradientDrawable;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    return-object p1
.end method

.method public static switchDetailRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 7

    .line 1
    const/4 v5, 0x1

    .line 2
    const/4 v6, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-static/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRowInternal(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static switchDetailRowInternal(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)Landroid/view/View;
    .locals 13

    .line 1
    invoke-virtual/range {p0 .. p1}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    new-instance v4, Lcom/mr/elaris/InAppSettingsWidgets$2;

    .line 6
    .line 7
    move-object v5, p0

    .line 8
    move-object v6, p1

    .line 9
    move-object/from16 v9, p4

    .line 10
    .line 11
    move/from16 v7, p5

    .line 12
    .line 13
    move/from16 v8, p6

    .line 14
    .line 15
    invoke-direct/range {v4 .. v9}, Lcom/mr/elaris/InAppSettingsWidgets$2;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;ZZLandroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    const/high16 v7, 0x41900000    # 18.0f

    .line 19
    .line 20
    const/high16 v8, 0x41000000    # 8.0f

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    const/high16 v6, 0x41400000    # 12.0f

    .line 24
    .line 25
    move-object v0, p0

    .line 26
    move-object v1, p2

    .line 27
    move-object/from16 v2, p3

    .line 28
    .line 29
    invoke-static/range {v0 .. v8}, Lcom/mr/elaris/InAppSettingsWidgets;->createSettingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFF)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroid/widget/LinearLayout;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x1

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    sub-int/2addr v0, v1

    .line 49
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    instance-of v3, v0, Landroid/widget/FrameLayout;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    move-object v10, v0

    .line 58
    check-cast v10, Landroid/widget/FrameLayout;

    .line 59
    .line 60
    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-lez v0, :cond_2

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    instance-of v3, v3, Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 72
    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    move-object v6, v3

    .line 80
    check-cast v6, Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 81
    .line 82
    invoke-virtual {v10, v1}, Landroid/view/View;->setClickable(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_1

    .line 101
    .line 102
    const-string v1, "\uff0c\u5df2\u5f00\u542f"

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    const-string v1, "\uff0c\u5df2\u5173\u95ed"

    .line 106
    .line 107
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v10, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    new-instance v5, Lcom/mr/elaris/InAppSettingsWidgets$3;

    .line 118
    .line 119
    move-object v7, p0

    .line 120
    move-object v8, p1

    .line 121
    move-object v11, p2

    .line 122
    move/from16 v9, p5

    .line 123
    .line 124
    move/from16 v12, p6

    .line 125
    .line 126
    invoke-direct/range {v5 .. v12}, Lcom/mr/elaris/InAppSettingsWidgets$3;-><init>(Lcom/mr/elaris/InAppSettings$ToggleView;Lcom/mr/elaris/InAppSettings;Ljava/lang/String;ZLandroid/widget/FrameLayout;Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    return-object v2
.end method

.method public static switchDetailRowSilent(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x1

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-static/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRowInternal(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static switchRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    new-instance v4, Lcom/mr/elaris/InAppSettingsWidgets$1;

    .line 6
    .line 7
    invoke-direct {v4, p0, p1}, Lcom/mr/elaris/InAppSettingsWidgets$1;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "message_repeater"

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    const/high16 v7, 0x41900000    # 18.0f

    .line 17
    .line 18
    const/high16 v8, 0x41000000    # 8.0f

    .line 19
    .line 20
    const/high16 v6, 0x41400000    # 12.0f

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p2

    .line 24
    move-object v2, p3

    .line 25
    invoke-static/range {v0 .. v8}, Lcom/mr/elaris/InAppSettingsWidgets;->createSettingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFF)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static switchRowCompactDescription(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    new-instance v4, Lcom/mr/elaris/InAppSettingsWidgets$4;

    .line 6
    .line 7
    invoke-direct {v4, p0, p1}, Lcom/mr/elaris/InAppSettingsWidgets$4;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/high16 v7, 0x41800000    # 16.0f

    .line 11
    .line 12
    const/high16 v8, 0x40c00000    # 6.0f

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/high16 v6, 0x41400000    # 12.0f

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v1, p2

    .line 19
    move-object v2, p3

    .line 20
    invoke-static/range {v0 .. v8}, Lcom/mr/elaris/InAppSettingsWidgets;->createSettingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFF)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static text(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;III)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "ELARIS_SETTINGS_VIEW"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    int-to-float p1, p2

    .line 18
    invoke-virtual {v0, p0, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    const/4 p1, 0x0

    .line 26
    if-ne p4, p0, :cond_0

    .line 27
    .line 28
    const-string p0, "sans-serif-medium"

    .line 29
    .line 30
    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p0, "sans-serif"

    .line 36
    .line 37
    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method
