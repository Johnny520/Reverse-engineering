.class final Lcom/mr/elaris/InAppSettingsPicSummaryPage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field private final settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method private constructor <init>(Lcom/mr/elaris/InAppSettings;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettingsPicSummaryPage;)Lcom/mr/elaris/InAppSettings;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic b(Lcom/mr/elaris/InAppSettingsPicSummaryPage;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->resetPicSummaryText(Landroid/widget/EditText;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic c(Lcom/mr/elaris/InAppSettingsPicSummaryPage;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->savePicSummaryText(Landroid/widget/EditText;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 1

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->createCard()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private createCard()Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    new-instance v1, Lcom/mr/elaris/InAppSettingsPicSummaryPage$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/mr/elaris/InAppSettingsPicSummaryPage$1;-><init>(Lcom/mr/elaris/InAppSettingsPicSummaryPage;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "pic_summary_enabled"

    .line 9
    .line 10
    const-string v2, "\u56fe\u7247\u5916\u663e"

    .line 11
    .line 12
    const-string v3, "\u81ea\u5b9a\u4e49\u804a\u5929\u5217\u8868\u7684\u56fe\u7247\u5916\u663e\u6587\u5b57\uff0c\u70b9\u5f00\u8bbe\u7f6e"

    .line 13
    .line 14
    invoke-static {v0, p0, v2, v3, v1}, Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    filled-new-array {p0}, [Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, v2, p0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static bridge synthetic d(Lcom/mr/elaris/InAppSettingsPicSummaryPage;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->showDialog()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private normalizedPicDisplayText(Landroid/widget/EditText;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->textOf(Landroid/widget/EditText;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const-string p0, "[\u56fe\u7247]"

    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method private resetPicSummaryText(Landroid/widget/EditText;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    const-string v1, "pic_summary_text"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 10
    .line 11
    const-string v3, "picture"

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lcom/mr/elaris/InAppSettings;->keepCategoryBackTarget(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "[\u56fe\u7247]"

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v0, v1, v2, v3}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Lcom/mr/elaris/InAppSettings;->settleTextInput(Landroid/widget/EditText;Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 41
    .line 42
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private savePicSummaryText(Landroid/widget/EditText;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    const-string v1, "pic_summary_text"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 10
    .line 11
    const-string v3, "picture"

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lcom/mr/elaris/InAppSettings;->keepCategoryBackTarget(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->normalizedPicDisplayText(Landroid/widget/EditText;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3, p1, p2}, Lcom/mr/elaris/InAppSettings;->settleTextInput(Landroid/widget/EditText;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    invoke-virtual {v3, v1, v2, v0}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 42
    .line 43
    invoke-virtual {v0, p1, p2}, Lcom/mr/elaris/InAppSettings;->settleTextInput(Landroid/widget/EditText;Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 47
    .line 48
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private showDialog()V
    .locals 13

    .line 1
    :try_start_0
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    .line 13
    .line 14
    const-string v2, "elaris_dialog_surface"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 20
    .line 21
    const/high16 v3, 0x41800000    # 16.0f

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 28
    .line 29
    const/high16 v4, 0x41500000    # 13.0f

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 36
    .line 37
    const/high16 v5, 0x41300000    # 11.0f

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v0, v2, v3, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/mr/elaris/InAppSettings;->dialogPanel()Landroid/graphics/drawable/GradientDrawable;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 56
    .line 57
    const-string v3, "\u56fe\u7247\u5916\u663e"

    .line 58
    .line 59
    sget v4, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 60
    .line 61
    const/16 v5, 0x11

    .line 62
    .line 63
    invoke-virtual {v2, v3, v5, v4, v1}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 71
    .line 72
    const-string v3, "\u9ed8\u8ba4\uff1a[\u56fe\u7247]"

    .line 73
    .line 74
    const-string v4, "pic_summary_text"

    .line 75
    .line 76
    invoke-virtual {v2, v4}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v2, v3, v4}, Lcom/mr/elaris/InAppSettings;->input(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const/high16 v3, 0x41600000    # 14.0f

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 87
    .line 88
    .line 89
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 90
    .line 91
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 92
    .line 93
    const/high16 v5, 0x42200000    # 40.0f

    .line 94
    .line 95
    invoke-virtual {v4, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const/4 v5, -0x1

    .line 100
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 101
    .line 102
    .line 103
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 104
    .line 105
    const/high16 v6, 0x41000000    # 8.0f

    .line 106
    .line 107
    invoke-virtual {v4, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 112
    .line 113
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 117
    .line 118
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 119
    .line 120
    iget-object v4, v4, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 121
    .line 122
    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 130
    .line 131
    const-string v4, "\u4fdd\u5b58"

    .line 132
    .line 133
    invoke-virtual {v3, v4, v1}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 138
    .line 139
    const-string v8, "\u6062\u590d\u9ed8\u8ba4"

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    invoke-virtual {v4, v8, v9}, Lcom/mr/elaris/InAppSettings;->dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    new-instance v8, Lcom/mr/elaris/InAppSettingsPicSummaryPage$2;

    .line 147
    .line 148
    invoke-direct {v8, p0, v2, v7}, Lcom/mr/elaris/InAppSettingsPicSummaryPage$2;-><init>(Lcom/mr/elaris/InAppSettingsPicSummaryPage;Landroid/widget/EditText;Landroid/app/AlertDialog;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    .line 153
    .line 154
    new-instance v8, Lcom/mr/elaris/InAppSettingsPicSummaryPage$3;

    .line 155
    .line 156
    invoke-direct {v8, p0, v2, v7}, Lcom/mr/elaris/InAppSettingsPicSummaryPage$3;-><init>(Lcom/mr/elaris/InAppSettingsPicSummaryPage;Landroid/widget/EditText;Landroid/app/AlertDialog;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    new-instance v2, Landroid/widget/LinearLayout;

    .line 163
    .line 164
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 165
    .line 166
    iget-object v8, v8, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 167
    .line 168
    invoke-direct {v2, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 172
    .line 173
    .line 174
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 175
    .line 176
    iget-object v10, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 177
    .line 178
    const/high16 v11, 0x42100000    # 36.0f

    .line 179
    .line 180
    invoke-virtual {v10, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    const/high16 v12, 0x3f800000    # 1.0f

    .line 185
    .line 186
    invoke-direct {v8, v9, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 190
    .line 191
    .line 192
    new-instance v3, Landroid/widget/Space;

    .line 193
    .line 194
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 195
    .line 196
    iget-object v8, v8, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 197
    .line 198
    invoke-direct {v3, v8}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 202
    .line 203
    iget-object v10, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 204
    .line 205
    invoke-virtual {v10, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    invoke-direct {v8, v6, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 213
    .line 214
    .line 215
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 216
    .line 217
    iget-object v6, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 218
    .line 219
    invoke-virtual {v6, v11}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    invoke-direct {v3, v9, v6, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 230
    .line 231
    const/4 v4, -0x2

    .line 232
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 233
    .line 234
    .line 235
    iget-object v6, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 236
    .line 237
    const/high16 v8, 0x41200000    # 10.0f

    .line 238
    .line 239
    invoke-virtual {v6, v8}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 244
    .line 245
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    .line 247
    .line 248
    new-instance v8, Landroid/widget/ScrollView;

    .line 249
    .line 250
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 251
    .line 252
    iget-object v2, v2, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 253
    .line 254
    invoke-direct {v8, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 258
    .line 259
    .line 260
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 261
    .line 262
    invoke-direct {v1, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v8, v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 266
    .line 267
    .line 268
    const/4 v11, 0x0

    .line 269
    const/4 v12, 0x0

    .line 270
    const/4 v9, 0x0

    .line 271
    const/4 v10, 0x0

    .line 272
    invoke-virtual/range {v7 .. v12}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 273
    .line 274
    .line 275
    new-instance v0, Lcom/mr/elaris/InAppSettingsPicSummaryPage$4;

    .line 276
    .line 277
    invoke-direct {v0, p0, v7}, Lcom/mr/elaris/InAppSettingsPicSummaryPage$4;-><init>(Lcom/mr/elaris/InAppSettingsPicSummaryPage;Landroid/app/AlertDialog;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7}, Landroid/app/Dialog;->show()V

    .line 284
    .line 285
    .line 286
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 287
    .line 288
    invoke-virtual {v0, v7}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :catchall_0
    move-exception v0

    .line 293
    new-instance v1, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v2, "pic summary dialog failed: "

    .line 296
    .line 297
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const-string v2, ": "

    .line 301
    .line 302
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->settings:Lcom/mr/elaris/InAppSettings;

    .line 306
    .line 307
    const-string v0, "\u56fe\u7247\u5916\u663e\u8bbe\u7f6e\u6253\u5f00\u5931\u8d25"

    .line 308
    .line 309
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-void
.end method
