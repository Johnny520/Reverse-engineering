.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;
.super Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$SimpleSeekListener;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


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

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;->val$syncing:[Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;->val$refresh:Ljava/lang/Runnable;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$SimpleSeekListener;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;->val$syncing:[Z

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    aget-boolean p1, p1, p3

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 10
    .line 11
    iput p2, p1, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->alpha:I

    .line 12
    .line 13
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$6;->val$refresh:Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
