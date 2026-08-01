.class Lcom/mr/elaris/InAppSettingsClockInPage$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsClockInPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$count:Landroid/widget/TextView;

.field final synthetic val$selected:Landroid/widget/TextView;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsClockInPage$2;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsClockInPage$2;->val$count:Landroid/widget/TextView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsClockInPage$2;->val$selected:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsClockInPage$2;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsClockInPage$2;->val$count:Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsClockInPage$2;->val$selected:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p0, p1}, Lcom/mr/elaris/InAppSettings;->openClockInGroupPicker(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
