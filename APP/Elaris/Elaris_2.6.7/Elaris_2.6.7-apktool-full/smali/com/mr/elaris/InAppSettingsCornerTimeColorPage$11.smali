.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;
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
.field final synthetic val$dialog:Landroid/app/AlertDialog;

.field final synthetic val$selectedPattern:[Ljava/lang/String;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;[Ljava/lang/String;Landroid/app/AlertDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$selectedPattern:[Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$dialog:Landroid/app/AlertDialog;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$state:Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$PickerState;->color()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->c(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "chat_message_corner_time_color"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p1, v1, v0, v2}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$selectedPattern:[Ljava/lang/String;

    .line 22
    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    const-string v1, "chat_message_corner_time_format"

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0, v2}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lg1;->a()I

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lr0;->p()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lr0;->p()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$dialog:Landroid/app/AlertDialog;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->refreshCurrentPage()V

    .line 47
    .line 48
    .line 49
    return-void
.end method
