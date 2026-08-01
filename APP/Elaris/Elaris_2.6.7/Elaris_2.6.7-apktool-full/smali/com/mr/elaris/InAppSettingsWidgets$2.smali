.class Lcom/mr/elaris/InAppSettingsWidgets$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lcom/mr/elaris/InAppSettingsWidgets$ToggleClickHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsWidgets;->switchDetailRowInternal(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$detailListener:Landroid/view/View$OnClickListener;

.field final synthetic val$key:Ljava/lang/String;

.field final synthetic val$refreshAfterToggle:Z

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$showSaveToast:Z


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;ZZLandroid/view/View$OnClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$key:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$showSaveToast:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$refreshAfterToggle:Z

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$detailListener:Landroid/view/View$OnClickListener;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onClick(Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$key:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$showSaveToast:Z

    .line 16
    .line 17
    invoke-virtual {p1, v0, p2, v1}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$refreshAfterToggle:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->refreshCurrentPage()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsWidgets$2;->val$detailListener:Landroid/view/View$OnClickListener;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-interface {p0, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method
