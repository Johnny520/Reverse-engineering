.class Lcom/mr/elaris/InAppSettings$7;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettings;->runManualClockInWorker(Ljava/lang/String;Ljava/util/List;Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$result:Ly6;

.field final synthetic val$textView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Ly6;Landroid/widget/TextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettings$7;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettings$7;->val$result:Ly6;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettings$7;->val$textView:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings$7;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings$7;->val$result:Ly6;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings$7;->val$textView:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p0}, Lcom/mr/elaris/InAppSettings;->finishManualClockIn(Ly6;Landroid/widget/TextView;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
