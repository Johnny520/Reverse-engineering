.class final Lcom/mr/elaris/InAppSettingsGroupPage;
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
    .locals 14

    .line 1
    const-string v0, "\u6587\u4ef6\u540d\u4fee\u590d"

    .line 2
    .line 3
    const-string v1, "\u53d1\u9001\u6587\u4ef6\u65f6\u4fee\u590d\u4e0d\u89c4\u8303\u6587\u4ef6\u540d\uff0c\u4fdd\u8bc1\u63a5\u6536\u65b9\u6b63\u5e38\u4e0b\u8f7d"

    .line 4
    .line 5
    const-string v2, "rename_apk_file"

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
    const-string v0, "\u7fa4\u7ba1\u83dc\u5355"

    .line 16
    .line 17
    const-string v1, "\u957f\u6309\u6210\u5458\u5934\u50cf\u663e\u793a\u5934\u8854\u3001\u7981\u8a00\u3001\u8e22\u51fa\u548c\u64a4\u56de\u7b49\u5165\u53e3"

    .line 18
    .line 19
    const-string v2, "group_admin_avatar_menu"

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
    const-string v0, "\u5c4f\u853d @\u5168\u4f53"

    .line 30
    .line 31
    const-string v1, "\u62e6\u622a QQ \u6b63\u5e38\u8fd0\u884c\u65f6\u7684 @\u5168\u4f53\u6210\u5458\u901a\u77e5"

    .line 32
    .line 33
    const-string v2, "notice_block_at_all"

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
    const-string v0, "\u5c4f\u853d\u7fa4\u5f85\u529e"

    .line 44
    .line 45
    const-string v1, "\u62e6\u622a QQ \u6b63\u5e38\u8fd0\u884c\u65f6\u7684\u7fa4\u5f85\u529e\u901a\u77e5"

    .line 46
    .line 47
    const-string v2, "notice_block_group_todo"

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
    const-string v0, "\u7fa4\u6587\u4ef6\u6392\u7248"

    .line 58
    .line 59
    const-string v1, "\u5b9e\u9a8c\u7248\uff0c\u5c06\u7fa4\u6587\u4ef6\u5165\u53e3\u5207\u56de\u65e7\u6392\u7248"

    .line 60
    .line 61
    const-string v2, "legacy_group_file_layout"

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
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsDownloadDirectPage;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v13

    .line 75
    filled-new-array/range {v3 .. v13}, [Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "\u6587\u4ef6\u4e0e\u7fa4\u7ba1"

    .line 80
    .line 81
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->clockInCard()Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    filled-new-array {v0}, [Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v1, "\u7fa4\u6253\u5361"

    .line 97
    .line 98
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method
