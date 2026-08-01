.class final Lcom/mr/elaris/InAppSettingsAdvancedPage;
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

.method public static addAdvanced(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {v0}, [Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "\u6a21\u5757\u914d\u7f6e"

    .line 10
    .line 11
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "\u8c03\u8bd5\u65e5\u5fd7"

    .line 19
    .line 20
    const-string v1, "\u9ed8\u8ba4\u5173\u95ed\uff0c\u6392\u67e5\u95ee\u9898\u65f6\u518d\u6253\u5f00\u8be6\u7ec6\u65e5\u5fd7"

    .line 21
    .line 22
    const-string v2, "debug_log"

    .line 23
    .line 24
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "\u8c03\u8bd5"

    .line 33
    .line 34
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsDevicePage;->createBody(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    filled-new-array {v0}, [Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "\u8bbe\u5907"

    .line 50
    .line 51
    invoke-virtual {p0, v1, v0}, Lcom/mr/elaris/InAppSettings;->card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
