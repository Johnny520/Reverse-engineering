.class Lcom/mr/elaris/InAppSettingsPicSummaryPage$4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsPicSummaryPage;->showDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mr/elaris/InAppSettingsPicSummaryPage;

.field final synthetic val$dialog:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsPicSummaryPage;Landroid/app/AlertDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage$4;->this$0:Lcom/mr/elaris/InAppSettingsPicSummaryPage;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage$4;->val$dialog:Landroid/app/AlertDialog;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage$4;->this$0:Lcom/mr/elaris/InAppSettingsPicSummaryPage;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsPicSummaryPage;->a(Lcom/mr/elaris/InAppSettingsPicSummaryPage;)Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsPicSummaryPage$4;->val$dialog:Landroid/app/AlertDialog;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lcom/mr/elaris/InAppSettings;->applyDialogWindowStyle(Landroid/app/AlertDialog;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
