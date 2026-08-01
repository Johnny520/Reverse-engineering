.class Lcom/mr/elaris/InAppSettingsWidgets$6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsWidgets;->createSettingItemSized(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFFFF)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$normalHeightDp:F

.field final synthetic val$row:Landroid/widget/LinearLayout;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$summary:Landroid/widget/TextView;

.field final synthetic val$twoLineHeightDp:F


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$row:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$summary:Landroid/widget/TextView;

    .line 6
    .line 7
    iput p4, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$twoLineHeightDp:F

    .line 8
    .line 9
    iput p5, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$normalHeightDp:F

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$row:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$summary:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/widget/TextView;->getLineCount()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-le v2, v3, :cond_0

    .line 13
    .line 14
    iget p0, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$twoLineHeightDp:F

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget p0, p0, Lcom/mr/elaris/InAppSettingsWidgets$6;->val$normalHeightDp:F

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v1, p0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v0, p0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
