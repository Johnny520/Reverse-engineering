.class final Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PickerState"
.end annotation


# instance fields
.field alpha:I

.field final hsv:[F


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    new-array v0, v0, [F

    .line 6
    .line 7
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->hsv:[F

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->setColor(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public color()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->alpha:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->hsv:[F

    .line 4
    .line 5
    invoke-static {v0, p0}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->hsv:[F

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->alpha:I

    .line 11
    .line 12
    return-void
.end method
