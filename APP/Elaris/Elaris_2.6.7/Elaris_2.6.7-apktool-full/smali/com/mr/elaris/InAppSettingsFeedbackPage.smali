.class final Lcom/mr/elaris/InAppSettingsFeedbackPage;
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

.method public static addFeedback(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 4

    .line 1
    const-string v0, "https://t.me/Elaris_mod"

    .line 2
    .line 3
    sget v1, Lcom/mr/elaris/InAppSettings;->GREEN:I

    .line 4
    .line 5
    const-string v2, "Telegram \u9891\u9053"

    .line 6
    .line 7
    const-string v3, "\u67e5\u770b\u9891\u9053\u66f4\u65b0\u4e0e\u53cd\u9988\u5165\u53e3"

    .line 8
    .line 9
    invoke-static {p0, v2, v3, v0, v1}, Lcom/mr/elaris/InAppSettingsFeedbackPage;->linkRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    filled-new-array {v0}, [Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "\u4ea4\u6d41\u4e0e\u53cd\u9988"

    .line 18
    .line 19
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static linkRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/view/View;
    .locals 2

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettingsFeedbackPage$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p3}, Lcom/mr/elaris/InAppSettingsFeedbackPage$1;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2, v0}, Lcom/mr/elaris/InAppSettingsWidgets;->actionRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/widget/LinearLayout;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 22
    .line 23
    const/high16 v1, 0x41500000    # 13.0f

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 30
    .line 31
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p4}, Lcom/mr/elaris/InAppSettings;->accentStrip(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    new-instance p4, Landroid/widget/LinearLayout$LayoutParams;

    .line 39
    .line 40
    const/high16 v0, 0x40400000    # 3.0f

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/high16 v1, 0x42100000    # 36.0f

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-direct {p4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p3, p2, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Landroid/widget/FrameLayout;

    .line 59
    .line 60
    iget-object p3, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 61
    .line 62
    invoke-direct {p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    const p3, 0x3ecccccd    # 0.4f

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 69
    .line 70
    .line 71
    new-instance p3, Lcom/mr/elaris/InAppSettingsChevronRightView;

    .line 72
    .line 73
    invoke-direct {p3, p0}, Lcom/mr/elaris/InAppSettingsChevronRightView;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 74
    .line 75
    .line 76
    new-instance p4, Landroid/widget/FrameLayout$LayoutParams;

    .line 77
    .line 78
    const/high16 v0, 0x41a00000    # 20.0f

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-direct {p4, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 89
    .line 90
    .line 91
    const/16 v0, 0x11

    .line 92
    .line 93
    iput v0, p4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 94
    .line 95
    invoke-virtual {p2, p3, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    .line 98
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 99
    .line 100
    const/high16 p4, 0x41b00000    # 22.0f

    .line 101
    .line 102
    invoke-virtual {p0, p4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    const/4 p4, -0x1

    .line 107
    invoke-direct {p3, p0, p4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    return-object p1
.end method

.method public static openExternalLink(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x10000000

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 18
    .line 19
    invoke-static {p1}, Lxe;->e(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    const-string p1, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5"

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
