.class final Lcom/mr/elaris/InAppSettingsThemePage;
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

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettings;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsThemePage;->showThemePicker(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsThemePage;->themeRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {v0}, [Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "\u4e3b\u9898\u8bbe\u7f6e"

    .line 10
    .line 11
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static label(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "light"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "\u6d45\u8272"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "dark"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    const-string p0, "\u6df1\u8272"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string p0, "\u8ddf\u968f\u7cfb\u7edf"

    .line 24
    .line 25
    return-object p0
.end method

.method public static saveMode(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Landroid/app/AlertDialog;)V
    .locals 2

    .line 1
    const-string v0, "light"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "dark"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "system"

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move-object p1, v0

    .line 26
    :cond_0
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->themeMode()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    const-string p2, "ui_theme_mode"

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, p2, p1, v0}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->applyThemePalette()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->refreshCurrentPage()V

    .line 51
    .line 52
    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, "\u4e3b\u9898\u5df2\u5207\u6362\uff1a"

    .line 56
    .line 57
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsThemePage;->label(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private static showThemePicker(Lcom/mr/elaris/InAppSettings;)V
    .locals 7

    .line 1
    const-string v0, "light"

    .line 2
    .line 3
    const-string v1, "dark"

    .line 4
    .line 5
    const-string v2, "system"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Landroid/widget/LinearLayout;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 20
    .line 21
    .line 22
    const-string v3, "elaris_dialog_surface"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/high16 v3, 0x41a00000    # 20.0f

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/high16 v5, 0x41900000    # 18.0f

    .line 34
    .line 35
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/high16 v6, 0x41800000    # 16.0f

    .line 44
    .line 45
    invoke-virtual {p0, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    invoke-virtual {v2, v4, v5, v3, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    .line 59
    const/16 v3, 0x14

    .line 60
    .line 61
    sget v4, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 62
    .line 63
    const-string v5, "\u4e3b\u9898"

    .line 64
    .line 65
    invoke-virtual {p0, v5, v3, v4, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/high16 v3, 0x40000000    # 2.0f

    .line 70
    .line 71
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const/high16 v4, 0x41400000    # 12.0f

    .line 76
    .line 77
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-virtual {v1, v3, v5, v5, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->themeMode()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    move v3, v5

    .line 93
    :goto_0
    const/4 v4, 0x3

    .line 94
    if-ge v3, v4, :cond_1

    .line 95
    .line 96
    aget-object v4, v0, v3

    .line 97
    .line 98
    invoke-static {p0, v4, v1}, Lcom/mr/elaris/InAppSettingsThemePage;->themeOptionRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    const/4 v4, 0x2

    .line 106
    if-ge v3, v4, :cond_0

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 113
    .line 114
    .line 115
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 119
    .line 120
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 121
    .line 122
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    :goto_1
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-ge v5, v0, :cond_3

    .line 134
    .line 135
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    instance-of v3, v3, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v3, :cond_2

    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/String;

    .line 154
    .line 155
    new-instance v4, Lcom/mr/elaris/InAppSettingsThemePage$2;

    .line 156
    .line 157
    invoke-direct {v4, p0, v3, v1}, Lcom/mr/elaris/InAppSettingsThemePage$2;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Landroid/app/AlertDialog;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_3
    const/4 v5, 0x0

    .line 167
    const/4 v6, 0x0

    .line 168
    const/4 v3, 0x0

    .line 169
    const/4 v4, 0x0

    .line 170
    invoke-virtual/range {v1 .. v6}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 171
    .line 172
    .line 173
    new-instance v0, Lcom/mr/elaris/InAppSettingsThemePage$3;

    .line 174
    .line 175
    invoke-direct {v0, p0, v1}, Lcom/mr/elaris/InAppSettingsThemePage$3;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public static summary(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "light"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "\u59cb\u7ec8\u4f7f\u7528\u6d45\u8272\u754c\u9762"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "dark"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    const-string p0, "\u59cb\u7ec8\u4f7f\u7528\u6df1\u8272\u754c\u9762"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string p0, "\u8ddf\u968f\u7cfb\u7edf\u6df1\u6d45\u8272\u5207\u6362"

    .line 24
    .line 25
    return-object p0
.end method

.method private static themeOptionRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    new-instance v0, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/high16 v2, 0x41800000    # 16.0f

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/high16 v4, 0x41400000    # 12.0f

    .line 31
    .line 32
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v0, v3, v5, v6, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 45
    .line 46
    .line 47
    const/high16 v3, 0x42800000    # 64.0f

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v0, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 54
    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 58
    .line 59
    .line 60
    if-eqz p2, :cond_0

    .line 61
    .line 62
    sget v4, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 63
    .line 64
    const v5, 0x3f666666    # 0.9f

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v4, v5}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p0, v4, v2}, Lcom/mr/elaris/InAppSettings;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Landroid/widget/LinearLayout;

    .line 88
    .line 89
    iget-object v4, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 90
    .line 91
    invoke-direct {v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsThemePage;->label(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-eqz p2, :cond_1

    .line 102
    .line 103
    sget v5, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    sget v5, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 107
    .line 108
    :goto_1
    const/16 v6, 0x11

    .line 109
    .line 110
    invoke-virtual {p0, v4, v6, v5, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsThemePage;->summary(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const/16 v5, 0xc

    .line 119
    .line 120
    sget v7, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 121
    .line 122
    invoke-virtual {p0, p1, v5, v7, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const/high16 v5, 0x40a00000    # 5.0f

    .line 127
    .line 128
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-virtual {p1, v1, v5, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 142
    .line 143
    const/4 v4, -0x2

    .line 144
    const/high16 v5, 0x3f800000    # 1.0f

    .line 145
    .line 146
    invoke-direct {p1, v1, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    .line 151
    .line 152
    if-eqz p2, :cond_2

    .line 153
    .line 154
    const-string p1, "\u2713"

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_2
    const-string p1, ""

    .line 158
    .line 159
    :goto_2
    const/16 p2, 0x18

    .line 160
    .line 161
    sget v1, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2, v1, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 168
    .line 169
    .line 170
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 171
    .line 172
    const/high16 v1, 0x42180000    # 38.0f

    .line 173
    .line 174
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    invoke-direct {p2, v2, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    .line 187
    .line 188
    return-object v0
.end method

.method private static themeRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
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
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    new-instance v4, Landroid/widget/LinearLayout;

    .line 61
    .line 62
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 63
    .line 64
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41000000    # 8.0f

    .line 74
    .line 75
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v4, v1, v1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 80
    .line 81
    .line 82
    const/16 v2, 0xf

    .line 83
    .line 84
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->titleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const-string v6, "\u4e3b\u9898"

    .line 89
    .line 90
    invoke-virtual {p0, v6, v2, v5, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const/16 v3, 0xc

    .line 95
    .line 96
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    const-string v6, "\u9009\u62e9 Elaris \u8bbe\u7f6e\u9875\u7684\u4e3b\u9898\u6a21\u5f0f"

    .line 101
    .line 102
    invoke-virtual {p0, v6, v3, v5, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/high16 v5, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-virtual {v3, v1, v5, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 122
    .line 123
    const/4 v3, -0x2

    .line 124
    const/high16 v5, 0x3f800000    # 1.0f

    .line 125
    .line 126
    invoke-direct {v2, v1, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->themeMode()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Lcom/mr/elaris/InAppSettingsThemePage;->label(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget v2, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 141
    .line 142
    invoke-virtual {p0, v1, v2}, Lcom/mr/elaris/InAppSettings;->statPill(Ljava/lang/String;I)Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 147
    .line 148
    const/high16 v3, 0x42ec0000    # 118.0f

    .line 149
    .line 150
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    const/high16 v4, 0x42100000    # 36.0f

    .line 155
    .line 156
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    .line 165
    .line 166
    new-instance v1, Lcom/mr/elaris/InAppSettingsThemePage$1;

    .line 167
    .line 168
    invoke-direct {v1, p0}, Lcom/mr/elaris/InAppSettingsThemePage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    return-object v0
.end method
