.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsTargetPickerPage;->showTroopPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$arrayList:Ljava/util/ArrayList;

.field final synthetic val$linkedHashSet:Ljava/util/LinkedHashSet;

.field final synthetic val$rowContainer:Landroid/widget/LinearLayout;

.field final synthetic val$runnableArr:[Ljava/lang/Runnable;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$summary:Landroid/widget/TextView;

.field final synthetic val$troopList:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/List;[Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$rowContainer:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$arrayList:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$summary:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$troopList:Ljava/util/List;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$runnableArr:[Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$rowContainer:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$arrayList:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$summary:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$troopList:Ljava/util/List;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$12;->val$runnableArr:[Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-static/range {v0 .. v6}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->refreshTroopPickerRows(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/List;[Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
