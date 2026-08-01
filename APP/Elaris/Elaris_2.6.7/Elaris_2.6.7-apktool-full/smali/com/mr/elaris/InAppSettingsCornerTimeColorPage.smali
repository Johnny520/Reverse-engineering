.class final Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;,
        Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;,
        Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$SimpleSeekListener;
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

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->applyDialogWindow(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static applyDialogWindow(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/high16 v0, 0x43840000    # 264.0f

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->dialogWidth()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/high16 v2, 0x41c00000    # 24.0f

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    sub-int/2addr v1, p0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const/4 v0, -0x2

    .line 32
    invoke-virtual {p1, p0, v0}, Landroid/view/Window;->setLayout(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    :cond_0
    return-void
.end method

.method private static applyFormatOptionStyle(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

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
    if-eqz p2, :cond_1

    .line 16
    .line 17
    sget v1, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 18
    .line 19
    const v2, 0x3ee66666    # 0.45f

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget v1, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 28
    .line 29
    :goto_1
    if-eqz p2, :cond_2

    .line 30
    .line 31
    sget v2, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    sget v2, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 35
    .line 36
    :goto_2
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 40
    .line 41
    invoke-virtual {p1, v2, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 42
    .line 43
    .line 44
    const/high16 p2, 0x41000000    # 8.0f

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-virtual {p0, v0, p2, v1, v2}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static bridge synthetic b(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->applyFormatOptionStyle(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic c(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->colorHex(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static colorHex(I)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "#%08X"

    .line 12
    .line 13
    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private static createHideOfficialRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
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
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 19
    .line 20
    .line 21
    const/high16 v4, 0x40e00000    # 7.0f

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {v0, v1, v5, v1, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 37
    .line 38
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 45
    .line 46
    .line 47
    const/16 v2, 0xe

    .line 48
    .line 49
    sget v5, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 50
    .line 51
    const-string v6, "\u9690\u85cf\u5b98\u65b9\u65f6\u95f4"

    .line 52
    .line 53
    invoke-virtual {p0, v6, v2, v5, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    const/16 v2, 0xc

    .line 61
    .line 62
    sget v3, Lcom/mr/elaris/InAppSettings;->NOTE:I

    .line 63
    .line 64
    const-string v5, "\u9690\u85cf\u804a\u5929\u4e2d\u95f4 QQ \u81ea\u5e26\u7684\u65f6\u95f4\u63d0\u793a"

    .line 65
    .line 66
    invoke-virtual {p0, v5, v2, v3, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/high16 v3, 0x40000000    # 2.0f

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {v2, v1, v3, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 83
    .line 84
    const/4 v3, -0x2

    .line 85
    const/high16 v5, 0x3f800000    # 1.0f

    .line 86
    .line 87
    invoke-direct {v2, v1, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 88
    .line 89
    .line 90
    const/high16 v1, 0x41000000    # 8.0f

    .line 91
    .line 92
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iput v1, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 97
    .line 98
    invoke-virtual {v0, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 102
    .line 103
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 104
    .line 105
    invoke-direct {v1, p0, v2}, Lcom/mr/elaris/InAppSettings$ToggleView;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    const-string v2, "hide_official_center_time"

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->getBool(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-virtual {v1, v2}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v0, v1}, Lcom/mr/elaris/InAppSettings;->addToggleSlot(Landroid/widget/LinearLayout;Lcom/mr/elaris/InAppSettings$ToggleView;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$12;

    .line 121
    .line 122
    invoke-direct {v2, p0, v1}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$12;-><init>(Lcom/mr/elaris/InAppSettings;Lcom/mr/elaris/InAppSettings$ToggleView;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    .line 127
    .line 128
    return-object v0
.end method

.method public static createTimeSwitchRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "chat_message_corner_time"

    .line 7
    .line 8
    const-string v2, "\u663e\u793a\u7cbe\u786e\u6d88\u606f\u65f6\u95f4"

    .line 9
    .line 10
    const-string v3, "\u5728\u6d88\u606f\u53f3\u4e0b\u89d2\u663e\u793a\u65f6\u95f4\uff0c\u70b9\u51fb\u8fdb\u5165\u683c\u5f0f\u4e0e\u989c\u8272\u9762\u677f"

    .line 11
    .line 12
    invoke-static {p0, v1, v2, v3, v0}, Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static bridge synthetic d(Lcom/mr/elaris/InAppSettings;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static showDialog(Lcom/mr/elaris/InAppSettings;)V
    .locals 33

    move-object/from16 v5, p0

    .line 1
    const-string v0, "AM11:59"

    const-string v1, "HH:mm"

    :try_start_0
    const-string v2, "chat_message_corner_time_color"

    .line 2
    invoke-virtual {v5, v2}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    sget v3, Lg1;->a:I

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v4, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    :catchall_0
    :cond_1
    :goto_0
    :try_start_2
    const-string v2, "chat_message_corner_time_format"

    .line 6
    invoke-virtual {v5, v2}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 7
    sget-object v4, Lp2;->a:Ljava/lang/ThreadLocal;

    if-nez v2, :cond_2

    .line 8
    const-string v2, ""

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 9
    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string v6, "HH:mm:ss"

    const-string v7, "ah:mm"

    if-nez v4, :cond_4

    .line 10
    :try_start_3
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 11
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v7

    .line 12
    :cond_4
    :goto_2
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v10

    .line 13
    new-instance v9, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    invoke-direct {v9, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;-><init>(I)V

    .line 14
    new-instance v4, Landroid/widget/LinearLayout;

    iget-object v8, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v4, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v8, 0x1

    .line 15
    invoke-virtual {v4, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 16
    const-string v11, "elaris_dialog_surface"

    invoke-virtual {v4, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/high16 v11, 0x41800000    # 16.0f

    .line 17
    invoke-virtual {v5, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v11

    const/high16 v12, 0x41400000    # 12.0f

    .line 18
    invoke-virtual {v5, v12}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v13

    const/high16 v14, 0x41200000    # 10.0f

    invoke-virtual {v5, v14}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v14

    invoke-virtual {v4, v11, v13, v11, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 19
    invoke-virtual {v5}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v11

    invoke-virtual {v4, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    const-string v11, "\u65f6\u95f4\u6837\u5f0f"

    sget v13, Lcom/mr/elaris/InAppSettings;->TEXT:I

    const/16 v14, 0x11

    invoke-virtual {v5, v11, v14, v13, v8}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v11

    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 21
    new-instance v11, Landroid/widget/LinearLayout;

    iget-object v13, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v11, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v13, 0x0

    .line 22
    invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v15, 0x10

    .line 23
    invoke-virtual {v11, v15}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 24
    filled-new-array {v1, v6, v7}, [Ljava/lang/String;

    move-result-object v1

    .line 25
    const-string v6, "H:mm"

    const-string v7, "H:mm:ss"

    const-string v15, "a h:mm"

    filled-new-array {v6, v7, v15}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x3

    .line 26
    new-array v15, v7, [Landroid/widget/TextView;

    move v12, v13

    :goto_3
    if-ge v12, v7, :cond_6

    .line 27
    aget-object v7, v6, v12

    sget v8, Lcom/mr/elaris/InAppSettings;->TEXT:I

    const/16 v14, 0xe

    invoke-virtual {v5, v7, v14, v8, v13}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v7

    .line 28
    aget-object v8, v1, v12

    invoke-virtual {v7, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v8, 0x11

    .line 29
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v8, 0x1

    .line 30
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 31
    invoke-virtual {v7, v8}, Landroid/view/View;->setClickable(Z)V

    .line 32
    invoke-virtual {v7, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 33
    aget-object v8, v1, v12

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-static {v5, v7, v8}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->applyFormatOptionStyle(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Z)V

    .line 34
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v14, 0x42040000    # 33.0f

    .line 35
    invoke-virtual {v5, v14}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v14

    move-object/from16 v20, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v8, v13, v14, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    if-lez v12, :cond_5

    const/high16 v1, 0x40c00000    # 6.0f

    .line 36
    invoke-virtual {v5, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v1

    iput v1, v8, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    goto :goto_4

    :catchall_1
    move-exception v0

    goto/16 :goto_7

    .line 37
    :cond_5
    :goto_4
    invoke-virtual {v11, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    aput-object v7, v15, v12

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, v20

    const/4 v7, 0x3

    const/16 v14, 0x11

    goto :goto_3

    :cond_6
    move-object/from16 v20, v1

    .line 39
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    const/4 v2, -0x1

    invoke-direct {v1, v2, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v6, 0x40c00000    # 6.0f

    .line 40
    invoke-virtual {v5, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v8

    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/high16 v8, 0x41000000    # 8.0f

    .line 41
    invoke-virtual {v5, v8}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v12

    iput v12, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 42
    invoke-virtual {v4, v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    invoke-static {v5}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->createHideOfficialRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 44
    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v11, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v1, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-virtual {v1, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v11, 0xf

    const/4 v12, 0x1

    .line 46
    invoke-virtual {v5, v0, v11, v3, v12}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v14

    .line 47
    invoke-virtual {v5, v0, v11, v3, v12}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v0

    .line 48
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 49
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 50
    sget-object v11, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 51
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v11, 0x11

    .line 52
    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 53
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v11, 0xfa

    const/16 v12, 0xfc

    const/16 v6, 0xf8

    .line 54
    invoke-static {v6, v11, v12}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    const/high16 v11, 0x41400000    # 12.0f

    invoke-virtual {v5, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v12

    const/16 v11, 0xe8

    const/16 v7, 0xf0

    const/16 v2, 0xe2

    .line 55
    invoke-static {v2, v11, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    const/4 v7, 0x1

    .line 56
    invoke-virtual {v5, v6, v12, v2, v7}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v14, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0x2e

    const/16 v6, 0x40

    const/16 v7, 0x34

    .line 57
    invoke-static {v2, v7, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    const/high16 v11, 0x41400000    # 12.0f

    invoke-virtual {v5, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v11

    const/16 v12, 0x4f

    const/16 v7, 0x5e

    const/16 v6, 0x47

    .line 58
    invoke-static {v6, v12, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    const/4 v7, 0x1

    .line 59
    invoke-virtual {v5, v2, v11, v6, v7}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 60
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x42100000    # 36.0f

    .line 61
    invoke-virtual {v5, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v6

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v2, v13, v6, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 62
    invoke-virtual {v1, v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    new-instance v2, Landroid/widget/Space;

    iget-object v6, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v2, v6}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 64
    invoke-virtual {v5, v8}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v8

    const/4 v12, 0x1

    invoke-direct {v6, v8, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 65
    invoke-virtual {v1, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 67
    invoke-virtual {v5, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v6

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v2, v13, v6, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 68
    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v5, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v6

    const/4 v8, -0x1

    invoke-direct {v2, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 70
    invoke-static {v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->colorHex(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/mr/elaris/InAppSettings;->NOTE:I

    const/16 v6, 0xc

    invoke-virtual {v5, v1, v6, v2, v13}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v1

    const/4 v12, 0x1

    .line 71
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v2, 0x40000000    # 2.0f

    .line 72
    invoke-virtual {v5, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v2

    const/high16 v6, 0x40800000    # 4.0f

    invoke-virtual {v5, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v8

    invoke-virtual {v1, v13, v2, v13, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 73
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    new-instance v2, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;

    iget-object v8, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v2, v8}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;-><init>(Landroid/content/Context;)V

    .line 75
    invoke-virtual {v2, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->setColor(I)V

    .line 76
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x42c00000    # 96.0f

    invoke-virtual {v5, v8}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v8

    const/4 v12, -0x1

    invoke-direct {v3, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    const-string v3, "\u4eae\u5ea6"

    sget v8, Lcom/mr/elaris/InAppSettings;->TEXT:I

    const/16 v12, 0xd

    const/4 v6, 0x1

    invoke-virtual {v5, v3, v12, v8, v6}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v3

    const/high16 v6, 0x40400000    # 3.0f

    .line 78
    invoke-virtual {v5, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v6

    invoke-virtual {v3, v13, v6, v13, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 79
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    new-instance v6, Landroid/widget/SeekBar;

    iget-object v8, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v6, v8}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 81
    invoke-static {v5, v6}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->styleSeekBar(Lcom/mr/elaris/InAppSettings;Landroid/widget/SeekBar;)V

    const/16 v8, 0x64

    .line 82
    invoke-virtual {v6, v8}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 83
    iget-object v8, v9, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->hsv:[F

    const/16 v22, 0x2

    aget v8, v8, v22

    const/high16 v22, 0x42c80000    # 100.0f

    mul-float v8, v8, v22

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-virtual {v6, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 84
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v11, 0x41d00000    # 26.0f

    move/from16 v23, v13

    invoke-virtual {v5, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v13

    const/4 v7, -0x1

    invoke-direct {v8, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    const-string v7, "\u900f\u660e\u5ea6"

    sget v8, Lcom/mr/elaris/InAppSettings;->TEXT:I

    const/4 v13, 0x1

    invoke-virtual {v5, v7, v12, v8, v13}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    move-result-object v7

    .line 86
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    new-instance v8, Landroid/widget/SeekBar;

    iget-object v12, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v8, v12}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 88
    invoke-static {v5, v8}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->styleSeekBar(Lcom/mr/elaris/InAppSettings;Landroid/widget/SeekBar;)V

    const/16 v12, 0x40

    .line 89
    invoke-virtual {v8, v12}, Landroid/widget/ProgressBar;->setMin(I)V

    const/16 v12, 0xff

    .line 90
    invoke-virtual {v8, v12}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 91
    iget v13, v9, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->alpha:I

    invoke-virtual {v8, v13}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 92
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v5, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v11

    move-object/from16 v17, v0

    const/4 v0, -0x1

    invoke-direct {v13, v0, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v8, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v13, 0x1

    .line 93
    new-array v11, v13, [Z

    aput-boolean v23, v11, v23

    move-object/from16 v18, v11

    move/from16 v21, v12

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    move-object/from16 v24, v8

    .line 95
    new-instance v8, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;

    move-object v13, v15

    move-object v15, v1

    move-object v1, v4

    move-object v4, v13

    move-object/from16 v16, v3

    move-object v13, v14

    move-object/from16 v14, v17

    const/16 v3, 0x10

    move-object/from16 v17, v7

    move/from16 v7, v23

    invoke-direct/range {v8 .. v17}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$2;-><init>(Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;[Ljava/lang/String;JLandroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 96
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    move v13, v7

    :goto_5
    const/4 v11, 0x3

    if-ge v13, v11, :cond_7

    .line 97
    aget-object v12, v4, v13

    move v14, v0

    new-instance v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;

    move-object v11, v8

    move-object v8, v1

    move-object v1, v10

    move-object v10, v6

    move-object v6, v11

    move-object v15, v2

    move v11, v3

    move v3, v13

    move-object/from16 v14, v18

    move-object/from16 v2, v20

    move-object/from16 v13, v24

    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;-><init>([Ljava/lang/String;[Ljava/lang/String;I[Landroid/widget/TextView;Lcom/mr/elaris/InAppSettings;Ljava/lang/Runnable;)V

    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v0, v3, 0x1

    move-object v3, v10

    move-object v10, v1

    move-object v1, v8

    move-object v8, v6

    move-object v6, v3

    move-object/from16 v20, v2

    move v3, v11

    move-object/from16 v24, v13

    move-object/from16 v18, v14

    move-object v2, v15

    const/16 v21, 0xff

    move v13, v0

    const/4 v0, -0x1

    goto :goto_5

    :cond_7
    move-object v11, v8

    move-object v8, v1

    move-object v1, v10

    move-object v10, v6

    move-object v6, v11

    move-object v15, v2

    move v11, v3

    move-object/from16 v14, v18

    move-object/from16 v13, v24

    .line 98
    new-instance v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;

    invoke-direct {v0, v14, v9, v6}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;-><init>([ZLcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;Ljava/lang/Runnable;)V

    invoke-virtual {v15, v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->setListener(Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;)V

    .line 99
    new-instance v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$5;

    invoke-direct {v0, v14, v9, v6}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$5;-><init>([ZLcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;Ljava/lang/Runnable;)V

    invoke-virtual {v10, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 100
    new-instance v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;

    invoke-direct {v0, v14, v9, v6}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;-><init>([ZLcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;Ljava/lang/Runnable;)V

    invoke-virtual {v13, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 101
    new-instance v0, Landroid/widget/HorizontalScrollView;

    iget-object v2, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 102
    invoke-virtual {v0, v7}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    const/4 v2, 0x1

    .line 103
    invoke-virtual {v0, v2}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    .line 104
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v4, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 105
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 106
    invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 107
    sget v25, Lg1;->a:I

    const/16 v4, 0x5a

    const/16 v11, 0x66

    const/16 v12, 0x55

    .line 108
    invoke-static {v12, v4, v11}, Landroid/graphics/Color;->rgb(III)I

    move-result v28

    const/16 v4, 0x84

    const/16 v11, 0xff

    const/16 v12, 0x34

    .line 109
    invoke-static {v12, v4, v11}, Landroid/graphics/Color;->rgb(III)I

    move-result v29

    const/16 v4, 0xbe

    const/16 v11, 0x8f

    const/16 v12, 0x22

    .line 110
    invoke-static {v12, v4, v11}, Landroid/graphics/Color;->rgb(III)I

    move-result v30

    const/16 v4, 0xef

    const/16 v11, 0x44

    .line 111
    invoke-static {v4, v11, v11}, Landroid/graphics/Color;->rgb(III)I

    move-result v31

    const/16 v4, 0x9e

    const/16 v11, 0xb

    const/16 v12, 0xf5

    .line 112
    invoke-static {v12, v4, v11}, Landroid/graphics/Color;->rgb(III)I

    move-result v32

    const/16 v26, -0x1

    const/high16 v27, -0x1000000

    filled-new-array/range {v25 .. v32}, [I

    move-result-object v4

    move v11, v7

    :goto_6
    const/16 v2, 0x8

    if-ge v11, v2, :cond_8

    move-object/from16 v24, v13

    .line 113
    aget v13, v4, v11

    .line 114
    new-instance v2, Landroid/view/View;

    iget-object v7, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v2, v7}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 115
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u9009\u62e9\u989c\u8272 "

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v13}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->colorHex(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 116
    invoke-static {v5, v13}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->swatchDrawable(Lcom/mr/elaris/InAppSettings;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 117
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v19, v4

    const/high16 v12, 0x41c00000    # 24.0f

    .line 118
    invoke-virtual {v5, v12}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v4

    invoke-virtual {v5, v12}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v12

    invoke-direct {v7, v4, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x40c00000    # 6.0f

    .line 119
    invoke-virtual {v5, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v12

    iput v12, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 120
    invoke-virtual {v3, v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move v7, v11

    .line 121
    new-instance v11, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;

    move-object/from16 v18, v6

    move-object v12, v9

    move-object/from16 v16, v10

    move-object/from16 v17, v24

    invoke-direct/range {v11 .. v18}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;-><init>(Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;I[ZLcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Ljava/lang/Runnable;)V

    move-object v9, v12

    move-object/from16 v24, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v14

    invoke-virtual {v2, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v11, v7, 0x1

    move-object/from16 v10, v16

    move-object/from16 v14, v18

    move-object/from16 v4, v19

    move-object/from16 v13, v24

    const/4 v2, 0x1

    const/4 v7, 0x0

    goto :goto_6

    :cond_8
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/high16 v12, 0x41c00000    # 24.0f

    invoke-virtual {v5, v12}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v6

    const/4 v7, -0x2

    invoke-direct {v2, v7, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3, v2}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x41e00000    # 28.0f

    .line 124
    invoke-virtual {v5, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v3

    const/4 v7, -0x1

    invoke-direct {v2, v7, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v3, 0x40800000    # 4.0f

    .line 125
    invoke-virtual {v5, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v3

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 126
    invoke-virtual {v8, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v10

    .line 128
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v2, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    .line 129
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 130
    const-string v3, "\u6062\u590d\u9ed8\u8ba4"

    invoke-virtual {v5, v3, v2}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    move-result-object v3

    .line 131
    const-string v6, "\u53d6\u6d88"

    invoke-virtual {v5, v6, v2}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    move-result-object v6

    .line 132
    const-string v11, "\u4fdd\u5b58"

    const/4 v12, 0x1

    invoke-virtual {v5, v11, v12}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    move-result-object v11

    .line 133
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x42100000    # 36.0f

    .line 134
    invoke-virtual {v5, v13}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v13

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v12, v2, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 135
    invoke-virtual {v0, v3, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    invoke-virtual {v0, v6, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    invoke-virtual {v0, v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v2, v7, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 139
    invoke-virtual {v5, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    move-result v4

    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 140
    invoke-virtual {v8, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object v0, v11

    .line 141
    new-instance v11, Landroid/widget/ScrollView;

    iget-object v2, v5, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    invoke-direct {v11, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    .line 142
    invoke-virtual {v11, v12}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 143
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v2, v7, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v11, v8, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 144
    invoke-virtual/range {v10 .. v15}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 145
    new-instance v2, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$8;

    invoke-direct {v2, v5, v10}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$8;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    invoke-virtual {v10, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 146
    new-instance v2, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;

    invoke-direct {v2, v5, v10}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    new-instance v2, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$10;

    invoke-direct {v2, v10}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$10;-><init>(Landroid/app/AlertDialog;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    new-instance v2, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;

    invoke-direct {v2, v5, v9, v1, v10}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;-><init>(Lcom/mr/elaris/InAppSettings;Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;[Ljava/lang/String;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    .line 150
    invoke-static {v5, v10}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->applyDialogWindow(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    .line 151
    :goto_7
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "corner time settings dialog failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    const-string v2, ": "

    .line 153
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 154
    const-string v0, "\u65f6\u95f4\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25"

    invoke-virtual {v5, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    return-void
.end method

.method private static styleSeekBar(Lcom/mr/elaris/InAppSettings;Landroid/widget/SeekBar;)V
    .locals 3

    .line 1
    :try_start_0
    sget v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget v0, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->SWITCH_OFF_COLOR:I

    .line 20
    .line 21
    :goto_0
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 35
    .line 36
    .line 37
    sget v1, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 40
    .line 41
    .line 42
    const/high16 v1, 0x40200000    # 2.5f

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    int-to-float v1, v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 50
    .line 51
    .line 52
    const/high16 v1, 0x40a00000    # 5.0f

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/high16 v2, 0x41a00000    # 20.0f

    .line 59
    .line 60
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-virtual {v0, v1, p0}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/widget/AbsSeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :catchall_0
    return-void
.end method

.method private static swatchDrawable(Lcom/mr/elaris/InAppSettings;I)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    sget p1, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 20
    .line 21
    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
