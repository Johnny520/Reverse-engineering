.class Lcom/mr/elaris/InAppSettingsConfigBackupPage$4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsConfigBackupPage;->installResultHook()V
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
    if-ne p3, p0, :cond_3

    .line 3
    .line 4
    if-nez p4, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/16 p3, 0x2013

    .line 15
    .line 16
    if-ne p2, p3, :cond_2

    .line 17
    .line 18
    invoke-static {p1, p0}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->a(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    const/16 p3, 0x2014

    .line 23
    .line 24
    if-ne p2, p3, :cond_3

    .line 25
    .line 26
    invoke-static {p1, p0}, Lcom/mr/elaris/InAppSettingsConfigBackupPage;->b(Landroid/app/Activity;Landroid/net/Uri;)V

    .line 27
    .line 28
    .line 29
    :cond_3
    :goto_0
    return-void
.end method
