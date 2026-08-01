.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->createTimeSwitchRow(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;
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
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$1;->val$settings:Lcom/mr/elaris/InAppSettings;

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
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$1;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->d(Lcom/mr/elaris/InAppSettings;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
