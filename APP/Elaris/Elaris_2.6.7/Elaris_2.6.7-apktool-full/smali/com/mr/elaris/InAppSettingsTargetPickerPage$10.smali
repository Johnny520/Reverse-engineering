.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsTargetPickerPage;->showFriendPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$dialog:Landroid/app/AlertDialog;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$shown:[Z


# direct methods
.method public constructor <init>([ZLandroid/app/AlertDialog;Lcom/mr/elaris/InAppSettings;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;->val$shown:[Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;->val$dialog:Landroid/app/AlertDialog;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;->val$shown:[Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-boolean v2, v0, v1

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v2, 0x1

    .line 10
    aput-boolean v2, v0, v1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;->val$dialog:Landroid/app/AlertDialog;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 18
    .line 19
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$10;->val$dialog:Landroid/app/AlertDialog;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
