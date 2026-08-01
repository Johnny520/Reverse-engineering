.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;
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

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;->val$dialog:Landroid/app/AlertDialog;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    const-string v0, "chat_message_corner_time_color"

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v0, v1, v2}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 12
    .line 13
    const-string v0, "chat_message_corner_time_format"

    .line 14
    .line 15
    const-string v1, "ah:mm"

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1, v2}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lg1;->a()I

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lr0;->p()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lr0;->p()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;->val$dialog:Landroid/app/AlertDialog;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$9;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->refreshCurrentPage()V

    .line 37
    .line 38
    .line 39
    return-void
.end method
