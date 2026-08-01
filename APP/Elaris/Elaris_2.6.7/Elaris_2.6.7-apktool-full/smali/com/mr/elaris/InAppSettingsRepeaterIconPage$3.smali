.class Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$dialog:Landroid/app/AlertDialog;

.field final synthetic val$pathInput:Landroid/widget/EditText;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/app/AlertDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;->val$pathInput:Landroid/widget/EditText;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;->val$dialog:Landroid/app/AlertDialog;

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
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;->val$pathInput:Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->a(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$3;->val$dialog:Landroid/app/AlertDialog;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
