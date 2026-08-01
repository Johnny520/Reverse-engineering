.class Lcom/mr/elaris/InAppSettingsKeepFirePage$5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsKeepFirePage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$messageInput:Landroid/widget/EditText;

.field final synthetic val$next:Landroid/widget/TextView;

.field final synthetic val$selectedTargets:Landroid/widget/TextView;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$status:Landroid/widget/TextView;

.field final synthetic val$timeInput:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$timeInput:Landroid/widget/EditText;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$messageInput:Landroid/widget/EditText;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$status:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$next:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$selectedTargets:Landroid/widget/TextView;

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
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$timeInput:Landroid/widget/EditText;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$messageInput:Landroid/widget/EditText;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$status:Landroid/widget/TextView;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$next:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$selectedTargets:Landroid/widget/TextView;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-virtual/range {v0 .. v6}, Lcom/mr/elaris/InAppSettings;->saveKeepFireConfig(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$status:Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsKeepFirePage$5;->val$next:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p1, v0, p0, v6}, Lcom/mr/elaris/InAppSettings;->startManualKeepFire(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
