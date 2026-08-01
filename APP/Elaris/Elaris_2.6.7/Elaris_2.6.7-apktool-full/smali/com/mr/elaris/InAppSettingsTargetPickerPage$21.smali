.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsTargetPickerPage;->troopPickRow(Lcom/mr/elaris/InAppSettings;Lz6;Ljava/util/LinkedHashSet;Landroid/widget/TextView;ILjava/lang/Runnable;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$count:I

.field final synthetic val$linkedHashSet:Ljava/util/LinkedHashSet;

.field final synthetic val$runnable:Ljava/lang/Runnable;

.field final synthetic val$textView:Landroid/widget/TextView;

.field final synthetic val$troopInfo:Lz6;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;Lz6;Landroid/widget/TextView;ILjava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$troopInfo:Lz6;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$textView:Landroid/widget/TextView;

    .line 6
    .line 7
    iput p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$count:I

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$runnable:Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$troopInfo:Lz6;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$textView:Landroid/widget/TextView;

    .line 6
    .line 7
    iget v3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$count:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$21;->val$runnable:Ljava/lang/Runnable;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->toggleTroopSelection(Ljava/util/LinkedHashSet;Lz6;Landroid/widget/TextView;ILjava/lang/Runnable;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
