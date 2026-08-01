.class final Lcom/mr/elaris/InAppSettingsRepeaterModePage;
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

.method private static repeaterModeRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/app/AlertDialog;)Landroid/view/View;
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
    const/high16 v3, 0x41400000    # 12.0f

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v0, v1, v4, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 28
    .line 29
    .line 30
    const/high16 v3, 0x42580000    # 54.0f

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v0, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    sget v4, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 51
    .line 52
    invoke-virtual {p0, p1, v2, v4, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 57
    .line 58
    const/4 v4, -0x2

    .line 59
    const/high16 v5, 0x3f800000    # 1.0f

    .line 60
    .line 61
    invoke-direct {v2, v1, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    const-string p1, "message_repeater_mode"

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_0

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_1

    .line 84
    .line 85
    const-string p1, "single"

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    :cond_0
    move v1, v3

    .line 94
    :cond_1
    if-eqz v1, :cond_2

    .line 95
    .line 96
    const-string p1, "\u2713"

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    const-string p1, ""

    .line 100
    .line 101
    :goto_0
    const/16 v2, 0xd

    .line 102
    .line 103
    sget v4, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 104
    .line 105
    invoke-virtual {p0, p1, v2, v4, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const/16 v2, 0x11

    .line 110
    .line 111
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->checkCircleDrawable(Z)Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 122
    .line 123
    const/high16 v2, 0x41e00000    # 28.0f

    .line 124
    .line 125
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    .line 138
    .line 139
    new-instance p1, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;

    .line 140
    .line 141
    invoke-direct {p1, p4, p0, p2, p3}, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;-><init>(Landroid/app/AlertDialog;Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Lcom/mr/elaris/InAppSettings$ToggleView;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    .line 146
    .line 147
    return-object v0
.end method

.method public static showDialog(Lcom/mr/elaris/InAppSettings;Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/view/View;)V
    .locals 9

    .line 1
    const-string p2, "single"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    new-instance v3, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 13
    .line 14
    .line 15
    const-string v2, "elaris_dialog_surface"

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/high16 v2, 0x41c00000    # 24.0f

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/high16 v4, 0x41b00000    # 22.0f

    .line 27
    .line 28
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/high16 v5, 0x41900000    # 18.0f

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {v3, v2, v4, v2, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    const-string v2, "\u6d88\u606f\u590d\u8bfb"

    .line 49
    .line 50
    sget v4, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 51
    .line 52
    const/16 v5, 0x14

    .line 53
    .line 54
    invoke-virtual {p0, v2, v5, v4, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    const-string v2, "\u9009\u62e9\u590d\u8bfb\u6309\u94ae\u89e6\u53d1\u65b9\u5f0f"

    .line 62
    .line 63
    sget v4, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 64
    .line 65
    const/16 v5, 0xd

    .line 66
    .line 67
    invoke-virtual {p0, v2, v5, v4, v0}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/high16 v4, 0x41000000    # 8.0f

    .line 72
    .line 73
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    const/high16 v5, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-virtual {v2, v0, v4, v0, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 90
    .line 91
    iget-object v4, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 92
    .line 93
    invoke-direct {v2, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const-string v4, "\u5355\u51fb\u590d\u8bfb"

    .line 101
    .line 102
    invoke-static {p0, v4, p2, p1, v2}, Lcom/mr/elaris/InAppSettingsRepeaterModePage;->repeaterModeRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/app/AlertDialog;)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    const-string v4, "\u53cc\u51fb\u590d\u8bfb"

    .line 117
    .line 118
    const-string v5, "double"

    .line 119
    .line 120
    invoke-static {p0, v4, v5, p1, v2}, Lcom/mr/elaris/InAppSettingsRepeaterModePage;->repeaterModeRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/app/AlertDialog;)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    const-string v4, "\u53d6\u6d88"

    .line 128
    .line 129
    invoke-virtual {p0, v4, v0}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 134
    .line 135
    const/high16 v5, 0x42380000    # 46.0f

    .line 136
    .line 137
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    const/4 v6, -0x1

    .line 142
    invoke-direct {v4, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 143
    .line 144
    .line 145
    const/high16 v5, 0x41800000    # 16.0f

    .line 146
    .line 147
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 152
    .line 153
    invoke-virtual {v3, v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    .line 155
    .line 156
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    invoke-virtual/range {v2 .. v7}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 161
    .line 162
    .line 163
    new-instance v3, Lcom/mr/elaris/InAppSettingsRepeaterModePage$1;

    .line 164
    .line 165
    invoke-direct {v3, p0, v2}, Lcom/mr/elaris/InAppSettingsRepeaterModePage$1;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 169
    .line 170
    .line 171
    new-instance v3, Lcom/mr/elaris/InAppSettingsRepeaterModePage$2;

    .line 172
    .line 173
    invoke-direct {v3, v2}, Lcom/mr/elaris/InAppSettingsRepeaterModePage$2;-><init>(Landroid/app/AlertDialog;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :catchall_0
    const-string v2, "message_repeater_mode"

    .line 187
    .line 188
    invoke-virtual {p0, v2, p2, v0}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v1}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 192
    .line 193
    .line 194
    const-string p1, "message_repeater"

    .line 195
    .line 196
    invoke-virtual {p0, p1, v1, v1}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public static summary(Lcom/mr/elaris/InAppSettings;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "message_repeater_mode"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "double"

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const-string p0, "\u5f53\u524d\u4e3a\u53cc\u51fb\u590d\u8bfb"

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "\u5f53\u524d\u4e3a\u5355\u51fb\u590d\u8bfb"

    .line 19
    .line 20
    return-object p0
.end method

.method public static updateSummaryView(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->repeaterModeSummaryView:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsRepeaterModePage;->summary(Lcom/mr/elaris/InAppSettings;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
