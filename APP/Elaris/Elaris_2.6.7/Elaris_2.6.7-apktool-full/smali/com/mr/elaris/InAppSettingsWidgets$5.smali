.class Lcom/mr/elaris/InAppSettingsWidgets$5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsWidgets;->settingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$listener:Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$5;->val$listener:Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsWidgets$5;->val$listener:Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0, v0, p2}, Lcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;->onCheckedChange(ZLandroid/view/View;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
