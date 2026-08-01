.class Lcom/mr/elaris/InAppSettings$4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettings;->replacePage(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$transitionGeneration:I


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettings$4;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput p2, p0, Lcom/mr/elaris/InAppSettings$4;->val$transitionGeneration:I

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
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings$4;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/InAppSettings;->a(Lcom/mr/elaris/InAppSettings;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/mr/elaris/InAppSettings$4;->val$transitionGeneration:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings$4;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/mr/elaris/InAppSettings;->b(Lcom/mr/elaris/InAppSettings;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings$4;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->keepElarisPageFocused()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
