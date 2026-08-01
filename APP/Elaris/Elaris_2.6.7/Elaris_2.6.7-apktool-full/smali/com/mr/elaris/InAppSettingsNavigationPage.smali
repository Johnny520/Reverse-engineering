.class final Lcom/mr/elaris/InAppSettingsNavigationPage;
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

.method public static buildCategory(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->applyThemePalette()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->secondaryScroll()Landroid/widget/ScrollView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->rootOf(Landroid/widget/ScrollView;)Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->categoryHeader(Ljava/lang/String;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "groupfile"

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsCategoryPage;->addGroupFile(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    const-string v2, "chat_message"

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsChatPage;->addChatMessage(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    const-string v2, "repeater"

    .line 44
    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsChatPage;->addRepeater(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    const-string v2, "picture"

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsChatPage;->addPicture(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/4 v2, 0x1

    .line 71
    if-gt p1, v2, :cond_3

    .line 72
    .line 73
    const-string p1, "\u9ed8\u8ba4\u539f\u56fe"

    .line 74
    .line 75
    const-string v2, "\u53d1\u9001\u56fe\u7247\u65f6\u9ed8\u8ba4\u6309\u539f\u56fe\u5904\u7406"

    .line 76
    .line 77
    const-string v3, "original_image_default"

    .line 78
    .line 79
    invoke-virtual {p0, v3, p1, v2}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v3, "\u56fe\u7247\u5916\u663e"

    .line 88
    .line 89
    const-string v4, "\u81ea\u5b9a\u4e49\u56fe\u7247\u6d88\u606f\u5728\u804a\u5929\u5217\u8868\u91cc\u7684\u5916\u663e\u6587\u5b57"

    .line 90
    .line 91
    const-string v5, "pic_summary_enabled"

    .line 92
    .line 93
    invoke-virtual {p0, v5, v3, v4}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    filled-new-array {p1, v2, v3}, [Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string v2, "\u56fe\u7247"

    .line 102
    .line 103
    invoke-virtual {p0, v2, p1}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 108
    .line 109
    .line 110
    const-string p0, "settings picture page fallback content added"

    .line 111
    .line 112
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string p1, "settings picture page built children="

    .line 118
    .line 119
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v0

    .line 137
    :cond_4
    const-string v2, "cleanse"

    .line 138
    .line 139
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsStylePage;->addStyle(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsProfilePage;->addProfile(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_5
    const-string v2, "misc"

    .line 153
    .line 154
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_6

    .line 159
    .line 160
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsCategoryPage;->addMisc(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :cond_6
    const-string v2, "feedback"

    .line 165
    .line 166
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsFeedbackPage;->addFeedback(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    return-object v0
.end method

.method public static buildErrorPage(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/Throwable;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->applyThemePalette()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->secondaryScroll()Landroid/widget/ScrollView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->rootOf(Landroid/widget/ScrollView;)Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->titleOf(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v2, "\u9875\u9762\u6784\u5efa\u5931\u8d25"

    .line 17
    .line 18
    invoke-virtual {p0, p1, v2}, Lcom/mr/elaris/InAppSettings;->backHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    const-string p1, "\u672a\u77e5"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, ": "

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    const/16 p2, 0xd

    .line 67
    .line 68
    sget v2, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-virtual {p0, p1, p2, v2, v3}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const/high16 p2, 0x41800000    # 16.0f

    .line 76
    .line 77
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    const/high16 v4, 0x41400000    # 12.0f

    .line 82
    .line 83
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-virtual {p1, v2, v5, p2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 96
    .line 97
    .line 98
    const/4 p2, 0x1

    .line 99
    new-array p2, p2, [Landroid/view/View;

    .line 100
    .line 101
    aput-object p1, p2, v3

    .line 102
    .line 103
    const-string p1, "\u9519\u8bef"

    .line 104
    .line 105
    invoke-virtual {p0, p1, p2}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method

.method public static buildHome(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->applyThemePalette()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->baseScroll()Landroid/widget/ScrollView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->rootOf(Landroid/widget/ScrollView;)Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsHomePage;->addHome(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
