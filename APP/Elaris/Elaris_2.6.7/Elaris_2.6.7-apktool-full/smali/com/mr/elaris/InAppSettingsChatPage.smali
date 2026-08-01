.class final Lcom/mr/elaris/InAppSettingsChatPage;
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

.method public static addChatMessage(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "\u663e\u793a\u5b8c\u6574\u672a\u8bfb\u6570"

    .line 6
    .line 7
    const-string v3, "\u4f1a\u8bdd\u5217\u8868\u672a\u8bfb\u6570\u4e0d\u663e\u793a\u4e3a 99+"

    .line 8
    .line 9
    const-string v4, "eq_unread_full_count"

    .line 10
    .line 11
    invoke-virtual {v0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-static {v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->createTimeSwitchRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    const-string v2, "\u6d88\u606f\u5de6\u4fa7\u6a21\u5f0f"

    .line 28
    .line 29
    const-string v3, "\u8ba9\u81ea\u5df1\u53d1\u51fa\u7684\u6d88\u606f\u3001\u5934\u50cf\u548c\u6c14\u6ce1\u6309\u5de6\u4fa7\u5e03\u5c40"

    .line 30
    .line 31
    const-string v4, "self_message_left_side"

    .line 32
    .line 33
    invoke-virtual {v0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    const-string v2, "\u9632\u64a4\u56de"

    .line 42
    .line 43
    const-string v3, "\u62e6\u622a\u64a4\u56de\u6d88\u606f\uff0c\u5c3d\u91cf\u4fdd\u7559\u539f\u5185\u5bb9\u5e76\u663e\u793a\u64a4\u56de\u63d0\u793a"

    .line 44
    .line 45
    const-string v4, "eq_message_guard"

    .line 46
    .line 47
    invoke-virtual {v0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    const-string v2, "\u53bb\u9664\u56de\u590d\u827e\u7279"

    .line 56
    .line 57
    const-string v3, "\u56de\u590d\u6216\u5f15\u7528\u6d88\u606f\u65f6\u4e0d\u81ea\u52a8\u8ffd\u52a0 @ \u5bf9\u65b9"

    .line 58
    .line 59
    const-string v4, "disable_reply_auto_at"

    .line 60
    .line 61
    invoke-virtual {v0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    const-string v2, "\u7981\u6b62\u804a\u5929\u53f3\u6ed1"

    .line 70
    .line 71
    const-string v3, "\u5728\u666e\u901a\u79c1\u804a\u548c\u7fa4\u804a\u4e2d\u5173\u95ed\u53f3\u6ed1\u4fa7\u680f\uff0c\u4e0d\u5f71\u54cd\u5de6\u6ed1\u56de\u590d"

    .line 72
    .line 73
    const-string v4, "eq_chat_edge_guard"

    .line 74
    .line 75
    invoke-virtual {v0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v15

    .line 79
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    const-string v2, "\u8bed\u97f3\u4fdd\u5b58\u8f6c\u53d1"

    .line 84
    .line 85
    const-string v3, "\u957f\u6309\u8bed\u97f3\u53ef\u4fdd\u5b58\u6216\u8f6c\u53d1\uff0c\u5e95\u680f\u63d0\u4f9b\u672c\u5730\u8bed\u97f3\u5165\u53e3"

    .line 86
    .line 87
    const-string v4, "voice_message_actions"

    .line 88
    .line 89
    invoke-virtual {v0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v17

    .line 93
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v18

    .line 97
    const-string v2, "\u76f8\u518c\u89c6\u9891\u6ce1\u6ce1"

    .line 98
    .line 99
    const-string v3, "\u70b9\u51fb QQ \u539f\u6ce1\u6ce1\u6d88\u606f\u5165\u53e3\uff0c\u4ece\u76f8\u518c\u9009\u62e9\u89c6\u9891\u53d1\u9001"

    .line 100
    .line 101
    const-string v4, "album_video_bubble"

    .line 102
    .line 103
    invoke-virtual {v0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v19

    .line 107
    filled-new-array/range {v5 .. v19}, [Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v3, "\u6d88\u606f"

    .line 112
    .line 113
    invoke-virtual {v0, v3, v2}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettings;->keepFireCard()Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    filled-new-array {v2}, [Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const-string v3, "\u7eed\u706b"

    .line 129
    .line 130
    invoke-virtual {v0, v3, v2}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public static addPicture(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 14

    .line 1
    const-string v0, "\u9ed8\u8ba4\u539f\u56fe"

    .line 2
    .line 3
    const-string v1, "\u53d1\u9001\u56fe\u7247\u65f6\u9ed8\u8ba4\u6309\u539f\u56fe\u5904\u7406"

    .line 4
    .line 5
    const-string v2, "original_image_default"

    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v0, "\u95ea\u7167\u663e\u793a\u4e3a\u56fe\u7247"

    .line 16
    .line 17
    const-string v1, "\u5c06\u95ea\u7167\u6309\u666e\u901a\u56fe\u7247\u663e\u793a\uff0c\u5e76\u4fdd\u7559 QQ \u539f\u751f\u4fdd\u5b58\u5165\u53e3"

    .line 18
    .line 19
    const-string v2, "flash_pic_as_image"

    .line 20
    .line 21
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const-string v0, "\u8868\u60c5\u56fe\u7247\u6a21\u5f0f"

    .line 30
    .line 31
    const-string v1, "\u6253\u5f00\u6536\u85cf\u8868\u60c5\u65f6\u4f18\u5148\u8d70\u56fe\u7247\u67e5\u770b\u5668"

    .line 32
    .line 33
    const-string v2, "emotion_as_pic"

    .line 34
    .line 35
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    const-string v0, "\u6536\u85cf\u8868\u60c5\u6279\u91cf\u53d1\u9001"

    .line 44
    .line 45
    const-string v1, "\u591a\u9009\u6536\u85cf\u8868\u60c5\u540e\u5728\u8f93\u5165\u6846\u9884\u89c8\uff0c\u5e76\u7531 QQ \u539f\u751f\u94fe\u8def\u53d1\u9001"

    .line 46
    .line 47
    const-string v2, "favorite_emoticon_batch_send"

    .line 48
    .line 49
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    const-string v0, "\u4e91\u7aef\u8868\u60c5\u9762\u677f"

    .line 58
    .line 59
    const-string v1, "\u5171\u4eab\u5ba1\u6838\u901a\u8fc7\u7684\u516c\u5f00\u8868\u60c5\uff0c\u652f\u6301\u4e0a\u4f20\u548c\u53d1\u9001"

    .line 60
    .line 61
    const-string v2, "cloud_sticker_panel"

    .line 62
    .line 63
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    const-string v0, "\u56fe\u7247\u8868\u60c5\u6309\u9700\u52a0\u8f7d"

    .line 72
    .line 73
    const-string v1, "\u963b\u6b62\u56fe\u7247\u3001\u8868\u60c5\u548c GIF \u9884\u4e0b\u8f7d\uff0c\u70b9\u5f00\u540e\u518d\u52a0\u8f7d"

    .line 74
    .line 75
    const-string v2, "media_click_to_load"

    .line 76
    .line 77
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    filled-new-array/range {v3 .. v13}, [Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "\u56fe\u7247"

    .line 86
    .line 87
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    :try_start_0
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    const-string v0, "pic_summary_enabled"

    .line 103
    .line 104
    const-string v1, "\u81ea\u5b9a\u4e49\u56fe\u7247\u6d88\u606f\u5728\u804a\u5929\u5217\u8868\u91cc\u7684\u5916\u663e\u6587\u5b57"

    .line 105
    .line 106
    const-string v2, "\u56fe\u7247\u5916\u663e"

    .line 107
    .line 108
    invoke-virtual {p0, v0, v2, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    filled-new-array {v0}, [Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p0, v2, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public static addRepeater(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 7

    .line 1
    const-string v0, "\u6d88\u606f\u590d\u8bfb"

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->repeaterModeSummary()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "message_repeater"

    .line 8
    .line 9
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "\u83dc\u5355\u590d\u8bfb"

    .line 18
    .line 19
    const-string v3, "\u5728\u6d88\u606f\u957f\u6309\u83dc\u5355\u4e2d\u663e\u793a\u201c\u590d\u8bfb\u201d"

    .line 20
    .line 21
    const-string v4, "message_repeater_long_press_menu"

    .line 22
    .line 23
    invoke-virtual {p0, v4, v2, v3}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "\u9690\u85cf\u590d\u8bfb\u56fe\u6807"

    .line 32
    .line 33
    const-string v5, "\u9690\u85cf\u540c\u4e00\u4e2a\u590d\u8bfb\u6309\u94ae\u7684\u56fe\u6807\uff0c\u53ea\u4fdd\u7559\u53ef\u70b9\u51fb\u533a\u57df"

    .line 34
    .line 35
    const-string v6, "message_repeater_hide_button"

    .line 36
    .line 37
    invoke-virtual {p0, v6, v4, v5}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    filled-new-array {v0, v1, v2, v3, v4}, [Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "\u590d\u8bfb\u65b9\u5f0f"

    .line 46
    .line 47
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->repeaterIconImageCard()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    filled-new-array {v0}, [Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "\u590d\u8bfb\u6309\u94ae\u56fe\u7247"

    .line 63
    .line 64
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
