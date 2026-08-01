.class final Lcom/mr/elaris/InAppSettingsCategoryPage;
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

.method public static addGroupFile(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsGroupPage;->addGroupFile(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addMisc(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 14

    .line 1
    const-string v0, "\u8df3\u8fc7\u76f8\u518c\u626b\u7801\u6821\u9a8c"

    .line 2
    .line 3
    const-string v1, "\u626b\u63cf\u76f8\u518c\u4e8c\u7ef4\u7801\u65f6\uff0c\u8df3\u8fc7 QQ \u672c\u5730\u8bc6\u522b\u6821\u9a8c\u63d0\u793a"

    .line 4
    .line 5
    const-string v2, "eq_qr_gallery_gate"

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
    const-string v0, "\u8df3\u8fc7\u626b\u7801\u7b49\u5f85"

    .line 16
    .line 17
    const-string v1, "\u626b\u7801\u6388\u6743\u9875\u4e0e OpenSDK \u5012\u8ba1\u65f6\u5f39\u7a97\u5c3d\u91cf\u5feb\u901f\u8fdb\u5165\u53ef\u786e\u8ba4\u72b6\u6001"

    .line 18
    .line 19
    const-string v2, "eq_qr_confirm_fast"

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
    const-string v0, "\u5916\u90e8\u6253\u5f00\u94fe\u63a5"

    .line 30
    .line 31
    const-string v1, "\u62e6\u622a QQ \u5185\u7f6e\u7f51\u9875\u8df3\u8f6c\uff0c\u5c3d\u91cf\u4ea4\u7ed9\u7cfb\u7edf\u6d4f\u89c8\u5668"

    .line 32
    .line 33
    const-string v2, "external_browser"

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
    const-string v0, "\u98ce\u9669\u94fe\u63a5\u76f4\u5f00"

    .line 44
    .line 45
    const-string v1, "\u8bc6\u522b QQ \u5b89\u5168\u4e2d\u8f6c\u9875\uff0c\u5c3d\u91cf\u8fd8\u539f\u539f\u59cb\u94fe\u63a5"

    .line 46
    .line 47
    const-string v2, "unblock_risk_web"

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
    const-string v0, "\u4f7f\u7528\u7cfb\u7edf WebView"

    .line 58
    .line 59
    const-string v1, "\u8ba9\u5185\u7f6e\u7f51\u9875\u4f18\u5148\u4f7f\u7528\u7cfb\u7edf WebView"

    .line 60
    .line 61
    const-string v2, "eq_web_kernel_fallback"

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
    const-string v0, "\u5c4f\u853d QQ \u70ed\u66f4\u65b0/\u70ed\u8865\u4e01"

    .line 72
    .line 73
    const-string v1, "\u62e6\u622a Tinker/QFix \u7b49\u70ed\u8865\u4e01\u52a0\u8f7d\uff1b\u6392\u67e5\u6536\u6d88\u606f\u6216\u7f51\u9875\u5f02\u5e38\u65f6\u5efa\u8bae\u5148\u5173\u95ed"

    .line 74
    .line 75
    const-string v2, "block_host_hot_update"

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
    const-string v1, "\u626b\u7801\u4e0e\u7f51\u9875"

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
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsAdvancedPage;->addAdvanced(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method
