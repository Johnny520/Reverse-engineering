.class public final Landroidx/compose/ui/adaptive/飘花落叶言子楪世哲苏兰;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string p0, "android.intent.extra.DOCK_STATE"

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p2, p0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    throw p0
.end method
