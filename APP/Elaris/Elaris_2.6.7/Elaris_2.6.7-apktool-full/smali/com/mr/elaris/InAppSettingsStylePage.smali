.class final Lcom/mr/elaris/InAppSettingsStylePage;
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

.method public static addStyle(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->themeCard()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "\u9ed8\u8ba4\u804a\u5929\u6c14\u6ce1"

    .line 9
    .line 10
    const-string v1, "\u53d1\u9001\u548c\u663e\u793a\u6d88\u606f\u65f6\u4f7f\u7528 QQ \u9ed8\u8ba4\u6c14\u6ce1"

    .line 11
    .line 12
    const-string v2, "default_bubble"

    .line 13
    .line 14
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-string v0, "\u9ed8\u8ba4\u804a\u5929\u5b57\u4f53"

    .line 23
    .line 24
    const-string v1, "\u5c4f\u853d\u9b54\u6cd5\u5b57\u4f53\u3001\u4e2a\u6027\u5b57\u4f53\u7b49\u6d88\u606f\u5b57\u4f53\u6548\u679c"

    .line 25
    .line 26
    const-string v2, "default_font"

    .line 27
    .line 28
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v0, "\u8868\u60c5\u9762\u677f\u51c0\u5316"

    .line 37
    .line 38
    const-string v1, "\u9690\u85cf\u70ed\u95e8\u3001DIY\u3001AI\u3001\u9b54\u6cd5\u3001QQ \u79c0\u7b49\u8868\u60c5\u9762\u677f\u5165\u53e3"

    .line 39
    .line 40
    const-string v2, "clean_emoji_panel_entries"

    .line 41
    .line 42
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsInputBarPage;->createSwitchRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    const-string v0, "\u5c4f\u853d\u4e0b\u62c9\u5c0f\u7a0b\u5e8f"

    .line 59
    .line 60
    const-string v1, "\u79fb\u9664\u6d88\u606f\u9875\u4e0b\u62c9\u5c0f\u7a0b\u5e8f\u5165\u53e3\uff0c\u4fdd\u7559\u6b63\u5e38\u4e0b\u62c9\u641c\u7d22"

    .line 61
    .line 62
    const-string v2, "eq_home_pull_guard"

    .line 63
    .line 64
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->divider()Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    const-string v0, "\u5f39\u7a97\u51c0\u5316"

    .line 73
    .line 74
    const-string v1, "\u62e6\u622a\u6253\u5f00\u5176\u4ed6\u5e94\u7528\u786e\u8ba4\u3001QQ \u66f4\u65b0\u548c\u5e7f\u544a\u6a2a\u5e45"

    .line 75
    .line 76
    const-string v2, "block_annoying_popups"

    .line 77
    .line 78
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    filled-new-array/range {v3 .. v13}, [Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "\u754c\u9762\u663e\u793a\u4e0e\u51c0\u5316"

    .line 87
    .line 88
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
