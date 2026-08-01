.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

.field final synthetic val$friendList:Ljava/util/ArrayList;

.field final synthetic val$linkedHashSet:Ljava/util/LinkedHashSet;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$textView:Landroid/widget/TextView;

.field final synthetic val$textView2:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/ArrayList;Landroid/app/AlertDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$textView:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$textView2:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$friendList:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$dialog:Landroid/app/AlertDialog;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$textView:Landroid/widget/TextView;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$textView2:Landroid/widget/TextView;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$friendList:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$9;->val$dialog:Landroid/app/AlertDialog;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-static/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->saveFriendPickerSelection(Lcom/mr/elaris/InAppSettings;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
