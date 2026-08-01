.class Lcom/mr/elaris/InAppSettingsWidgets$7;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsWidgets;->createSettingItemSized(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;ZFFFFF)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$clickHandler:Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;

.field final synthetic val$toggleView:Lcom/mr/elaris/InAppSettings$ToggleView;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;Lcom/mr/elaris/InAppSettings$ToggleView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$7;->val$clickHandler:Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsWidgets$7;->val$toggleView:Lcom/mr/elaris/InAppSettings$ToggleView;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsWidgets$7;->val$clickHandler:Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsWidgets$7;->val$toggleView:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 6
    .line 7
    invoke-interface {v0, p0, p1}, Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;->onClick(Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
