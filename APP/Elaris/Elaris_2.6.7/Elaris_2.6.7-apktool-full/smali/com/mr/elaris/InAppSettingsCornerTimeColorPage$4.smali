.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$refresh:Ljava/lang/Runnable;

.field final synthetic val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

.field final synthetic val$syncing:[Z


# direct methods
.method public constructor <init>([ZLcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;->val$syncing:[Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;->val$refresh:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onColorChanged(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;->val$syncing:[Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-boolean v0, v0, v1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->hsv:[F

    .line 12
    .line 13
    aput p1, v0, v1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aput p2, v0, p1

    .line 17
    .line 18
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$4;->val$refresh:Ljava/lang/Runnable;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
