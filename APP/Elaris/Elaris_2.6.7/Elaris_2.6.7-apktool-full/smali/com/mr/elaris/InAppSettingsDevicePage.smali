.class final Lcom/mr/elaris/InAppSettingsDevicePage;
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

.method public static createBody(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const-string v1, "\u5f3a\u5236\u5e73\u677f\u6a21\u5f0f"

    .line 13
    .line 14
    const-string v2, "\u8ba9 QQ \u6309\u5e73\u677f\u8bbe\u5907\u8bc6\u522b\uff0c\u9700\u91cd\u542f QQ"

    .line 15
    .line 16
    const-string v3, "force_tablet_mode"

    .line 17
    .line 18
    invoke-virtual {p0, v3, v1, v2}, Lcom/mr/elaris/InAppSettings;->switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method
