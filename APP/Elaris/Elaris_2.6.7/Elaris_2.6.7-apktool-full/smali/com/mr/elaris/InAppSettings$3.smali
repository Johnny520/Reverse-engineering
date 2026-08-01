.class Lcom/mr/elaris/InAppSettings$3;
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

.field final synthetic val$previousViews:Ljava/util/ArrayList;

.field final synthetic val$transitionGeneration:I

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;ILjava/util/ArrayList;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettings$3;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput p2, p0, Lcom/mr/elaris/InAppSettings$3;->val$transitionGeneration:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettings$3;->val$previousViews:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettings$3;->val$view:Landroid/view/View;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings$3;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/InAppSettings;->a(Lcom/mr/elaris/InAppSettings;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Lcom/mr/elaris/InAppSettings$3;->val$transitionGeneration:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings$3;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/mr/elaris/InAppSettings;->b(Lcom/mr/elaris/InAppSettings;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings$3;->this$0:Lcom/mr/elaris/InAppSettings;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings$3;->val$previousViews:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings$3;->val$view:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v0, v1, p0}, Lcom/mr/elaris/InAppSettings;->removePreviousPagesAfterTransition(Ljava/util/List;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method
