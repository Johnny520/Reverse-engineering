.class Lcom/mr/elaris/InAppSettingsFocusHelpers$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsFocusHelpers;->refocusElarisPage(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsFocusHelpers$1;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsFocusHelpers$1;->val$view:Landroid/view/View;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsFocusHelpers$1;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsFocusHelpers$1;->val$view:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/mr/elaris/InAppSettings;->refocusElarisPageNow(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
