.class final Lcom/mr/elaris/InAppSettingsHomeModules;
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

.method public static create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 13

    .line 1
    const-string v0, "groupfile"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->accentOf(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    new-instance v6, Lcom/mr/elaris/InAppSettingsHomeModules$1;

    .line 8
    .line 9
    invoke-direct {v6, p0}, Lcom/mr/elaris/InAppSettingsHomeModules$1;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "\u7fa4\u804a"

    .line 13
    .line 14
    const-string v3, "\u6587\u4ef6\u4fdd\u5b58\u3001\u7fa4\u7ba1\u3001\u7fa4\u901a\u77e5\u4e0e\u6253\u5361"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v1, p0

    .line 18
    invoke-virtual/range {v1 .. v6}, Lcom/mr/elaris/InAppSettings;->moduleRow(Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    move-object v0, v1

    .line 23
    const-string p0, "chat_message"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->accentOf(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    new-instance v5, Lcom/mr/elaris/InAppSettingsHomeModules$2;

    .line 30
    .line 31
    invoke-direct {v5, v0}, Lcom/mr/elaris/InAppSettingsHomeModules$2;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "\u6d88\u606f"

    .line 35
    .line 36
    const-string v2, "\u672a\u8bfb\u6570\u91cf\u3001\u6d88\u606f\u65f6\u95f4\u3001\u64a4\u56de\u4e0e\u56de\u590d\u624b\u52bf"

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual/range {v0 .. v5}, Lcom/mr/elaris/InAppSettings;->moduleRow(Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    const-string p0, "repeater"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->accentOf(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    new-instance v5, Lcom/mr/elaris/InAppSettingsHomeModules$3;

    .line 50
    .line 51
    invoke-direct {v5, v0}, Lcom/mr/elaris/InAppSettingsHomeModules$3;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 52
    .line 53
    .line 54
    const-string v1, "\u590d\u8bfb"

    .line 55
    .line 56
    const-string v2, "\u590d\u8bfb\u65b9\u5f0f\u3001\u6309\u94ae\u663e\u793a\u4e0e\u81ea\u5b9a\u4e49\u56fe\u6807"

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-virtual/range {v0 .. v5}, Lcom/mr/elaris/InAppSettings;->moduleRow(Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    const-string p0, "picture"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->accentOf(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    new-instance v5, Lcom/mr/elaris/InAppSettingsHomeModules$4;

    .line 70
    .line 71
    invoke-direct {v5, v0}, Lcom/mr/elaris/InAppSettingsHomeModules$4;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 72
    .line 73
    .line 74
    const-string v1, "\u56fe\u7247"

    .line 75
    .line 76
    const-string v2, "\u539f\u56fe\u3001\u95ea\u7167\u3001\u8868\u60c5\u4e0e\u56fe\u7247\u5916\u663e"

    .line 77
    .line 78
    const/4 v3, 0x3

    .line 79
    invoke-virtual/range {v0 .. v5}, Lcom/mr/elaris/InAppSettings;->moduleRow(Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    const-string p0, "cleanse"

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->accentOf(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    new-instance v5, Lcom/mr/elaris/InAppSettingsHomeModules$5;

    .line 90
    .line 91
    invoke-direct {v5, v0}, Lcom/mr/elaris/InAppSettingsHomeModules$5;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 92
    .line 93
    .line 94
    const-string v1, "\u51c0\u5316"

    .line 95
    .line 96
    const-string v2, "\u4e3b\u9898\u3001\u754c\u9762\u3001\u8d44\u6599\u5361\u3001QQ \u79c0\u4e0e\u5934\u50cf\u6302\u4ef6"

    .line 97
    .line 98
    const/4 v3, 0x4

    .line 99
    invoke-virtual/range {v0 .. v5}, Lcom/mr/elaris/InAppSettings;->moduleRow(Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    const-string p0, "misc"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->accentOf(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    new-instance v5, Lcom/mr/elaris/InAppSettingsHomeModules$6;

    .line 110
    .line 111
    invoke-direct {v5, v0}, Lcom/mr/elaris/InAppSettingsHomeModules$6;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 112
    .line 113
    .line 114
    const-string v1, "\u6742\u9879"

    .line 115
    .line 116
    const-string v2, "\u626b\u7801\u3001\u7f51\u9875\u3001\u8c03\u8bd5\u3001\u8bbe\u5907\u4e0e\u6a21\u5757\u914d\u7f6e"

    .line 117
    .line 118
    const/4 v3, 0x5

    .line 119
    invoke-virtual/range {v0 .. v5}, Lcom/mr/elaris/InAppSettings;->moduleRow(Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    filled-new-array/range {v7 .. v12}, [Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->moduleListCard([Landroid/view/View;)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method
