.class Lcom/mr/elaris/InAppSettingsWidgets$3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRowInternal(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$key:Ljava/lang/String;

.field final synthetic val$refreshAfterToggle:Z

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$showSaveToast:Z

.field final synthetic val$slot:Landroid/widget/FrameLayout;

.field final synthetic val$title:Ljava/lang/String;

.field final synthetic val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings$ToggleView;Lcom/mr/elaris/InAppSettings;Ljava/lang/String;ZLandroid/widget/FrameLayout;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$key:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$showSaveToast:Z

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$slot:Landroid/widget/FrameLayout;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$title:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$refreshAfterToggle:Z

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$key:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v2, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$showSaveToast:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1, v2}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$slot:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$title:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$toggle:Lcom/mr/elaris/InAppSettings$ToggleView;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    const-string v1, "\uff0c\u5df2\u5f00\u542f"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v1, "\uff0c\u5df2\u5173\u95ed"

    .line 47
    .line 48
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-boolean p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$refreshAfterToggle:Z

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsWidgets$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->refreshCurrentPage()V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method
