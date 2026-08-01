.class Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsRepeaterModePage;->repeaterModeRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/app/AlertDialog;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$dialog:Landroid/app/AlertDialog;

.field final synthetic val$mode:Ljava/lang/String;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$toggleView:Lcom/mr/elaris/InAppSettings$ToggleView;


# direct methods
.method public constructor <init>(Landroid/app/AlertDialog;Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Lcom/mr/elaris/InAppSettings$ToggleView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$dialog:Landroid/app/AlertDialog;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$mode:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$toggleView:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$dialog:Landroid/app/AlertDialog;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$mode:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const-string v2, "message_repeater_mode"

    .line 14
    .line 15
    invoke-virtual {p1, v2, v0, v1}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$toggleView:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$toggleView:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 33
    .line 34
    const-string v1, "message_repeater"

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0, v0}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsRepeaterModePage;->updateSummaryView(Lcom/mr/elaris/InAppSettings;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 45
    .line 46
    const-string v0, "double"

    .line 47
    .line 48
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsRepeaterModePage$3;->val$mode:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    const-string p0, "\u5df2\u5207\u6362\u4e3a\u53cc\u51fb\u590d\u8bfb"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const-string p0, "\u5df2\u5207\u6362\u4e3a\u5355\u51fb\u590d\u8bfb"

    .line 60
    .line 61
    :goto_0
    invoke-virtual {p1, p0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
