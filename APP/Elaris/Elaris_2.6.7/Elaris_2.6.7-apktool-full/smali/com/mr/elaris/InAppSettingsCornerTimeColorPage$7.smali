.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$alpha:Landroid/widget/SeekBar;

.field final synthetic val$brightness:Landroid/widget/SeekBar;

.field final synthetic val$palette:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;

.field final synthetic val$refresh:Ljava/lang/Runnable;

.field final synthetic val$selected:I

.field final synthetic val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

.field final synthetic val$syncing:[Z


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;I[ZLcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 2
    .line 3
    iput p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$selected:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$syncing:[Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$palette:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$brightness:Landroid/widget/SeekBar;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$alpha:Landroid/widget/SeekBar;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$refresh:Ljava/lang/Runnable;

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
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 2
    .line 3
    iget v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$selected:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$syncing:[Z

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    aput-boolean v0, p1, v1

    .line 13
    .line 14
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$palette:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;

    .line 15
    .line 16
    iget v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$selected:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$ColorPaletteView;->setColor(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$brightness:Landroid/widget/SeekBar;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->hsv:[F

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    aget v0, v0, v2

    .line 29
    .line 30
    const/high16 v2, 0x42c80000    # 100.0f

    .line 31
    .line 32
    mul-float/2addr v0, v2

    .line 33
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$alpha:Landroid/widget/SeekBar;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 43
    .line 44
    iget v0, v0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->alpha:I

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$syncing:[Z

    .line 50
    .line 51
    aput-boolean v1, p1, v1

    .line 52
    .line 53
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$7;->val$refresh:Ljava/lang/Runnable;

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 56
    .line 57
    .line 58
    return-void
.end method
