.class Lcom/mr/elaris/InAppSettingsRepeaterIconPage$5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->installRepeaterIconResultHook()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    if-ne p3, p0, :cond_1

    .line 3
    .line 4
    if-nez p4, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1, p4}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->b(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    :cond_1
    :goto_0
    return-void
.end method
