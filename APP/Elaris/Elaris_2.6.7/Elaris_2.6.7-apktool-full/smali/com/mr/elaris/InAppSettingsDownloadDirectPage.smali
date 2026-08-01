.class final Lcom/mr/elaris/InAppSettingsDownloadDirectPage;
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
    .locals 3

    .line 1
    const-string v0, "\u4e0b\u8f7d\u6587\u4ef6\u91cd\u5b9a\u5411"

    .line 2
    .line 3
    const-string v1, "\u5c06 QQ \u63a5\u6536\u6587\u4ef6\u56fa\u5b9a\u4fdd\u5b58\u5230 Download/QQ\uff0c\u907f\u514d\u843d\u5230 QQ \u79c1\u6709\u76ee\u5f55\uff1b\u91cd\u542f QQ \u540e\u751f\u6548"

    .line 4
    .line 5
    const-string v2, "direct_download_write"

    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
