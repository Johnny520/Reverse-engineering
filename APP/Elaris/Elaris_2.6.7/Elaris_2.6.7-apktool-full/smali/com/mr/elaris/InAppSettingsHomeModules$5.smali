.class Lcom/mr/elaris/InAppSettingsHomeModules$5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsHomeModules;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsHomeModules$5;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsHomeModules$5;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->openCleanseFeatures(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
