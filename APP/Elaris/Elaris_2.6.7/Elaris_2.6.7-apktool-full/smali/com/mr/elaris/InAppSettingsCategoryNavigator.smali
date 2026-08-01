.class final Lcom/mr/elaris/InAppSettingsCategoryNavigator;
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

.method private static open(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->showCategory(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static openCleanse(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    const-string v0, "cleanse"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->open(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static openGroup(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    const-string v0, "groupfile"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->open(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static openMessage(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    const-string v0, "chat_message"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->open(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static openMisc(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    const-string v0, "misc"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->open(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static openPicture(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    const-string v0, "picture"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->open(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static openRepeater(Lcom/mr/elaris/InAppSettings;)V
    .locals 1

    .line 1
    const-string v0, "repeater"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->open(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
