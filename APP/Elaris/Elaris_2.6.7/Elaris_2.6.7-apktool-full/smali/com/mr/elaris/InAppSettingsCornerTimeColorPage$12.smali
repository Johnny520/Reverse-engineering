.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$12;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->createHideOfficialRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Lcom/mr/elaris/InAppSettings$ToggleView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$12;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$12;->val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$12;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$12;->val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 4
    .line 5
    const-string v1, "hide_official_center_time"

    .line 6
    .line 7
    invoke-virtual {v0, p0, v1, p1}, Lcom/mr/elaris/InAppSettings;->toggleSwitchRow(Lcom/mr/elaris/InAppSettings$ToggleView;Ljava/lang/String;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
