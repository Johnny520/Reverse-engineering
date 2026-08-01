.class final Lcom/mr/elaris/InAppSettingsHomePage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final HOME_MOTTO:Ljava/lang/String; = "\u6211\u672c\u6e14\u6a35\u5b5f\u8bf8\u91ce\uff0c\u4e00\u751f\u81ea\u662f\u60a0\u60a0\u8005"


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

.method public static addHome(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomePage;->homeTopBar(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomePage;->homeModuleList(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static feedbackBubbleIcon(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;

    .line 2
    .line 3
    sget v1, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/mr/elaris/InAppSettingsFeedbackIconDrawable;-><init>(Lcom/mr/elaris/InAppSettings;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static feedbackPill(Lcom/mr/elaris/InAppSettings;)Landroid/widget/TextView;
    .locals 9

    .line 1
    sget v0, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 2
    .line 3
    const-string v1, "\u4ea4\u6d41\u4e0e\u53cd\u9988"

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v1, 0x11

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 23
    .line 24
    .line 25
    const/high16 v1, 0x41100000    # 9.0f

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/high16 v2, 0x41200000    # 10.0f

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {v0, v1, v4, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 44
    .line 45
    .line 46
    const v2, 0x10100a7

    .line 47
    .line 48
    .line 49
    filled-new-array {v2}, [I

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsWidgets;->pressedRowColor(Lcom/mr/elaris/InAppSettings;)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    const/high16 v6, 0x41880000    # 17.0f

    .line 58
    .line 59
    invoke-virtual {p0, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    sget v8, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 64
    .line 65
    invoke-virtual {p0, v5, v7, v8, v3}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v1, v2, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    new-array v2, v4, [I

    .line 73
    .line 74
    sget v5, Lcom/mr/elaris/InAppSettings;->CARD_SOFT:I

    .line 75
    .line 76
    invoke-virtual {p0, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    sget v7, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 81
    .line 82
    invoke-virtual {p0, v5, v6, v7, v3}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v1, v2, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomePage;->feedbackBubbleIcon(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/high16 v2, 0x41800000    # 16.0f

    .line 97
    .line 98
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v1, v4, v4, v5, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 107
    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 111
    .line 112
    .line 113
    const/high16 v1, 0x40800000    # 4.0f

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Lcom/mr/elaris/InAppSettingsHomePage$2;

    .line 129
    .line 130
    invoke-direct {v1, p0}, Lcom/mr/elaris/InAppSettingsHomePage$2;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    .line 135
    .line 136
    return-object v0
.end method

.method private static homeModuleList(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomeModules;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static homeTopBar(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 13

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
    const/16 v1, 0x10

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 15
    .line 16
    .line 17
    const/high16 v3, 0x40000000    # 2.0f

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/high16 v5, 0x41000000    # 8.0f

    .line 24
    .line 25
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-virtual {v0, v2, v4, v2, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 30
    .line 31
    .line 32
    new-instance v4, Landroid/widget/LinearLayout;

    .line 33
    .line 34
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 35
    .line 36
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 44
    .line 45
    .line 46
    const/high16 v1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v4, v6, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    const/16 v6, 0x18

    .line 56
    .line 57
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->titleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    const-string v8, "Elaris"

    .line 62
    .line 63
    invoke-virtual {p0, v8, v6, v7, v5}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomePage;->moduleVersion(Lcom/mr/elaris/InAppSettings;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    const/16 v9, 0xc

    .line 76
    .line 77
    invoke-virtual {p0, v7, v9, v8, v2}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    const-string v8, "\u6211\u672c\u6e14\u6a35\u5b5f\u8bf8\u91ce\uff0c\u4e00\u751f\u81ea\u662f\u60a0\u60a0\u8005"

    .line 82
    .line 83
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    invoke-virtual {p0, v8, v9, v10, v2}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v7, v2, v3, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 96
    .line 97
    .line 98
    new-instance v3, Landroid/widget/LinearLayout;

    .line 99
    .line 100
    iget-object v9, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 101
    .line 102
    invoke-direct {v3, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    const/16 v9, 0x50

    .line 106
    .line 107
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomePage;->mottoAudioButton(Lcom/mr/elaris/InAppSettings;)Landroid/widget/TextView;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 118
    .line 119
    const/4 v11, -0x2

    .line 120
    invoke-direct {v10, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    .line 125
    .line 126
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 127
    .line 128
    const/high16 v10, 0x41800000    # 16.0f

    .line 129
    .line 130
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-direct {v7, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 139
    .line 140
    .line 141
    const/high16 v10, 0x40400000    # 3.0f

    .line 142
    .line 143
    invoke-virtual {p0, v10}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    iput v10, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 148
    .line 149
    invoke-virtual {v3, v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 153
    .line 154
    .line 155
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 156
    .line 157
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 158
    .line 159
    .line 160
    const/high16 v5, 0x40a00000    # 5.0f

    .line 161
    .line 162
    invoke-virtual {p0, v5}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    const/high16 v7, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {p0, v7}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    invoke-virtual {v8, v2, v5, v7, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 182
    .line 183
    .line 184
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 185
    .line 186
    invoke-direct {v3, v2, v11, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 190
    .line 191
    .line 192
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomePage;->feedbackPill(Lcom/mr/elaris/InAppSettings;)Landroid/widget/TextView;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 197
    .line 198
    const/high16 v3, 0x42080000    # 34.0f

    .line 199
    .line 200
    invoke-virtual {p0, v3}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    invoke-direct {v2, v11, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 208
    .line 209
    .line 210
    return-object v0
.end method

.method public static moduleVersion(Lcom/mr/elaris/InAppSettings;)Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "\u7248\u672c 2.6.7"

    .line 2
    .line 3
    return-object p0
.end method

.method private static mottoAudioButton(Lcom/mr/elaris/InAppSettings;)Landroid/widget/TextView;
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const/16 v2, 0xc

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0x11

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-float v1, v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Landroid/view/View;->setSoundEffectsEnabled(Z)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lcom/mr/elaris/InAppSettingsHomePage$1;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Lcom/mr/elaris/InAppSettingsHomePage$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->bindMottoAudioButton(Landroid/widget/TextView;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method
