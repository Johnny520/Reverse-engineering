.class public LYue/ۥۡۢۦ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۥۥ;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;,
        LYue/ۥۡۢۦ۠$ۥ۟۟;,
        LYue/ۥۡۢۦ۠$ۥ;,
        LYue/ۥۡۢۦ۠$ۥ۟;,
        LYue/ۥۡۢۦ۠$ۥ۟۟۟;,
        LYue/ۥۡۢۦ۠$ۥ۟۟۟۠;,
        LYue/ۥۡۢۦ۠$ۥ۟۟۟ۡ;,
        LYue/ۥۡۢۦ۠$ۥ۟۟۟ۢ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public final ۥ۟:Landroid/app/Notification$Builder;

.field public final ۥ۟۟:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

.field public ۥ۟۟۟:Landroid/widget/RemoteViews;

.field public ۥ۟۟۟۟:Landroid/widget/RemoteViews;

.field public final ۥ۟۟۟۠:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:Landroid/os/Bundle;

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:Landroid/widget/RemoteViews;


# direct methods
.method public constructor <init>(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟۠:Ljava/util/List;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۡ:Landroid/os/Bundle;

    iput-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    iput-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ:Landroid/content/Context;

    iget-object v1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢ۟:Ljava/lang/String;

    invoke-static {v0, v1}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v2, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۨ:Landroid/app/Notification;

    iget-wide v3, v2, Landroid/app/Notification;->when:J

    invoke-virtual {v1, v3, v4}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v2, Landroid/app/Notification;->icon:I

    iget v5, v2, Landroid/app/Notification;->iconLevel:I

    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    iget-object v5, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۟:Landroid/widget/RemoteViews;

    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v2, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v2, Landroid/app/Notification;->ledARGB:I

    iget v5, v2, Landroid/app/Notification;->ledOnMS:I

    iget v6, v2, Landroid/app/Notification;->ledOffMS:I

    invoke-virtual {v3, v4, v5, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v2, Landroid/app/Notification;->flags:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v7

    :goto_0
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v2, Landroid/app/Notification;->flags:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    move v4, v7

    :goto_1
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v2, Landroid/app/Notification;->flags:I

    and-int/lit8 v4, v4, 0x10

    if-eqz v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v7

    :goto_2
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v2, Landroid/app/Notification;->defaults:I

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟۟:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟۠:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۢ:Landroid/app/PendingIntent;

    iget v8, v2, Landroid/app/Notification;->flags:I

    and-int/lit16 v8, v8, 0x80

    if-eqz v8, :cond_3

    move v8, v6

    goto :goto_3

    :cond_3
    move v8, v7

    :goto_3
    invoke-virtual {v3, v4, v8}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۦ:I

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۤ:I

    iget v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۥ:I

    iget-boolean v9, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۦ:Z

    invoke-virtual {v3, v4, v8, v9}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۤ:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v4, 0x0

    if-nez v3, :cond_4

    move-object v0, v4

    goto :goto_4

    :cond_4
    invoke-virtual {v3, v0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۥ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    :goto_4
    invoke-static {v1, v0}, LYue/ۥۡۢۦ۠$ۥ۟۟;->ۥ۟(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۡ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-boolean v1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠:Z

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    iget v1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۧ:I

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠۠:LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;

    instance-of v1, v0, LYue/ۥۡۢۦ$ۥ۟۟۠;

    if-eqz v1, :cond_5

    check-cast v0, LYue/ۥۡۢۦ$ۥ۟۟۠;

    invoke-virtual {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟ۡۢ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۢۦ$ۥ۟;

    invoke-virtual {p0, v1}, LYue/ۥۡۢۦ۠;->ۥ۟(LYue/ۥۡۢۦ$ۥ۟;)V

    goto :goto_5

    :cond_5
    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۢۦ$ۥ۟;

    invoke-virtual {p0, v1}, LYue/ۥۡۢۦ۠;->ۥ۟(LYue/ۥۡۢۦ$ۥ۟;)V

    goto :goto_6

    :cond_6
    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟ۡ:Landroid/os/Bundle;

    if-eqz v0, :cond_7

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۡ:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۧ:Landroid/widget/RemoteViews;

    iput-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟:Landroid/widget/RemoteViews;

    iget-object v1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۨ:Landroid/widget/RemoteViews;

    iput-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟۟:Landroid/widget/RemoteViews;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-boolean v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۨ:Z

    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-boolean v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۟:Z

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ;->ۥۣ۟۟۟(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ;->ۥ۟۟۟ۡ(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ;->ۥ۟۟۟ۤ(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-boolean v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۨ:Z

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ;->ۥ۟۟۟ۢ(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget v1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۤ:I

    iput v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۢ:I

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ۟;->ۥ۟(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۤ:I

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ۟;->ۥ۟۟(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۥ:I

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ۟;->ۥ۟۟۟۠(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۦ:Landroid/app/Notification;

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ۟;->ۥ۟۟۟(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v3, v2, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v8, v2, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {v1, v3, v8}, LYue/ۥۡۢۦ۠$ۥ۟;->ۥ۟۟۟۟(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_8

    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-static {v0}, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۡ(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-static {v0, v3}, LYue/ۥۡۢۦ۠;->ۥ۟۟۟۟(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_7

    :cond_8
    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    :goto_7
    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v8, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, LYue/ۥۡۢۦ۠$ۥ۟;->ۥ(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_8

    :cond_9
    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢ:Landroid/widget/RemoteViews;

    iput-object v0, p0, LYue/ۥۡۢۦ۠;->ۥۣ۟۟۟:Landroid/widget/RemoteViews;

    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_c

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠()Landroid/os/Bundle;

    move-result-object v0

    const-string v3, "android.car.EXTENSIONS"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_a

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_a
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    move v10, v7

    :goto_9
    iget-object v11, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_b

    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iget-object v12, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۟:Ljava/util/ArrayList;

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LYue/ۥۡۢۦ$ۥ۟;

    invoke-static {v12}, LYue/ۥۡۢۦۢ;->ۥ۟۟۟ۤ(LYue/ۥۡۢۦ$ۥ۟;)Landroid/os/Bundle;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_b
    const-string v10, "invisible_actions"

    invoke-virtual {v0, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۡ:Landroid/os/Bundle;

    invoke-virtual {v0, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۟:Ljava/lang/Object;

    if-eqz v3, :cond_d

    iget-object v8, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟;->ۥ۟۟(Landroid/app/Notification$Builder;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    :cond_d
    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟ۡ:Landroid/os/Bundle;

    invoke-virtual {v3, v8}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:[Ljava/lang/CharSequence;

    invoke-static {v3, v8}, LYue/ۥۡۢۦ۠$ۥ۟۟۟;->ۥ۟۟۟۟(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۧ:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_e

    iget-object v8, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟;->ۥ۟۟(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_e
    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۨ:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_f

    iget-object v8, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟;->ۥ۟(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_f
    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢ:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_10

    iget-object v8, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟;->ۥ۟۟۟(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_10
    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢ۠:I

    invoke-static {v3, v8}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ۟(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۢ:Ljava/lang/CharSequence;

    invoke-static {v3, v8}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ۟۟۟۟(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۡ:Ljava/lang/String;

    invoke-static {v3, v8}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ۟۟۟۠(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-wide v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟ۢ:J

    invoke-static {v3, v8, v9}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ۟۟۟ۡ(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۤ:I

    invoke-static {v3, v8}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ۟۟۟(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-boolean v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۡ:Z

    if-eqz v3, :cond_11

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-boolean v8, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۠:Z

    invoke-static {v3, v8}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ۟۟(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    :cond_11
    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢ۟:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_12

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, v7, v7, v7}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_12
    if-lt v0, v1, :cond_13

    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۤ۠ۥ;

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-virtual {v1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v1

    invoke-static {v3, v1}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۠;->ۥ(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_a

    :cond_13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_14

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-boolean v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۦ:Z

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟ۡ;->ۥ(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۧ:LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;

    invoke-static {v3}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۥ(LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;)Landroid/app/Notification$BubbleMetadata;

    move-result-object v3

    invoke-static {v1, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟ۡ;->ۥ۟(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    iget-object v1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۢ:LYue/ۥ۠ۨۡ۠;

    if-eqz v1, :cond_14

    iget-object v3, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-virtual {v1}, LYue/ۥ۠ۨۡ۠;->ۥ۟۟()Landroid/content/LocusId;

    move-result-object v1

    invoke-static {v3, v1}, LYue/ۥۡۢۦ۠$ۥ۟۟۟ۡ;->ۥ۟۟۟(Landroid/app/Notification$Builder;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    :cond_14
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_15

    iget v0, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۢۥ:I

    if-eqz v0, :cond_15

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-static {v1, v0}, LYue/ۥۡۢۦ۠$ۥ۟۟۟ۢ;->ۥ۟(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    :cond_15
    iget-boolean p1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟:Z

    if-eqz p1, :cond_18

    iget-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-boolean p1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۨ:Z

    if-eqz p1, :cond_16

    iput v5, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۢ:I

    goto :goto_b

    :cond_16
    iput v6, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۢ:I

    :goto_b
    iget-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    iget-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    iget p1, v2, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, -0x4

    iput p1, v2, Landroid/app/Notification;->defaults:I

    iget-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    iget-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object p1, p1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_17

    iget-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    const-string v0, "silent"

    invoke-static {p1, v0}, LYue/ۥۡۢۦ۠$ۥ;->ۥ۟۟۟ۡ(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_17
    iget-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    iget v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟۟ۢ:I

    invoke-static {p1, v0}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۟;->ۥ۟۟۟(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    :cond_18
    return-void
.end method

.method public static ۥ۟۟۟۟(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .param p0    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance v0, LYue/ۥ۟ۡۨۦ;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, LYue/ۥ۟ۡۨۦ;-><init>(I)V

    invoke-virtual {v0, p0}, LYue/ۥ۟ۡۨۦ;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۨۦ;->addAll(Ljava/util/Collection;)Z

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .param p0    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e4\u06e0\u06e5;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public ۥ()Landroid/app/Notification$Builder;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    return-object v0
.end method

.method public final ۥ۟(LYue/ۥۡۢۦ$ۥ۟;)V
    .locals 5

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟۠()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۤ()Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۤ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-static {v0, v1, v2}, LYue/ۥۡۢۦ۠$ۥ۟۟;->ۥ(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۡ()[LYue/ۥۡۦۣۨ;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۡ()[LYue/ۥۡۦۣۨ;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟([LYue/ۥۡۦۣۨ;)[Landroid/app/RemoteInput;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-static {v0, v4}, LYue/ۥۡۢۦ۠$ۥ;->ۥ۟۟(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v1, Landroid/os/Bundle;

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :goto_2
    const-string v2, "android.support.allowGeneratedReplies"

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟()Z

    move-result v3

    invoke-static {v0, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟;->ۥ(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    const-string v3, "android.support.action.semanticAction"

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۢ()I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_3

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۢ()I

    move-result v3

    invoke-static {v0, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟۠;->ۥ۟(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    :cond_3
    const/16 v3, 0x1d

    if-lt v2, v3, :cond_4

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۦ()Z

    move-result v3

    invoke-static {v0, v3}, LYue/ۥۡۢۦ۠$ۥ۟۟۟ۡ;->ۥ۟۟(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_4
    const/16 v3, 0x1f

    if-lt v2, v3, :cond_5

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۥ()Z

    move-result v2

    invoke-static {v0, v2}, LYue/ۥۡۢۦ۠$ۥ۟۟۟ۢ;->ۥ(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_5
    const-string v2, "android.support.action.showsUserInterface"

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥۣ۟۟۟()Z

    move-result p1

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {v0, v1}, LYue/ۥۡۢۦ۠$ۥ;->ۥ۟(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    iget-object p1, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-static {v0}, LYue/ۥۡۢۦ۠$ۥ;->ۥ۟۟۟(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥۡۢۦ۠$ۥ;->ۥ(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    return-void
.end method

.method public ۥ۟۟()Landroid/app/Notification;
    .locals 3

    iget-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠۠:LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟(LYue/ۥۡۢۥۥ;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠ۦ(LYue/ۥۡۢۥۥ;)Landroid/widget/RemoteViews;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, LYue/ۥۡۢۦ۠;->ۥ۟۟۟()Landroid/app/Notification;

    move-result-object v2

    if-eqz v1, :cond_2

    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    goto :goto_1

    :cond_2
    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v1, v1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۧ:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_3

    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0, p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠ۥ(LYue/ۥۡۢۥۥ;)Landroid/widget/RemoteViews;

    move-result-object v1

    if-eqz v1, :cond_4

    iput-object v1, v2, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_4
    if-eqz v0, :cond_5

    iget-object v1, p0, LYue/ۥۡۢۦ۠;->ۥ۟۟:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v1, v1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠۠:LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;

    invoke-virtual {v1, p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠ۧ(LYue/ۥۡۢۥۥ;)Landroid/widget/RemoteViews;

    move-result-object v1

    if-eqz v1, :cond_5

    iput-object v1, v2, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    :cond_5
    if-eqz v0, :cond_6

    invoke-static {v2}, LYue/ۥۡۢۦ;->ۥ۟۟۟ۨ(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ(Landroid/os/Bundle;)V

    :cond_6
    return-object v2
.end method

.method public ۥ۟۟۟()Landroid/app/Notification;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ۟:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۦ۠;->ۥ:Landroid/content/Context;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ(Landroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    iget v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x4

    iput v0, p1, Landroid/app/Notification;->defaults:I

    return-void
.end method
