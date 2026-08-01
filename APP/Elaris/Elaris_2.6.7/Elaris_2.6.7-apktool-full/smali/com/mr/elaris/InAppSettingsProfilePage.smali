.class final Lcom/mr/elaris/InAppSettingsProfilePage;
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

.method public static addProfile(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 10

    .line 1
    const-string v0, "\u8d44\u6599\u5361\u76f4\u5f00"

    .line 2
    .line 3
    const-string v1, "\u5c1d\u8bd5\u6253\u5f00\u53d7\u9650\u5236\u7684\u8d44\u6599\u5361\uff0c\u5e76\u538b\u5236\u5f02\u5e38\u5f39\u7a97"

    .line 4
    .line 5
    const-string v2, "allow_forbid_card"

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
    const-string v0, "\u5c4f\u853d\u540d\u7247\u88c5\u626e"

    .line 16
    .line 17
    const-string v1, "\u5408\u5e76 DIY \u540d\u7247\u3001\u8d44\u6599\u5361 QQ \u79c0\u5c01\u9762\u548c\u88c5\u626e\u515c\u5e95\u5904\u7406"

    .line 18
    .line 19
    const-string v2, "block_profile_card_decor"

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
    const-string v0, "\u5c4f\u853d QQ \u79c0"

    .line 30
    .line 31
    const-string v1, "\u9690\u85cf\u804a\u5929\u9875\u91cc\u7684 QQ \u79c0/\u88c5\u626e\u5165\u53e3"

    .line 32
    .line 33
    const-string v2, "block_qq_show"

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
    const-string v0, "\u5c4f\u853d\u5934\u50cf\u6302\u4ef6"

    .line 44
    .line 45
    const-string v1, "\u79fb\u9664\u5934\u50cf\u6302\u4ef6\u6570\u636e\uff0c\u5e76\u53ea\u5728\u6302\u4ef6\u533a\u57df\u505a\u7a84\u8303\u56f4\u515c\u5e95"

    .line 46
    .line 47
    const-string v2, "block_avatar_pendant"

    .line 48
    .line 49
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    filled-new-array/range {v3 .. v9}, [Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "\u8d44\u6599\u4e0e\u88c5\u626e"

    .line 58
    .line 59
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
