.class Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->handleRepeaterIconActivityResult(Landroid/app/Activity;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$input:Landroid/widget/EditText;

.field final synthetic val$path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;->val$input:Landroid/widget/EditText;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;->val$path:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;->val$input:Landroid/widget/EditText;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;->val$path:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;->val$input:Landroid/widget/EditText;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsRepeaterIconPage$6;->val$path:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {v0, p0}, Landroid/widget/EditText;->setSelection(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
