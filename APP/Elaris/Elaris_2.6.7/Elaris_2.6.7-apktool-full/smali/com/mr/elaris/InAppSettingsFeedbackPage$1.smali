.class Lcom/mr/elaris/InAppSettingsFeedbackPage$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsFeedbackPage;->linkRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsFeedbackPage$1;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsFeedbackPage$1;->val$url:Ljava/lang/String;

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
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsFeedbackPage$1;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsFeedbackPage$1;->val$url:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lcom/mr/elaris/InAppSettingsFeedbackPage;->openExternalLink(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
